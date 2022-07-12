package com.example.a10119237apipublik.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//    Tanggal Pengerjaan : 5 - 14 Juli 2022
//    NIM : 10119213
//    Nama : Tri Tafriyadi
//    Kelas : IF6

public class CelebrityModel {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("age")
    @Expose
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { this.gender = gender; }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

