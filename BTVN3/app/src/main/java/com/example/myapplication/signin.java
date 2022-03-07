package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);
        TextView account, password;
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        Intent intent = getIntent();
        Data data = intent.getParcelableExtra("Data");
        account.setText(data.getTk());
        password.setText(data.getMk());
    }
}