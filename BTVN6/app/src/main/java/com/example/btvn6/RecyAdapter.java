package com.example.btvn6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.List;
import java.util.zip.Inflater;

public class RecyAdapter extends RecyclerView.Adapter<RecyAdapter.Viewholder> {
    List <Data> list;
    Context context;
    public void setContext(Context context) {
        this.context = context;
    }

    public RecyAdapter(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyAdapter.Viewholder holder, int position) {
        Data data = list.get(position);
        holder.name.setText(data.getName());
        holder.price.setText("Chi phí : " + data.getTien());
        Picasso.get().load(data.getAvt()).into(holder.image);
        holder.click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Monan.class);
                intent.putExtra("Data", (Parcelable) data);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView name, price;
        ImageView image;
        LinearLayout click;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            image = itemView.findViewById(R.id.image);
            click = itemView.findViewById(R.id.click);
        }
    }
}
