package cena.mcs.android_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.net.URLEncoder;

public class Avatar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avatar);

        Button btBack = (Button) this.findViewById(R.id.btBack);
        btBack.setOnClickListener((View.OnClickListener) v -> Avatar.this.finish());

        Button btsenddata = (Button) this.findViewById(R.id.btSend);
        btsenddata.setOnClickListener(v -> {
            String contact = "+6281289083511";
            String text = "Hello";
            String url = "https://api.whatsapp.com/send?phone=" + contact + "&text=" + text;
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

//        Button btnProfile = (Button) this.findViewById(R.id.btProfile);
//
//        btnProfile.setOnClickListener(v -> {
//            Intent profile = new Intent(Avatar.this, Profile.class);
//            Avatar.this.startActivity(profile);
//            finish();
//        });

        CheckBox _eyebrows = findViewById(R.id.eyebrows);
        ImageView _imgAlis = findViewById(R.id.imgAlis);

        CheckBox _eyes = findViewById(R.id.eyes);
        ImageView _imgMata = findViewById(R.id.imgMata);

        CheckBox _nose = findViewById(R.id.nose);
        ImageView _imgHidung = findViewById(R.id.imgHidung);

        CheckBox _mouth = findViewById(R.id.mouth);
        ImageView _imgMulut = findViewById(R.id.imgMulut);

        _eyebrows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_imgAlis.getVisibility() == View.INVISIBLE) {
                    _imgAlis.setVisibility(View.VISIBLE);
                } else {
                    _imgAlis.setVisibility(View.INVISIBLE);
                }
            }
        });
        _eyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_imgMata.getVisibility() == View.INVISIBLE) {
                    _imgMata.setVisibility(View.VISIBLE);
                } else {
                    _imgMata.setVisibility(View.INVISIBLE);
                }
            }
        });
        _nose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_imgHidung.getVisibility() == View.INVISIBLE) {
                    _imgHidung.setVisibility(View.VISIBLE);
                } else {
                    _imgHidung.setVisibility(View.INVISIBLE);
                }
            }
        });
        _mouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (_imgMulut.getVisibility() == View.INVISIBLE) {
                    _imgMulut.setVisibility(View.VISIBLE);
                } else {
                    _imgMulut.setVisibility(View.INVISIBLE);
                }
            }
        });
        }
    }