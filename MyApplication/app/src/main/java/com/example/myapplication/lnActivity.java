package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ln);
    }
    public void beranda (View view){
        Intent intent = new Intent(lnActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}