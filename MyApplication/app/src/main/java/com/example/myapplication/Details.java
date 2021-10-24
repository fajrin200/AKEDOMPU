package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    ImageView img;
    TextView txtname , txtlocation, txtdetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        img=findViewById(R.id.detail_image);
        txtname=findViewById(R.id.detail_name);
        txtlocation=findViewById(R.id.detail_location);
        txtdetail=findViewById(R.id.detail_info);

        Intent intent=getIntent();

        img.setImageResource(intent.getIntExtra("image" , 0));
        txtname.setText(intent.getStringExtra("name"));
        txtlocation.setText(intent.getStringExtra("location"));
        txtdetail.setText(intent.getStringExtra("detail"));


    }
}