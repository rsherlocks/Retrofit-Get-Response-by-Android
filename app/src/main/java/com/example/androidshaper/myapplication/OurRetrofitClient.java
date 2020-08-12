package com.example.androidshaper.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface OurRetrofitClient {

    //ArrayListResponse

//    @GET("continents")
//    Call<DataListClass> getData(@Query("api_token") String token);

    //QueryResponse

    @GET("continents/{id}")
    Call<ObjectQuery> getData(@Path("id") int id, @Query("api_token") String token);
}
