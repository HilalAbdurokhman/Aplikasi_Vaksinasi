package com.example.healtyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class RegisterActivity extends AppCompatActivity {
    DatePickerDialog.OnDateSetListener setListener;
    Button button;
    EditText etNama,etTtl, etUs, etJk, etAl, etAg, etSt, etKw, etPj, etNpj, etTm, etDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        button = findViewById(R.id.button);
        etNama = findViewById(R.id.editTextTextPersonName4);
        etTtl = findViewById(R.id.editTextTextPersonName5);
        etUs = findViewById(R.id.editTextTextPersonName6);
        etJk = findViewById(R.id.editTextTextPersonName7);
        etAl = findViewById(R.id.editTextTextPersonName9);
        etAg = findViewById(R.id.editTextTextPersonName10);
        etSt = findViewById(R.id.editTextTextPersonName11);
        etKw = findViewById(R.id.editTextTextPersonName12);
        etPj = findViewById(R.id.editTextTextPersonName13);
        etNpj = findViewById(R.id.editTextTextPersonName14);
        etTm = findViewById(R.id.et_date);

        etTm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(RegisterActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker v, int year, int month, int day) {
                        month = month+1;
                        String date = day + " - " + month + " - " + year;
                        etTm.setText(date);
                    }
                },year,month,day);
                        datePickerDialog.show();
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), OutputActivity.class);
                intent.putExtra("Nama", etNama.getText().toString());
                intent.putExtra("TTL", etTtl.getText().toString());
                intent.putExtra("Usia", etUs.getText().toString());
                intent.putExtra("JK", etJk.getText().toString());
                intent.putExtra("Alamat", etAl.getText().toString());
                intent.putExtra("Agama", etAg.getText().toString());
                intent.putExtra("Status", etSt.getText().toString());
                intent.putExtra("Kw", etKw.getText().toString());
                intent.putExtra("NP", etPj.getText().toString());
                intent.putExtra("NPJ", etNpj.getText().toString());
                intent.putExtra("TM", etTm.getText().toString());

                startActivity(intent);
            }
        });
    }
}