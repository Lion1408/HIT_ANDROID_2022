package com.example.btvn7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.Viewholder> {
    List <Data> list;
    MainActivity mainActivity;
    public RecyAdapter(List<Data> list, MainActivity mainActivity) {
        this.list = list;
        this.mainActivity = mainActivity;
    }
    @NonNull
    @Override
    public RecyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.item, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyAdapter.Viewholder holder, int position) {
        Data data = list.get(position);
        holder.txt.setText(data.getNd());
        int pos = position;
        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivity.xoa(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null?0:list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView txt;
        Button delete;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txt);
            delete = itemView.findViewById(R.id.delete);
        }
    }
}
