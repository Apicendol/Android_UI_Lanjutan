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

        Button btnLogin = (Button) this.findViewById(R.id.buttonLog);

        btnLogin.setOnClickListener(v -> {
            Intent login = new Intent(Register.this, Login.class);
            Register.this.startActivity(login);
            finish();
        });

        Button btnSave = (Button) findViewById(R.id.buttonSave);

        btnSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText UserFirst = (EditText) findViewById(R.id.editTextPersonFirst);
                EditText UserName = (EditText) findViewById(R.id.editTextPersonUsername);
                EditText UserMail = (EditText) findViewById(R.id.editTextEmail);
                EditText Phone = (EditText) findViewById(R.id.editTextUserPhone);
                Intent intent = new Intent(Register.this, Profile.class);
                intent.putExtra("firstname", UserFirst.getText().toString());
                intent.putExtra("username", UserName.getText().toString());
                intent.putExtra("email", UserMail.getText().toString());
                intent.putExtra("phone", Phone.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}