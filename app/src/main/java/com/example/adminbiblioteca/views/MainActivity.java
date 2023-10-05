package com.example.adminbiblioteca.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.adminbiblioteca.R;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toasty.error(this, "No se pudo guardar", Toasty.LENGTH_SHORT, true).show();
        Toasty.success(this, "Success!", Toasty.LENGTH_SHORT, true).show();
        Toasty.info(this, "Here is some info for you.", Toasty.LENGTH_SHORT, true).show();
        //Toasty.normal(this, "Normal toast w/ icon", ).show();
    }
}