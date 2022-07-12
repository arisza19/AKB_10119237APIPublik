package com.example.a10119237apipublik.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a10119237apipublik.Model.CelebrityModel;
import com.example.a10119237apipublik.R;

import java.util.List;

/*
Developed by AriszaZufarFathurrahman
NIM : 10119237
Nama : Arisza Zufar Fathurrahman
Kelas : IF-6
on Tuesday, July 12 2022
*/

public class CelebrityAdapter extends RecyclerView.Adapter<CelebrityAdapter.MyHolder> {
    private final Context context;
    private List<CelebrityModel> celebrityModelList;

    public CelebrityAdapter(Context context){this.context =context;}

    @SuppressLint("NotifyDataSetChanged")
    public void setCelebrityModelList(List<CelebrityModel> celebrityModelList) {
        this.celebrityModelList = celebrityModelList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.name.setText(this.celebrityModelList.get(position).getName());
        holder.gender.setText(this.celebrityModelList.get(position).getGender());
        holder.nationality.setText(this.celebrityModelList.get(position).getNationality());
        holder.birthday.setText(this.celebrityModelList.get(position).getBirthday());
        holder.age.setText((this.celebrityModelList.get(position).getAge()));

    }

    @Override
    public int getItemCount() {
        if (celebrityModelList == null) {
            return 0;
        }
        return this.celebrityModelList.size();
    }


    public class MyHolder extends RecyclerView.ViewHolder{
        TextView name,gender,nationality,birthday,age;
        ImageView thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.txtName);
            gender = itemView.findViewById(R.id.txtGender);
            nationality = itemView.findViewById(R.id.txtNationality);
            birthday = itemView.findViewById(R.id.txtBirthday);
            age = itemView.findViewById(R.id.txtAge);
            //thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}
