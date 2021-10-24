package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    //perintah pindah activity saat tekan tombol login
    public void login(View view) {
        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    public void LupaPassword(View view) {
        Intent intent = new Intent(LoginActivity.this, LupaPasswordActivity.class);
        startActivity(intent);
    }

    public void DaftarAkun(View view) {
        Intent intent = new Intent(LoginActivity.this, DaftarUserActivity.class);
        startActivity(intent);
    }

    public void Fb (View view){
        Intent intent = new Intent(LoginActivity.this, fbActivity.class);
        startActivity(intent);
    }

    public void ln (View view){
        Intent intent = new Intent(LoginActivity.this, lnActivity.class);
        startActivity(intent);
    }

    public void gg (View view){
        Intent intent = new Intent(LoginActivity.this, ggActivity.class);
        startActivity(intent);
    }

    public void ip (View view){
        Intent intent = new Intent(LoginActivity.this, ipActivity.class);
        startActivity(intent);
    }


    public void HalamanMenu(View view) {
        Intent intent = new Intent(LoginActivity.this, HalamanMenuActivity.class);
        startActivity(intent);
    }
}