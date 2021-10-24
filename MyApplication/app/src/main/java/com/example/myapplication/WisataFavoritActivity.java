package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WisataFavoritActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_favorit);
    }


    public void nanggantumpu(View view) {
        int gambar= R.drawable.wisata_nangatumpu2;
        String nama="Nangga Tumpu";
        String alamat="Dompu Nusa Tenggara Barat";
        String detail="Nangatumpu adalah sebuah desa yang berada di wilayah Kecamatan Manggelewa, Kabupaten Dompu, Provinsi Nusa Tenggara Barat, Indonesia." +
                "nangga tumpu adalah salah satu objeck wisata yang terkenal dengantebing yang indah dan tinggi.";
        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

    public void lakey(View view) {
        int gambar = R.drawable.wisata_lakey3;
        String nama = "Pantai Lakey";
        String alamat = "Desa Hu'u Dompu Nusa Tenggara Barat";
        String detail = "Pantai Lakey terletak di desa Hu’u, kecamatan Hu’u, kabupaten Dompu.\n " +
                "Pantai ini menonjol dengan ombaknya yang besar,panjang dan konsisten.\n " +
                "Tapi bukan hanya itu yang menjadi kelebihan pantai Lakey, \n" +
                "arah gulungan ombak di pantai inilah yang membuatnya menjadi spesial.\n " +
                "Jika umumnya pantai memiliki gulungan ombak ke arah kanan maka ombak di pantai \n" +
                "ini menggulung ke arah kiri.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image", gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail", detail);
        startActivity(intent);
    }
    public void dwn(View view) {
        int gambar= R.drawable.wisata_dorowadunae1;
        String nama="Doro Wadu Nae";
        String alamat="Ranggo Dompu Nusa Tenggara Barat";
        String detail="Wisata Doro Wadu Nae terletak di lingkungan Doro Ngao, Kelurahan Kandai 1, Kecamatan Dompu. \n" +
                "Estimasi waktu untuk ke wisata Doro Wadu Nae kurang lebih kurang 5 menit \n" +
                "dari pusat kota Dompu. Sedangkan untuk waktu tempuh trecking hanya memakan \n" +
                "waktu lebih kurang 10 menit dari tempat parkir.";

            Intent intent = new Intent(getBaseContext(), Details.class);
            intent.putExtra("image",gambar);
            intent.putExtra("name", nama);
            intent.putExtra("location", alamat);
            intent.putExtra("detail",detail);
            startActivity(intent);
    }
    public void wadujao(View view) {
        int gambar= R.drawable.wisata_wadujao2;


        String nama="Pantai Wadu Jao";
        String alamat="Ranggo Dompu Nusa Tenggara Barat";
        String detail="Pantai Wadu Jao yang dalam bahasa lokal berarti pantai dengan bebatuan berwarna hijau.\n " +
                "Seperti namanya, pantai ini memiliki ciri khas yang unik \n" +
                "yakni memiliki bertaburan bebatuan atau karang hijau \n" +
                "yang tersebar hampir di sebagian wilayah pesisir pantainya.";
        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }
    public void saraenduha(View view) {
        int gambar= R.drawable.wisata_saraenduha;


        String nama="Sarae Nduha";
        String alamat="Calabai Tambora Dompu Nusa Tenggara Barat";
        String detail="Sarae Nduha merupakan tempat wisata yang berada di kawasan Taman Nasional Tambora. \n" +
                "Sarae berarti pasir dan Nduha berarti runtuh atau longsor. \n" +
                "Tempat ini tentu menjadi saksi sejarah meletusnya Gunung Tambora tahun 1815.";
        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

}