package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.Myholder> {


    private Context context;
    private ArrayList<String> data;
    public myAdapter(Context context, ArrayList<String> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.data_layout,parent,false);
        Myholder holder = new Myholder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        String name = data.get(position);
        holder.name.setText(name);

    }



    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class Myholder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView name;

        public Myholder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.names);
        }
    }
}
