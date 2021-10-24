package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DaftarSukseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_sukse);
    }

    public void login(View view) {

    }

    public void Fb (View view){
        Intent Fb = getPackageManager().getLaunchIntentForPackage("https//facebook.com");
        startActivity(Fb);
    }

    public void ln (View view){
        Intent ln = getPackageManager().getLaunchIntentForPackage("https//line.com");
        startActivity(ln);
    }

    public void gg (View view){
        Intent gg = getPackageManager().getLaunchIntentForPackage("https//account.google.com");
        startActivity(gg);
    }

    public void ip (View view){
        Intent ip = getPackageManager().getLaunchIntentForPackage("https//appleid.apple.com");
        startActivity(ip);
    }
}