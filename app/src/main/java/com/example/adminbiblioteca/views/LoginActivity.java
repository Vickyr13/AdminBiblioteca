package com.example.adminbiblioteca.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.adminbiblioteca.R;

public class LoginActivity extends AppCompatActivity {

    TextView createAccountTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        createAccountTextView = findViewById(R.id.txtCreateAccountBtn);
        createAccountTextView.setOnClickListener(v->startActivity(new Intent(LoginActivity.this,
                CreateAccountActivity.class)));
    }
}