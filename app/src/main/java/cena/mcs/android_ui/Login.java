package cena.mcs.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) this.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(v -> {
            Intent login = new Intent(Login.this, Avatar.class);
            Login.this.startActivity(login);
            finish();
        });

        Button btnReg = (Button) this.findViewById(R.id.buttonReg);

        btnReg.setOnClickListener(v -> {
            Intent regist = new Intent(Login.this, Register.class);
            Login.this.startActivity(regist);
            finish();
        });
    }
}