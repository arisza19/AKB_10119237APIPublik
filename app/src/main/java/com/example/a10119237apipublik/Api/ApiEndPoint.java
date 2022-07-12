package com.example.a10119237apipublik.Api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
Developed by AriszaZufarFathurrahman
NIM : 10119237
Nama : Arisza Zufar Fathurrahman
Kelas : IF-6
on Tuesday, July 12 2022
*/

public class ApiEndPoint {
    private static final String BASE_URL = "https://celebrity-by-api-ninjas.p.rapidapi.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient(){
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();


        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit;
    }
}
