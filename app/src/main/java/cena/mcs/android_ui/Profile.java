package cena.mcs.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView firstname = (TextView) findViewById(R.id.userFirst);
        TextView uname = (TextView) findViewById(R.id.userName);
        TextView usermail = (TextView) findViewById(R.id.userMail);
        TextView userphone = (TextView) findViewById(R.id.userPhone);

        Intent intent = getIntent();
        String fname = intent.getStringExtra ("firstname");
        String username = intent.getStringExtra ("username");
        String mail = intent.getStringExtra ("email");
        String phone = intent.getStringExtra ("phone");

        firstname.setText(fname);
        uname.setText(username);
        usermail.setText(mail);
        userphone.setText(phone);

        Button logout = (Button) this.findViewById(R.id.btLogout);
        logout.setOnClickListener((View.OnClickListener) v -> Profile.this.finish());

        Button btnava = (Button) this.findViewById(R.id.btAvatar);
        btnava.setOnClickListener(v -> {
            Intent ava = new Intent(Profile.this, Avatar.class);
            Profile.this.startActivity(ava);
            finish();
        });
    }
}