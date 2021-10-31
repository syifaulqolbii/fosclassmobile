package com.syifaul.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 = (TextView) findViewById(R.id.namaUser);
        txt2 = (TextView) findViewById(R.id.nimUser);
        txt3 = (TextView) findViewById(R.id.jurusanUser);

        String nama = getIntent().getExtras().getString("nama");
        String nim = getIntent().getExtras().getString("nim");
        String jurusan = getIntent().getExtras().getString("jurusan");

        txt1.setText("Nama Anda \n" + nama);
        txt2.setText("NIM Anda \n" + nim);
        txt3.setText("Jurusan Anda \n" + jurusan);
    }
}