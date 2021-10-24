package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HalamanMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_menu);
    }
    public void favorite(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, WisataFavoritActivity.class);
        startActivity(intent);
    }
    public void beranda(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, HomeActivity.class);
        startActivity(intent);
    }
    public void makanan(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, MakananActivity.class);
        startActivity(intent);
    }
    public void rumahadat(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, RumahAdatActivity.class);
        startActivity(intent);
    }
    public void permainantradisional(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, PermainanTradisionalActivity.class);
        startActivity(intent);
    }
    public void kebudayaan(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, KebudayaanActivity.class);
        startActivity(intent);
    }
    public void sosial(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, SosialActivity.class);
        startActivity(intent);
    }
    public void pekerjaan(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, PekerjaanActivity.class);
        startActivity(intent);
    }
    public void Akun(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, AkunAndaActivity.class);
        startActivity(intent);
    }

    public void close(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void favorite1(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, Favorite1Activity.class);
        startActivity(intent);
    }

    public void Dompu(View view) {
        Intent intent = new Intent(HalamanMenuActivity.this, DompuActivity.class);
        startActivity(intent);
    }
}