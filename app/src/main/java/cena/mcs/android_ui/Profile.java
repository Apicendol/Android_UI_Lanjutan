package cena.mcs.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
        String fname = intent.getStringExtra ("name");
        String username = intent.getStringExtra ("uname");
        String mail = intent.getStringExtra ("email");
        String phone = intent.getStringExtra ("uphone");

        firstname.setText(fname);
        uname.setText(username);
        usermail.setText(mail);
        userphone.setText(phone);

        Button logout = (Button) this.findViewById(R.id.btLogout);
        logout.setOnClickListener(v -> {
//            Intent Logout = new Intent(Profile.this, Login.class);
//            Profile.this.startActivity(Logout);
//            Profile.this.finish();
            finish();
        });

        Button btnava = (Button) this.findViewById(R.id.btAvatar);
        btnava.setOnClickListener(v -> {
            Intent ava = new Intent(Profile.this, Avatar.class);
            Profile.this.startActivity(ava);
//            finish();
        });

//        Button send = (Button) this.findViewById(R.id.btSend);
//        send.setOnClickListener(v -> {
//            Uri uri = Uri.parse("https://classroom.google.com/u/2/c/NTQyNTAxMzA5MjMx/a/NTk5NTY0MDQ1NjYw/details");
//            Intent it = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(it);
//        });

        Button send = (Button) this.findViewById(R.id.SendData);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contact = "+6281289083511";
                String text = "Hello";
                String url = "https://api.whatsapp.com/send?phone=" + contact + "&text=" + text;
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

//                Uri uri = Uri.parse("https://classroom.google.com/u/2/c/NTQyNTAxMzA5MjMx/a/NTk5NTY0MDQ1NjYw/details");
//                Intent it = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(it);

//                Uri uri = Uri.parse("http://filkom.ub.ac.id");
//                Intent it = new Intent(Intent.ACTION_VIEW, uri);
//                Profile.this.startActivity(it);

//                String url = "http://filkom.ub.ac.id";
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
            }
        });
    }
}