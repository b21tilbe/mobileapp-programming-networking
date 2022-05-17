package com.example.networking;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{

    public TextView name;
    public TextView position;
    public TextView length;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.mountainName);
        position = itemView.findViewById(R.id.position);
        length = itemView.findViewById(R.id.length);
    }
}
