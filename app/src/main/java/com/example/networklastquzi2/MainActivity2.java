package com.example.networklastquzi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.example.networklastquzi2.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        Article article = (Article) intent.getSerializableExtra("allData");

        Glide.with(this).load(article.getUrlToImage()).into(binding.main2Img);
        binding.main2TvDate.setText(article.getPublishedAt());
        binding.main2TvDesc.setText(article.getDescription());
        binding.main2TvTitle.setText(article.getTitle());
        binding.main2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        Uri uri = Uri.parse(article.getUrl());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                         startActivity(intent);
            }
        });


    }
}