package com.example.networklastquzi2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.example.networklastquzi2.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding ;
    String baseUrl ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        baseUrl="https://newsapi.org/v2/";
        Intent intent =getIntent();
        String category =intent.getStringExtra("category");
        String codeCountry =intent.getStringExtra("codeCountry");

        Retrofit retrofit = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build();
        ApiInterFace apiInterFace =retrofit.create(ApiInterFace.class);
        apiInterFace.getUser(codeCountry,category,"d4fe219608d24c8eac54611a59d387da").enqueue(new Callback<User>() {
            @Override
            public void onResponse(Response<User> response, Retrofit retrofit) {
                List<Article> articles =response.body().getArticles();


                UserAdapter userAdapter = new UserAdapter(articles, new ListenerOnClick() {
                    @Override
                    public void OnItemClick(Article article) {

                        Intent intent = new Intent(getBaseContext(),MainActivity2.class);
                        intent.putExtra("allData",article);
                        startActivity(intent);

                    }
                }, getBaseContext());

                binding.rv.setAdapter(userAdapter);
                binding.rv.setHasFixedSize(true);
                binding.rv.setLayoutManager(new LinearLayoutManager(getBaseContext()));

            }

            @Override
            public void onFailure(Throwable t) {
                //Log.d("yen", "onResponse: "+t.getMessage());

            }
        });





    }
}