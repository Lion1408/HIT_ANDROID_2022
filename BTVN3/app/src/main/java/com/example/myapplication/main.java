package com.example.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class main extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button signup, signin;
        EditText account, password;
        signup = findViewById(R.id.signup);
        signin = findViewById(R.id.signin);
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(main.this,signin.class);
                Data data = new Data(account.getText().toString(), password.getText().toString());
                intent.putExtra("Data", (Parcelable) data);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(main.this,signup.class));
            }
        });
    }

}