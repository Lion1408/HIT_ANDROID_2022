package com.example.btvn7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    List <Data> list = new ArrayList<>();
    SQLite sqLite;
    RecyclerView recyclerView;
    RecyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText noidung = findViewById(R.id.noidung);
        Button them = findViewById(R.id.them);
        sqLite = new SQLite(this, "datalite.sqlite", null, 1);
        sqLite.QueryData("DROP TABLE GhiChu");
        sqLite.QueryData("Create table if not EXISTS GhiChu(id INTEGER PRIMARY KEY AUTOINCREMENT, Noidung NVARCHAR(1000))");
        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sqLite.QueryData("INSERT INTO GhiChu VALUES (null,'"+noidung.getText().toString()+"')");
                GetData();
                noidung.setText("");
            }
        });
        GetData();
    }
    public void xoa(int pos) {
        sqLite.QueryData("DELETE FROM GhiChu WHERE Id ='"+list.get(pos).getId()+"'");
        list.remove(pos);
        recyclerView.setAdapter(adapter);
    }

    public void GetData() {
        Cursor cursor = sqLite.GetData("Select * From GhiChu");
        list.clear();
        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String str = cursor.getString(1);
            list.add(new Data(id , str));
        }
        recyclerView = findViewById(R.id.recy);
        adapter = new RecyAdapter(list, MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

}