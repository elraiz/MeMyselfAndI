package com.elraiz.memyselfandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPageAdapter introViewPageAdapter;
    TabLayout tabIndicator;
    Button btnNext;
    TextView txtSkip;
    int position = 0;
    Animation btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //make fullscreen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_intro);

        //ini views
        btnNext = findViewById(R.id.btn_next);
        tabIndicator = findViewById(R.id.tab_indicator);
        txtSkip = findViewById(R.id.txt_skip);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        //list
        final List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Know More About Me","",R.drawable.img1));
        mList.add(new ScreenItem("View My Gallery","",R.drawable.img2));
        mList.add(new ScreenItem("Listen To My Favourites Music","",R.drawable.img3));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPageAdapter = new IntroViewPageAdapter(this,mList);
        screenPager.setAdapter(introViewPageAdapter);

        //setup tablayout
        tabIndicator.setupWithViewPager(screenPager);

        //text skip listener
        txtSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(homeIntent);
            }
        });

        //button next on click
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = screenPager.getCurrentItem();
                if (position < mList.size() && btnNext.getText()!="Get Started"){
                    position++;
                    screenPager.setCurrentItem(position);
                }
                else if (btnNext.getText()=="Get Started"){
                    Intent homeIntent = new Intent(getApplicationContext(),HomeActivity.class);
                    startActivity(homeIntent);
                }
                if (position == mList.size()-1 && btnNext.getText()!="Get Started"){
                    loadLastScreen();
                }
            }
        });

        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==mList.size()-1 && btnNext.getText()!="Get Started"){
                    loadLastScreen();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void loadLastScreen() {
        btnNext.setAnimation(btnAnim);
        btnNext.setText("Get Started");
        tabIndicator.setVisibility(View.INVISIBLE);
        txtSkip.setVisibility(View.INVISIBLE);
    }
}
