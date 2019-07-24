package com.example.imageview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.card.MaterialCardView;

import java.util.ArrayList;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private ArrayList<String> images ;
    private ArrayList<String> image_names;
    private Context context;

    public MyAdapter(ArrayList<String> images, ArrayList<String> imageNames, Context context) {
        this.images = images;
        this.image_names = imageNames;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_row, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        Glide.with(context)
                .asBitmap()
                .load(images.get(position))
                .into(holder.img);

        holder.img_name.setText(image_names.get(position));
        holder.materialCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ImageViewer.class);
                intent.putExtra("image",images.get(position));
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {

        return image_names.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView img_name;
        MaterialCardView materialCardView;

        public MyViewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.image);
            img_name = v.findViewById(R.id.image_name);
            materialCardView = v.findViewById(R.id.row);

        }
    }
}