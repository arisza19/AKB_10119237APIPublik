package com.example.a10119237apipublik.Api;

import com.example.a10119237apipublik.Model.CelebrityModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/*
Developed by AriszaZufarFathurrahman
NIM : 10119237
Nama : Arisza Zufar Fathurrahman
Kelas : IF-6
on Tuesday, July 12 2022
*/

public interface ApiService {
    @Headers(
            "X-RapidAPI-Host: celebrity-by-api-ninjas.p.rapidapi.com"
    )
    @GET("/v1/celebrity")
    Call<List<CelebrityModel>> groupList(@Header ("X-RapidAPI-Key") String api_key, @Query("name") String name);
}
