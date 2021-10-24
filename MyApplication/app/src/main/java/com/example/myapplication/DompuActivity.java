package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DompuActivity extends AppCompatActivity {
    VideoView videoView;
    String tempat;
    DisplayMetrics dm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dompu);

        dm = new DisplayMetrics();
        this.getWindowManager().getDefaultDisplay().getMetrics(dm);

        int tinggi =dm.heightPixels;
        int lebar = dm.widthPixels;

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setMinimumHeight(tinggi);
        videoView.setMinimumWidth(lebar);

        tempat = "android.resource://" + getPackageName() + "/" + R.raw.akedompu;
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(Uri.parse(tempat));
        videoView.start();
        videoView.requestFocus();

    }
    public void beranda (View view){
        Intent intent = new Intent(DompuActivity.this, HalamanMenuActivity.class);
        startActivity(intent);
    }
}