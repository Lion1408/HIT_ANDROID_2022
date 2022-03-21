package com.example.btvn5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recy);
        List <Data> list = new ArrayList<>();
        list = tao();
        RecyAdapter adapter = new RecyAdapter(list, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    static List <Data> tao() {
        List<Data> list = new ArrayList<>();
        list.add(new Data(R.drawable.dao,"Đồ thần đao","Thuộc tính : Phong", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.kiem,"Thiên hỏa kiếm","Thuộc tính : Hỏa","Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.kunai,"Thủy chấn dao","Thuộc tính : Thủy", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.cung,"Băng thần cung","Thuộc tính : Thủy", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.tieu,"Hỏa phong tiêu","Thuộc tính : Hỏa","Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.quat,"Âm dương quạt","Thuộc tính : Phong","Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.dao,"Đồ thần đao","Thuộc tính : Phong", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.kiem,"Thiên hỏa kiếm","Thuộc tính : Hỏa","Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.kunai,"Thủy chấn dao","Thuộc tính : Thủy", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.cung,"Băng thần cung","Thuộc tính : Thủy", "Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.tieu,"Hỏa phong tiêu","Thuộc tính : Hỏa","Giá mua : 2.600.000 xu"));
        list.add(new Data(R.drawable.quat,"Âm dương quạt","Thuộc tính : Phong","Giá mua : 2.600.000 xu"));
        return  list;
    }
}