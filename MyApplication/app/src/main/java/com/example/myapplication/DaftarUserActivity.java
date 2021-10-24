package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_user);
    }

    public void login(View view) {
        Intent intent = new Intent(DaftarUserActivity.this, LoginActivity.class);
        startActivity(intent);
    }
    public void Fb (View view){
        Intent intent = new Intent(DaftarUserActivity.this, fbActivity.class);
        startActivity(intent);
    }

    public void ln (View view){
        Intent intent = new Intent(DaftarUserActivity.this, lnActivity.class);
        startActivity(intent);
    }

    public void gg (View view){
        Intent intent = new Intent(DaftarUserActivity.this, ggActivity.class);
        startActivity(intent);
    }

    public void ip (View view){
        Intent intent = new Intent(DaftarUserActivity.this, ipActivity.class);
        startActivity(intent);
    }
}