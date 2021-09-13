package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAdapter extends RecyclerView.Adapter <MyAdapter.MyViewHolder> {

    content content[];
    Context context;

    public MyAdapter (Context ct,content o[]){
        content=o;
        context=ct;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.text1.setText(content[position].getName());
        holder.text2.setText(content[position].getProject());
        holder.myImage.setImageResource(content[position].getImage());
       // Glide.with(context).load("https://www.pngplay.com/wp-content/uploads/1/Login-PNG.png").placeholder(R.drawable.brokenicon).into(holder.myImage);

    }

    @Override
    public int getItemCount() {
        return content.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.name)
        TextView text1;
        @BindView(R.id.project)
        TextView text2;
        @BindView(R.id.imageView17)
        ImageView myImage;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ButterKnife.bind(this,itemView);
//            text1=itemView.findViewById(R.id.name);
//            text2=itemView.findViewById(R.id.project);
//            myImage=itemView.findViewById(R.id.imageView17);


        }
    }
}
