package com.example.networklastquzi2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    List<Article> articles ;
    ListenerOnClick listener;
    Context context ;

    public UserAdapter(List<Article> articles, ListenerOnClick listener, Context context) {
        this.articles = articles;
        this.listener = listener;

        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custm,parent,false);
        UserViewHolder userViewHolder = new UserViewHolder(view);

        return userViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        Article p = articles.get(position);
        holder.title.setText(p.getTitle());

        holder.desc.setText(p.getSource().getName());
        Glide.with(context).load(p.getUrlToImage()).into(holder.imageView);
        holder.article=p;


    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    class  UserViewHolder extends RecyclerView.ViewHolder{

        TextView title , desc ;
        Article article;
        ImageView imageView ;
        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title);
            desc =itemView.findViewById(R.id.tv_desc);
            imageView=itemView.findViewById(R.id.imageView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.OnItemClick(article);
                }
            });







        }
    }
}
