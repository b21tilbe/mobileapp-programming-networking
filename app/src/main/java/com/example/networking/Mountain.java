package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    String name;
    String position;
    @SerializedName("size") private int lenght;

    public String getName(String name){
        return name;
    }

    public String getPosition(String position){
        return position;
    }

    public String getLength(String length) {
        return length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPosition(String position){
       this.position = position;
    }

    public void setLength(String length) {
        this.length = length;
    }


}
