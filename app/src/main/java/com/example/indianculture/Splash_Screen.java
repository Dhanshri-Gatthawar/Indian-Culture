package com.example.indianculture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Intent intentSplash;
        intentSplash = new Intent(Splash_Screen.this,MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run()
            {
                startActivity(intentSplash);
                finish();
            }
        },1700);
    }
}