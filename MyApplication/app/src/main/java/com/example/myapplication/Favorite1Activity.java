package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Favorite1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite1);
    }

    public void beranda(View view) {
        Intent intent = new Intent(Favorite1Activity.this, WisataFavoritActivity.class);
        startActivity(intent);
    }
}