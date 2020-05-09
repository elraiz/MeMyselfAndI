package com.elraiz.memyselfandi;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent introIntent = new Intent(MainActivity.this, IntroActivity.class);
                startActivity(introIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
