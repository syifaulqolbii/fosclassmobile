package com.syifaul.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nama, nim, jurusan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi input
        nama = (EditText) findViewById(R.id.editNama);
        nim = (EditText) findViewById(R.id.nim);
        jurusan = (EditText) findViewById(R.id.jurusan);
    }

    public void submitData(View view) {
        Intent hubung = new Intent(this, HasilActivity.class);
        hubung.putExtra("nama", nama.getText().toString());
        hubung.putExtra("nim", nim.getText().toString());
        hubung.putExtra("jurusan", jurusan.getText().toString());
        startActivity(hubung);
    }
}