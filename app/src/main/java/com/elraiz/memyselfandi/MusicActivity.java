package com.elraiz.memyselfandi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.youtube.player.YouTubeBaseActivity;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

//11 Mei 2020 : membuat dan mendesai tampilan activity music serta menambahkan fungsi pindah activity pada bottom navigation
//14 Mei 2020 : penambahan dependecies untuk memutar video youtube
//15 Mei 2020 : merapihkan dan menyelesaikan tampilan halaman activity music

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        //inisialisasi
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNav.setSelectedItemId(R.id.nav_music);

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
                        startActivity(new Intent(getApplicationContext()
                                , DailyActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_music:
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
