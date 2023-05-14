package com.example.myapplication2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.catviewholder> {
    ArrayList<post> posts;

    public recyclerviewadapter(ArrayList<post> cats) {
        this.posts = cats;
    }

    @NonNull
    @Override
    public catviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.post_custom_item,null,false);
        catviewholder viewholder=new catviewholder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull catviewholder holder, int position) {
        post c=posts.get(position);
        holder.iv_image.setImageResource(c.getImg());
        holder.tv_name.setText(c.getName());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class catviewholder extends RecyclerView.ViewHolder
    {
        TextView tv_name;
        ImageView iv_image;
        //holder class for recycler view
        public catviewholder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.tv_post_title);
            iv_image=itemView.findViewById(R.id.iv_post_image);

        }
    }

}
