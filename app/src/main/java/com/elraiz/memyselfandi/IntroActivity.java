package com.elraiz.memyselfandi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPageAdapter introViewPageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //list
        List<ScreenItem> mList = new ArrayList<>();
        mList.add(new ScreenItem("Know More About Me","",R.drawable.img1));
        mList.add(new ScreenItem("View My Gallery","",R.drawable.img2));
        mList.add(new ScreenItem("See What Movie and Music are My Favourites","",R.drawable.img3));

        //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPageAdapter = new IntroViewPageAdapter(this,mList);
        screenPager.setAdapter(introViewPageAdapter);

    }
}
