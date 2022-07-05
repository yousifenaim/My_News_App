package com.example.networklastquzi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.networklastquzi2.databinding.ActivityMainCategoryBinding;

public class MainActivityCategory extends AppCompatActivity {

    ActivityMainCategoryBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainCategoryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent =getIntent();
       String codeCountry = intent.getStringExtra("codeCountry");

        binding.imgBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","business");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);

            }
        });

        binding.imgHealth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","health");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);
            }
        });

        binding.imgEntertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","entertainment");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);
            }
        });

        binding.imgSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","sports");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);
            }
        });

        binding.imgTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","technology");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);
            }
        });

        binding.imgScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(getBaseContext(),MainActivity.class);
                intent.putExtra("category","science");
                intent.putExtra("codeCountry",codeCountry);
                startActivity(intent);
            }
        });

    }
}