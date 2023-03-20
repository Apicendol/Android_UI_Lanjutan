package cena.mcs.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        Button btnLogin = (Button) this.findViewById(R.id.buttonBck);

        btnLogin.setOnClickListener(v -> {
//            Intent login = new Intent(Register.this, Login.class);
//            Register.this.startActivity(login);
            finish();
        });

        Button btnSave = (Button) findViewById(R.id.buttonSave);

        btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText userFirst = (EditText) findViewById(R.id.editTextUsername);
                EditText userName = (EditText) findViewById(R.id.editTextPersonUsername);
                EditText userMail = (EditText) findViewById(R.id.editTextEmail);
                EditText phone = (EditText) findViewById(R.id.editTextUserPhone);
                EditText password = (EditText) findViewById(R.id.editTextPw);
//                Intent intent = new Intent(Register.this, Profile.class);
//                intent.putExtra("firstname", UserFirst.getText().toString());
//                intent.putExtra("username", UserName.getText().toString());
//                intent.putExtra("email", UserMail.getText().toString());
//                intent.putExtra("phone", Phone.getText().toString());
//                startActivity(intent);
//                finish();

                String name, mail, username, numphone, pass;
                name = userFirst.getText().toString();
                mail = userMail.getText().toString();
                username = userName.getText().toString();
                numphone = phone.getText().toString();
                pass = password.getText().toString();

                Intent regis = new Intent();
                regis.putExtra("name", name);
                regis.putExtra("email", mail);
                regis.putExtra("uname", username);
                regis.putExtra("uphone", numphone);
                regis.putExtra("password", pass);

                setResult(RESULT_OK, regis);
                finish();
            }
        });
    }
}