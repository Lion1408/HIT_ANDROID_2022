package com.example.btvn6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static String url = "https://appnote-codernon.herokuapp.com/api/monan?fbclid=IwAR14SSeZpHkiODX-sUJv7txVzcZVWdCI4aJmp0OJhAOa3EuWrfL0y-QOkBM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetData();
    }
    private void GetData() {
        List<Data> list = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recy);
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        JsonArrayRequest json = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);
                        String name = jsonObject.getString("moanname");
                        String avt = jsonObject.getString("avt");
                        String nguyenlieu = jsonObject.getString("nguyenlieu");
                        String congthuc = jsonObject.getString("congthuc");
                        String tien = jsonObject.getString("tien");
                        list.add(new Data(name, avt, congthuc, nguyenlieu, tien));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                RecyAdapter recyAdapter = new RecyAdapter(list, MainActivity.this);
                recyclerView.setAdapter(recyAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "Lỗi", Toast.LENGTH_SHORT).show();
            }
        });
        requestQueue.add(json);
    }
}