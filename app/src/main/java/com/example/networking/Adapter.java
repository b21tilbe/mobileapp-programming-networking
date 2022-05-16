package com.example.networking;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class Adapter {

    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) i din Adapter
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false));

}
