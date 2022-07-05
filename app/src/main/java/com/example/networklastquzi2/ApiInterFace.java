package com.example.networklastquzi2;

import java.util.ArrayList;
import java.util.Queue;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public interface ApiInterFace {
//    @GET("users/2")
//    Call<ResponseBody> getUser();

//    @GET("users/{id}")
//    Call<User> getUser(
//            @Path("id") int id
//    );

    @GET("top-headlines")
    Call<User> getUser(@Query("country") String country,@Query("category") String category, @Query("apiKey") String apiKey);

}
