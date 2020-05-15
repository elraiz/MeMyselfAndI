package com.elraiz.memyselfandi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

//NIM : 10117163
//Nama : Muhamad El Raiz
//Kelas : IF5

public class ProfilleActivity extends AppCompatActivity {

    TextView txtabout;
    Dialog customdialog;
    ImageView btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profille);

        customdialog = new Dialog(this);
        txtabout = findViewById(R.id.txt_about);
        btnexit = findViewById(R.id.btn_exit);

        txtabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowPopup();
            }
        });

        //inisialisasi
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNav.setSelectedItemId(R.id.nav_profille);

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
                        startActivity(new Intent(getApplicationContext()
                                , MusicActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_profille:
                        return true;
                }
                return false;
            }
        });

        //about popup
    }

    //image button
    public void openig(View view) {
        Intent intentig = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/elraiz/"));
        startActivity(intentig);
    }
    public void opentwt(View view) {
        Intent intenttwt = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/muhamadelraiz"));
        startActivity(intenttwt);
    }
    public void openfb(View view) {
        Intent intentfb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/muhammadel.raiz?ref=bookmarks"));
        startActivity(intentfb);
    }
    public void openmap(View view) {
        Intent intentmap = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Universitas+Komputer+Indonesia/@-6.8868617,107.6152923,20z/data=!4m12!1m6!3m5!1s0x2e68e6f8aa08188b:0x632d24e6061e8903!2sUniversitas+Komputer+Indonesia!8m2!3d-6.8868957!4d107.615299!3m4!1s0x2e68e6f8aa08188b:0x632d24e6061e8903!8m2!3d-6.8868957!4d107.615299"));
        startActivity(intentmap);
    }
    public void ShowPopup() {
        customdialog.setContentView(R.layout.layout_about);
        btnexit = customdialog.findViewById(R.id.btn_exit);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customdialog.dismiss();
            }
        });
        customdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        customdialog.show();
    }
}
