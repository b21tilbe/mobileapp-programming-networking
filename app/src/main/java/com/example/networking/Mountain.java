package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    String name;
    String position;
    @SerializedName("size") private int length;

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public int getLength() {
        return length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPosition(String position){
       this.position = position;
    }

    public void setLength(int length) {
        this.length = length;
    };
}
