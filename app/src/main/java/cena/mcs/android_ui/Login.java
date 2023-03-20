package cena.mcs.android_ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static final int reqCode = 0;
    String _tempUname, _tempPass;
    String _tempMail, _tempPhone, _tempFirst;
    EditText _username, _userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _username = (EditText) findViewById(R.id.editTextUsername);
        _userpass = (EditText) findViewById(R.id.editTextPassword);
        Button btnLogin = (Button) this.findViewById(R.id.btnLogin);

//        Intent dataProfile = getIntent();
//        String data1 = dataProfile.getStringExtra ("name");
//        String data2 = dataProfile.getStringExtra ("uname");
//        String data3 = dataProfile.getStringExtra ("email");
//        String data4 = dataProfile.getStringExtra ("uphone");

        btnLogin.setOnClickListener(v -> {
//            Intent login = new Intent(Login.this, Profile.class);
//            Login.this.startActivity(login);
//            finish();

            String name = _username.getText().toString();
            String pas = _userpass.getText().toString();

            if (TextUtils.isEmpty(name) && TextUtils.isEmpty(pas)) {
                Toast.makeText(Login.this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
            else if (!_tempUname.equals(name) && _tempPass.equals(pas)) {
                Toast.makeText(Login.this, "Email Salah", Toast.LENGTH_SHORT).show();
            }
            else if (_tempUname.equals(name) && !_tempPass.equals(pas)) {
                Toast.makeText(Login.this, "Password Salah", Toast.LENGTH_SHORT).show();
            }
            else if (_tempUname.equals(name) && _tempPass.equals(pas)) {
                Intent menu = new Intent(Login.this, Profile.class);
//                startActivity(menu);

//                Bundle data = getIntent().getExtras();
//                String data1 = data.getString("name");
//                String data2 = data.getString("email");
//                String data3 = data.getString("uname");
//                String data4 = data.getString("uphone");

                menu.putExtra("name", _tempFirst);
                menu.putExtra("email", _tempMail);
                menu.putExtra("uname", _tempUname);
                menu.putExtra("uphone", _tempPhone);

//                String dataname, datamail, datausername, datanumphone;
//                String tempname, tempmail, tempusername, tempnumphone;
//                dataname = tempname.getText().toString();
//                datamail = tempmail.getText().toString();
//                datausername = tempusername.getText().toString();
//                datanumphone = tempnumphone.getText().toString();
//
//                Intent regis = new Intent();
//                menu.putExtra("name", fname);
//                menu.putExtra("email", umail);
//                menu.putExtra("uname", username);
//                menu.putExtra("uphone", phone);
                startActivity(menu);
//
//                setResult(RESULT_OK, regis);
//                finish();

//                finish();
            }
        });

        Button btnReg = (Button) this.findViewById(R.id.buttonReg);

        btnReg.setOnClickListener(v -> {
//            Intent regist = new Intent(Login.this, Register.class);
//            Login.this.startActivity(regist);
//            finish();

            Intent reg = new Intent(Login.this, Register.class);
            reg.putExtra("login", 0);
            this.startActivityForResult(reg, reqCode);
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == reqCode) {
            if (resultCode == RESULT_OK) {
                _tempUname = data.getStringExtra("uname");
                _tempPass = data.getStringExtra("password");
                _tempMail = data.getStringExtra("email");
                _tempPhone = data.getStringExtra("uphone");
                _tempFirst = data.getStringExtra("name");
                _username.setText(_tempUname);
                _userpass.setText(_tempPass);
            }
        }
    }
}