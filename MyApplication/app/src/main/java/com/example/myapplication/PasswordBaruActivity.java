package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PasswordBaruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_baru);
    }

    public void Konfirmasi(View view) {
        Intent intent = new Intent(PasswordBaruActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}