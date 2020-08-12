package com.example.androidshaper.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit= new Retrofit
                .Builder()
                .baseUrl("https://cricket.sportmonks.com/api/v2.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        OurRetrofitClient ourRetrofitClient=retrofit.create(OurRetrofitClient.class);

//arrayListResponse

//        Call<DataListClass> call= ourRetrofitClient.getData("Your api token");
//        call.enqueue(new Callback<DataListClass>() {
//            @Override
//            public void onResponse(Call<DataListClass> call, Response<DataListClass> response) {
//                if (response.isSuccessful())
//                {
//                    Log.d("response", "onResponse:Success");
//                    List<ObjectDataClass> objectDataClassList=response.body().getData();
//                    for (ObjectDataClass objectDataClass : objectDataClassList)
//                    {
//                        Log.d("id", String.valueOf(objectDataClass.getId()) );
//                        Log.d("name", String.valueOf(objectDataClass.getName()) );
//                        Log.d("resource", String.valueOf(objectDataClass.getResource()) );
//                        Log.d("time", String.valueOf(objectDataClass.getUpdated_at()) );
//                    }
//
//                }
//                else {
//                    Log.d("response", "onResponse: Not Success");
//                }
//            }
//
//            @Override
//            public void onFailure(Call<DataListClass> call, Throwable t) {
//
//                Log.d("response", "onFailure: Message ");
//
//            }
//        });

        //QueryResponse
        Call<ObjectQuery> call= ourRetrofitClient.getData(1,"Your api token");

        call.enqueue(new Callback<ObjectQuery>() {
            @Override
            public void onResponse(Call<ObjectQuery> call, Response<ObjectQuery> response) {
                if (response.isSuccessful())
                {
                    Log.d("response", "onResponse:Success");
                    ObjectDataClass objectDataClass=response.body().getData();

                    Log.d("id", String.valueOf(objectDataClass.getId()) );
                    Log.d("name", String.valueOf(objectDataClass.getName()) );
                    Log.d("resource", String.valueOf(objectDataClass.getResource()) );
                    Log.d("time", String.valueOf(objectDataClass.getUpdated_at()) );
                }
                else
                {
                    Log.d("response", "onResponse: Not Success");
                }


            }


            @Override
            public void onFailure(Call<ObjectQuery> call, Throwable t) {
                Log.d("response", "onFailure: Message");

            }
        });

    }
}