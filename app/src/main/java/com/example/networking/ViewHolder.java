package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView name;

    public MountainViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.mountainName);
    }
}
