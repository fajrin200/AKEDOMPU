package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    //perintah pindah activity saat tekan tombol logout

    public void logout(View view) {
        Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void wisata(View view) {
        Intent intent = new Intent(HomeActivity.this, WisataActivity.class);
        startActivity(intent);
    }

    public void budaya(View view) {
        Intent intent = new Intent(HomeActivity.this, BudayaActivity.class);
        startActivity(intent);
    }

    // code untuk gambar wisata dan budaya ketika di klik

    public void wisata1(View view) {
        int gambar1= R.drawable.w3;
        String alamat1="Satonda dompu, NTB";
        String nama1="Pulau Satonda";
        String detail1="Pulau Satonda adalah sebuah pulau di Provinsi Nusa Tenggara Barat, Indonesia. Pulau ini terletak di lepas pantai utara Pulau Sumbawa. Pulau ini masuk dalam wilayah Kabupaten Dompu, 3 kilometer dari Selat Sanggar di Laut Flores dan secara administratif berada di wilayah Desa Nangamiro di Kecamatan Pekat.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar1);
        intent.putExtra("name", nama1);
        intent.putExtra("location", alamat1);
        intent.putExtra("detail",detail1);
        startActivity(intent);
    }

    public void wisata2(View view) {
        int gambar= R.drawable.w7;
        String alamat="Desa Saneo Kab. Dompu,NTB";
        String nama="AIR TERJUN O'I PANCA";
        String detail="Lokasinya ada di Kabupaten Dompu, Nusa Tenggara Barat (NTB). Air Terjun Sori Panca berada tepat di Desa Saneo, Kecamatan Woja. Memiliki tinggi mencapi 70-80 meter, Air Terjun Sori Panca terkenal dengan jalurnya yang ekstrem sehingga membuat orang yang mengunjunginya diuji mentalnya. Justru karena hal tersebut membuat air terjun ini dijuluki sebagai spot wisata yang memacu adrenalin sekaligus bertualang di hutan rimba.Untuk mencapai air terjun ini tidaklah mudah. Jika menggunakan sepeda motor harus menempuh jarak hingga 3 jam melewati hutan rimbun yang masih alami, lalu harus berjalan kaki di jalan setapak dengan tingkat kemiringan yang cukup terjal.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

    public void wisata3(View view) {
        int gambar= R.drawable.w2;
        String nama="Nangatumpu";
        String alamat="Matiti, Hu'u Kab. Dompu";
        String detail="Nangatumpu adalah sebuah desa yang berada di wilayah Kecamatan Manggelewa, Kabupaten Dompu, Provinsi Nusa Tenggara Barat, Indonesia.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

    public void budaya1(View view) {
        int gambar= R.drawable.b1;
        String nama="Tarian Adat";
        String alamat="Dompu Nusa Tenggara Barat";
        String detail="1.\tTari Sampela Ma Rimpu[6], bercerita tentang gadis dari suku Dompu yang akan pergi ke suatu telaga serta menggunakan rimpu kain yang berwarna warni.\n" +
                "2.\tTari Mama Ra Isi[6], adalah tari penyambutan yang dikhusukan untuk tamu.\n" +
                "3.\tTari Muna Ra Medi,[6] berkisah tentang proses pembuatan kain yang ditransformasi menjadi sebuah tarian\n";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

    public void budaya2(View view) {
        int gambar= R.drawable.b3;
        String nama="Tarian Adat";
        String alamat="Rimpu Dompu";
        String detail="Rimpu adalah salah satu wujud budaya Dou Dompu dalam berpakaian, menggunakan kain tradisional, yaitu Tembe Nggoli. \n\nDikalangan masyarakat Dompu, rimpu dikenal dua macam yaitu rimpu colo dan rimpu mpida. Rimpu Colo biasanya dipakai oleh kaum Ibu, menggunakan dua lembar tembe nggoli. Bagian bawah di lilitkan dengan teknik sanggentu dan bagian atas diilitkan sehingga yang terlihat hanya wajah saja. Sedangkan Rimpu mpida biasanya dikenakan oleh kaum wanita muda maupun remaja, perempuan yang belum menikah. yang terlihat hanya matanya saja. \n\nNggoli memiliki nilai “sakral” bagi yang menggunakannya, karena terasa dingin ketika cuaca pansa dan terasa hangat ketika cuaca dingin. \nBeberapa motif tradisional yang diaplikasikan dalam Tembe Nggoli seperti jarimpi, tagambe, gari galomba, dll dengan warna yang beragam menjadikannya sangat indah dan nyaman di kenakan. Nggoli dan rimpu adalah representasi kesatuan utuh Dou Dompu.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }

    public void budaya3(View view) {
        int gambar= R.drawable.b5;
        String nama="Tarian Adat";
        String alamat="pacuan kuda lepadi, Kab. Dompu";
        String detail="Berkuda bukan cabang olahraga yang popular bagi masyarakat Dompu. Tapi perihal kuda tentu menjadi satu kesatuan yang tak bisa terpisahkan dengan kebudayaan masyarakat di kepulauan Sumbawa, khususnya di Kabupaten Dompu, Nusa Tenggara Barat (NTB). \n\nAda beragam kebudayaan masyarakat Dompu yang tidak bisa terlepas dari kuda, salah satunya pacuan kuda. Pacuan kuda di Dompu justru sering diadakan dibanding dengan budaya lainnya. \n\nPacuan kuda dalam bahasa Dompu “Pacoa Jara”, Budaya Pacoa Jara di Dompu didukung dengan beberapa tempat yang dijadikan arena pacuan, salah satu yang paling sering digunakan yaitu di Desa Lepadi, Kecamatan Pajo. Arena pacuan ini diberi nama “Lemba Kara” karena terinspirasi dengan wilayah Lepadi yang penuh dengan pohon kara atau tumbuhan berduri tajam yang dulu tumbuh hampir di seluruh wilayah ini.";

        Intent intent = new Intent(getBaseContext(), Details.class);
        intent.putExtra("image",gambar);
        intent.putExtra("name", nama);
        intent.putExtra("location", alamat);
        intent.putExtra("detail",detail);
        startActivity(intent);
    }
}