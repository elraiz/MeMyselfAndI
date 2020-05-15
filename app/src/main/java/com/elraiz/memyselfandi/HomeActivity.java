package com.elraiz.memyselfandi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

//10 Mei 2020 : mendesain halaman home dan profille,mengisi komponen komponen pada halaman home serta membuat activity activity untuk menu lainnya
//11 Mei 2020 : menambahkan fungsi untuk pindah ke activity lain melalu bottom navigation yang tersedia
//14 Mei 2020 : melengkapi serta merapihkan tampilan halaman home

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //inisialisasi
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNav.setSelectedItemId(R.id.nav_home);

        //item selected listener
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_home:
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
