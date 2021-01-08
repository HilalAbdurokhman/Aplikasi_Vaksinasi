package com.example.healtyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView outNama,outTtl,outUs, outJk,outAl,outAg,outSt,outKw,outNp,outNpj,outTm;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        outNama = findViewById(R.id.tx_ou1);
        outTtl = findViewById(R.id.tx_ou2);
        outUs = findViewById(R.id.tx_ou3);
        outJk = findViewById(R.id.tx_ou4);
        outAl = findViewById(R.id.tx_ou6);
        outAg = findViewById(R.id.tx_ou7);
        outSt = findViewById(R.id.tx_ou8);
        outKw = findViewById(R.id.tx_ou9);
        outNp = findViewById(R.id.tx_ou10);
        outNpj = findViewById(R.id.tx_ou11);
        outTm = findViewById(R.id.tx_ou12);

        Button cetakHasil = findViewById(R.id.button);

        outNama.setText(getIntent().getStringExtra("Nama"));
        outTtl.setText(getIntent().getStringExtra("TTL"));
        outUs.setText(getIntent().getStringExtra("Usia"));
        outJk.setText(getIntent().getStringExtra("JK"));
        outAl.setText(getIntent().getStringExtra("Alamat"));
        outAg.setText(getIntent().getStringExtra("Agama"));
        outSt.setText(getIntent().getStringExtra("Status"));
        outKw.setText(getIntent().getStringExtra("Kw"));
        outNp.setText(getIntent().getStringExtra("NP"));
        outNpj.setText(getIntent().getStringExtra("NPJ"));
        outTm.setText(getIntent().getStringExtra("TM"));
    }
    
}