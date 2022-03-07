package com.example.myapplication;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        EditText account, password;
        Button signup;
        account = findViewById(R.id.account);
        password = findViewById(R.id.password);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, signin.class);
                Data data = new Data(account.getText().toString(), password.getText().toString());
                intent.putExtra("Data", (Parcelable) data);
                startActivity(intent);
            }
        });
    }
}