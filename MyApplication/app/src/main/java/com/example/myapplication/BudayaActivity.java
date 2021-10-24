package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BudayaActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.budaya_activity);

        recyclerView = findViewById(R.id.recyclerView);
        String arrname[] = {
                "Tarian Adat",
                "MBaju kuru kambaya ra,a ",
                "Rimpu",
                "Tembe Nggoli ",
                "Pacuan Kuda -(jara pacoa)"};

        String arrlocation[] = {
                "Dompu Padang Savana Gunung Tambora",
                "Mbaju Dompu NTB",
                "Rimpu Dompu",
                "Temnbe ngoli Dompu",
                "pacuan kuda lepadi, Kab. Dompu"};

        String arrdetails[] = {
                "Tari Mama Ra Isi, adalah tari penyambutan yang dikhusukan untuk tamu.",
                "MBaju kuru kambaya ra,a dan monca tawoa (Baju kurung/kebaya merah darah dan kuning kunyit), todu me,e buroka (Kerudung hitam atau fashmina) berpadu dengan tembe nggoli di bagian bawahannya, lalu rimpu tembe nggoli dalam berbagai rupa motif dan warna tanpa disadari telah menghasilkan komposisi yang sangat indah untuk dilihat, ketika sekumpulan kaum ibu di Saneo Dompu melaksanakan aktifitas Mori ra Woko atau kehidupan kesehariannya dalam bentuk Mbaju ra Mbedi. Menumbuk padi, membersihkan beras serta menampi padi adalah aktifitas rutin yang kerap dilakukan oleh perempuan di Dompu secara bersama-sama. Nggoli yang dikenakan dalam bentuk rimpu, baik Rimpu Colo maupun Rimpu Mpida, seakan menyatu dengan tubuh, tetap nyaman dan enak untuk di kenakan. Perempuan Dompu selalu punya cara untuk mencintai dan melestarikan warisan leluhurnya yang menjadi penegas Identitasnya, yaitu Nggoli dan Rimpu…!",
                "Rimpu adalah salah satu wujud budaya Dou Dompu dalam berpakaian, menggunakan kain tradisional, yaitu Tembe Nggoli. \nDikalangan masyarakat Dompu, rimpu dikenal dua macam yaitu rimpu colo dan rimpu mpida. Rimpu Colo biasanya dipakai oleh kaum Ibu, menggunakan dua lembar tembe nggoli. Bagian bawah di lilitkan dengan teknik sanggentu dan bagian atas diilitkan sehingga yang terlihat hanya wajah saja. Sedangkan Rimpu mpida biasanya dikenakan oleh kaum wanita muda maupun remaja, perempuan yang belum menikah. yang terlihat hanya matanya saja. Nggoli memiliki nilai “sakral” bagi yang menggunakannya, karena terasa dingin ketika cuaca pansa dan terasa hangat ketika cuaca dingin. \nBeberapa motif tradisional yang diaplikasikan dalam Tembe Nggoli seperti jarimpi, tagambe, gari galomba, dll dengan warna yang beragam menjadikannya sangat indah dan nyaman di kenakan. Nggoli dan rimpu adalah representasi kesatuan utuh Dou Dompu.",
                "Tembe Nggoli adalah kain tenun sarung khas Bima,  yang terbuat dari benang kapas atau katun. Kain tenun sarung ini memiliki beragam warna yang cerah dan bermotif khas sarung tenun tangan. Keistimewaan lain yang dimiliki oleh Tembe Nggoli, berbahan halus, tidak mudah sobek, dan dapat menghangatkan tubuh. Tembe Nggoli memiliki keunikan, bila dipakai saat cuaca dingin akan hangat, begitupun saat dipakai saat cuaca panas akan terasa dingin.",
                "Berkuda bukan cabang olahraga yang popular bagi masyarakat Dompu. Tapi perihal kuda tentu menjadi satu kesatuan yang tak bisa terpisahkan dengan kebudayaan masyarakat di kepulauan Sumbawa, khususnya di Kabupaten Dompu, Nusa Tenggara Barat (NTB). Ada beragam kebudayaan masyarakat Dompu yang tidak bisa terlepas dari kuda, salah satunya pacuan kuda. Pacuan kuda di Dompu justru sering diadakan dibanding dengan budaya lainnya. Pacuan kuda dalam bahasa Dompu “Pacoa Jara”, Budaya Pacoa Jara di Dompu didukung dengan beberapa tempat yang dijadikan arena pacuan, salah satu yang paling sering digunakan yaitu di Desa Lepadi, Kecamatan Pajo. Arena pacuan ini diberi nama “Lemba Kara” karena terinspirasi dengan wilayah Lepadi yang penuh dengan pohon kara atau tumbuhan berduri tajam yang dulu tumbuh hampir di seluruh wilayah ini."};

        int arrimage[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5};

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BudayaAdapter(this, arrname, arrlocation,arrdetails, arrimage));

    }

}