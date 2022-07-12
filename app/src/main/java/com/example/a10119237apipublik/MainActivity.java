package com.example.a10119237apipublik;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a10119237apipublik.Adapter.CelebrityAdapter;
import com.example.a10119237apipublik.Api.ApiEndPoint;
import com.example.a10119237apipublik.Api.ApiService;
import com.example.a10119237apipublik.Model.CelebrityModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/*
Developed by AriszaZufarFathurrahman
NIM : 10119237
Nama : Arisza Zufar Fathurrahman
Kelas : IF-6
on Tuesday, July 12 2022
*/

public class MainActivity extends AppCompatActivity {

    private static final String API_KEY = "cc99dae27bmshbef27c9bf990160p128156jsn352904077604";
    private CelebrityAdapter viewAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner List = findViewById(R.id.spinner);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle("THOR Love and Thunder Cast");

        viewAdapter = new CelebrityAdapter(this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView = findViewById(R.id.recyclerCelebrity);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(viewAdapter);

        Button Submit = findViewById(R.id.submit);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadDataCelebrity(List.getSelectedItem().toString());
            }
        });
    }
    private void loadDataCelebrity(String list) {
        ApiService api = ApiEndPoint.getClient().create(ApiService.class);
        Call<List<CelebrityModel>> call = api.groupList(API_KEY,list);
        call.enqueue(new Callback<List<CelebrityModel>>() {
            @Override
            public void onResponse(Call<List<CelebrityModel>> call, Response<List<CelebrityModel>> response) {
                viewAdapter.setCelebrityModelList(response.body());
            }

            @Override
            public void onFailure(Call<List<CelebrityModel>> call, Throwable t) {

            }
        });
    }

}