package com.example.btvn6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Monan extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monan);
        ImageView image, back;
        TextView title, nguyenlieu, congthuc, tien;
        image = findViewById(R.id.image);
        title = findViewById(R.id.title);
        nguyenlieu = findViewById(R.id.nguyenlieu);
        congthuc = findViewById(R.id.congthuc);
        tien = findViewById(R.id.tien);
        back = findViewById(R.id.back);
        Intent intent = getIntent();
        Data data = intent.getParcelableExtra("Data");
        Picasso.get().load(data.getAvt()).into(image);
        title.setText(data.getName());
        nguyenlieu.setText(data.getNguyenlieu());
        congthuc.setText(data.getCongthuc());
        tien.setText(data.getTien());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Monan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}