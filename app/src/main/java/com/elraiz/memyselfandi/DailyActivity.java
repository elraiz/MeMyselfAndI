package com.elraiz.memyselfandi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class DailyActivity extends AppCompatActivity {

    RecyclerView friendlist;
    RecyclerView dailylist;
    List<App> appList;
    List<App2> app2List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        friendlist = findViewById(R.id.friend_list);
        dailylist = findViewById(R.id.daily_list);
        appList = new ArrayList<>();

        appList.add(new App(R.drawable.f1,"Wisuda Nur F"));
        appList.add(new App(R.drawable.f2,"M Imran"));
        appList.add(new App(R.drawable.f3,"M Chaerrull"));
        appList.add(new App(R.drawable.f4,"Afri Suhendra"));

        app2List = new ArrayList<App2>();

        app2List.add(new App2("Bangun","4.30"));
        app2List.add(new App2("Sholat Subuh","5.00"));
        app2List.add(new App2("Belajar","8.00"));
        app2List.add(new App2("Main Game","12.30"));
        app2List.add(new App2("Tugas","19.30"));

        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.HORIZONTAL);
        friendlist.setLayoutManager(manager);

        LinearLayoutManager managerdaily = new LinearLayoutManager(this);
        managerdaily.setOrientation(LinearLayoutManager.VERTICAL);
        dailylist.setLayoutManager(managerdaily);

        CustomAdaptor adaptor = new CustomAdaptor(this,appList);
        friendlist.setAdapter(adaptor);
        CustomAdaptorDaily adaptor_daily = new CustomAdaptorDaily(this,app2List);
        dailylist.setAdapter(adaptor_daily);

        //inisialisasi
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNav.setSelectedItemId(R.id.nav_daily);

        //item selected listener
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext()
                                , HomeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_daily:
                        return true;
                    case R.id.nav_gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_music:
                        startActivity(new Intent(getApplicationContext()
                                , MusicActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profille:
                        startActivity(new Intent(getApplicationContext()
                                , ProfilleActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
