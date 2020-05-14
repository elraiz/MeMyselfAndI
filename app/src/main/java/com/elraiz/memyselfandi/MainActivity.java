package com.elraiz.memyselfandi;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 5000;
    Animation topAnim, bottomAnim, leftAnim, rightAnim;
    ImageView image;
    TextView text1,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //make fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        topAnim = new AnimationUtils().loadAnimation(this,R.anim.top_animation);
        bottomAnim = new AnimationUtils().loadAnimation(this,R.anim.bottom_animation);
        leftAnim = new AnimationUtils().loadAnimation(this,R.anim.left_animation);
        rightAnim = new AnimationUtils().loadAnimation(this,R.anim.right_animation);
        image = findViewById(R.id.main_img);
        text1 = findViewById(R.id.splashtext1);
        text2 = findViewById(R.id.splashtext2);
        image.setAnimation(topAnim);
        text1.setAnimation(leftAnim);
        text2.setAnimation(rightAnim);
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
