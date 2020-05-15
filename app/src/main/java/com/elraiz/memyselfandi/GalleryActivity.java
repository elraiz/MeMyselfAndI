package com.elraiz.memyselfandi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {

    private RecyclerView recyclegallery;
    private StaggeredRecyclerAdapter adapter;
    StaggeredGridLayoutManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        recyclegallery = findViewById(R.id.recycle_gallery);
        manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclegallery.setLayoutManager(manager);

        //array list
        List<row> list = new ArrayList<>();
        list.add(new row((R.drawable.g1)));
        list.add(new row((R.drawable.g2)));
        list.add(new row((R.drawable.g3)));
        list.add(new row((R.drawable.g4)));
        list.add(new row((R.drawable.g5)));
        list.add(new row((R.drawable.g6)));
        list.add(new row((R.drawable.g7)));
        list.add(new row((R.drawable.g8)));
        list.add(new row((R.drawable.g9)));
        list.add(new row((R.drawable.g10)));
        list.add(new row((R.drawable.g11)));
        list.add(new row((R.drawable.g12)));

        adapter = new StaggeredRecyclerAdapter(this,list);
        recyclegallery.setAdapter(adapter);

        //inisialisasi navigation
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNav.setSelectedItemId(R.id.nav_gallery);

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

