package com.example.n2pariwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
        ImageView datagambar;
        TextView datanama,datalamat,datarating;
        public static String id,nama,alamat,rating,gambar;
        public static Double latitude,longitude;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_nama);
        datalamat=findViewById(R.id.tv_alamat);
        datarating=findViewById(R.id.tv_rating);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        datarating.setText(rating);
        datalamat.setText(alamat);
        Picasso.get().load(gambar).into(datagambar);

    }
}