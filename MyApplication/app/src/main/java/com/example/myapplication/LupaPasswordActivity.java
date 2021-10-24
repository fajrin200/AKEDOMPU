package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LupaPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_password);
    }

    public void KodeLupaPassword(View view) {
        Intent intent = new Intent(LupaPasswordActivity.this, KodeLupaPasswordActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(LupaPasswordActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void Fb (View view){
        Intent intent = new Intent(LupaPasswordActivity.this, fbActivity.class);
        startActivity(intent);
    }

    public void ln (View view){
        Intent intent = new Intent(LupaPasswordActivity.this, lnActivity.class);
        startActivity(intent);
    }

    public void gg (View view){
        Intent intent = new Intent(LupaPasswordActivity.this, ggActivity.class);
        startActivity(intent);
    }

    public void ip (View view){
        Intent intent = new Intent(LupaPasswordActivity.this, ipActivity.class);
        startActivity(intent);
    }

}