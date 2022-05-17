package com.example.networking;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MountainAdapter extends RecyclerView.Adapter<ViewHolder>{

    private List<Mountain>Mountains = new ArrayList();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int number) {
        Mountain mountain = Mountains.get(number);

        holder.name.setText(mountain.getName());


    }

    @Override
    public int getItemCount() {
        return 0;
    };


}

