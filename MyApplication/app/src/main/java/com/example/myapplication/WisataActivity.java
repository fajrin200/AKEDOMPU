package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class WisataActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wisata_activity);

        recyclerView = findViewById(R.id.recyclerView);
        String arrname[] = {
                "Pantai Lakey ",
                "Nangatumpu",
                "Pulau Satonda",
                "Doro Wadu Nae",
                "Gunung Tambora ",
                "RUMAH ADAT",
                "AIR TERJUN O'I PANCA"};

        String arrlocation[] = {
                "Lakey Dompu, NTB",
                "Matiti, Hu'u Kab. Dompu",
                "Satonda dompu, NTB",
                "dwn",
                "Gunung Tambora, NTB",
                "Dompu NTB",
                "Desa Saneo Kab. Dompu,NTB"};

        String arrdetails[] = {
                "Pantai Lakey terletak di desa Hu’u, kecamatan Hu’u, kabupaten Dompu. Pantai ini menonjol dengan ombaknya yang besar,panjang dan konsisten. Tapi bukan hanya itu yang menjadi kelebihan pantai Lakey, arah gulungan ombak di pantai inilah yang membuatnya menjadi spesial. Jika umumnya pantai memiliki gulungan ombak ke arah kanan maka ombak di pantai ini menggulung ke arah kiri.",
                "Nangatumpu adalah sebuah desa yang berada di wilayah Kecamatan Manggelewa, Kabupaten Dompu, Provinsi Nusa Tenggara Barat, Indonesia.",
                "Pulau Satonda adalah sebuah pulau di Provinsi Nusa Tenggara Barat, Indonesia. Pulau ini terletak di lepas pantai utara Pulau Sumbawa. Pulau ini masuk dalam wilayah Kabupaten Dompu, 3 kilometer dari Selat Sanggar di Laut Flores dan secara administratif berada di wilayah Desa Nangamiro di Kecamatan Pekat.",
                "Wisata Doro Wadu Nae terletak di lingkungan Doro Ngao, Kelurahan Kandai 1, Kecamatan Dompu. Estimasi waktu untuk ke wisata Doro Wadu Nae kurang lebih kurang 5 menit dari pusat kota Dompu. Sedangkan untuk waktu tempuh trecking hanya memakan waktu lebih kurang 10 menit dari tempat parkir.",
                "Gunung Tambora adalah sebuah gunung berapi kerucut aktif yang terletak di Pulau Sumbawa, Nusa Tenggara Barat, Indonesia. Gunung ini terletak di dua kabupaten yaitu Kabupaten Dompu yang mencakup lereng bagian barat dan selatan serta Kabupaten Bima yang mencakup lereng bagian timur dan utara.",
                "Rumah adat suku Dompu bernama uma jompa dan uma panggu.[3] Uma jompa mempunyai fungsi sebagai tempat menyimpan lumbung padi. Letaknya terpisah dengan rumah tinggal penduduk suku Dompu. Uma jompa mempunyai tiga lantai. Lantai pertama, digunakan untuk menerima tamu ada upacara adat, lantai kedua berfungsi sebagai kamar dan dapur, dan lantai ketiga serfungsi sebagai tempat menyimpan bahan makanan. Uma panggu/uma ceko adalah rumah sekaligus tempat tinggal bagi masyarakat Dompu. Bagunan ini terbuat dari kayu yang berbentuk panggung.",
                "Lokasinya ada di Kabupaten Dompu, Nusa Tenggara Barat (NTB). Air Terjun Sori Panca berada tepat di Desa Saneo, Kecamatan Woja.\n" +
                        "\n" +
                        "Memiliki tinggi mencapi 70-80 meter, Air Terjun Sori Panca terkenal dengan jalurnya yang ekstrem sehingga membuat orang yang mengunjunginya diuji mentalnya. Justru karena hal tersebut membuat air terjun ini dijuluki sebagai spot wisata yang memacu adrenalin sekaligus bertualang di hutan rimba.\n" +
                        "\n" +
                        "Untuk mencapai air terjun ini tidaklah mudah. Jika menggunakan sepeda motor harus menempuh jarak hingga 3 jam melewati hutan rimbun yang masih alami, lalu harus berjalan kaki di jalan setapak dengan tingkat kemiringan yang cukup terjal.\n"};

        int arrimage[] = {R.drawable.w1, R.drawable.w2, R.drawable.w3, R.drawable.w4, R.drawable.w5, R.drawable.w6, R.drawable.w7};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new WisataAdapter(this, arrname, arrlocation,arrdetails, arrimage));

    }

}