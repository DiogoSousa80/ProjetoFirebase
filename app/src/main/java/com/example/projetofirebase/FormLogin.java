package com.example.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fom_login);

        getSupportActionBar().hide();
    }
}