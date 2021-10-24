package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class KodeLupaPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_lupa_password);
    }



    public void KodeLupaPassword(View view) {
        Intent intent = new Intent(KodeLupaPasswordActivity.this, PasswordBaruActivity.class);
        startActivity(intent);
    }
}