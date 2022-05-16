package com.example.networking;

import android.view.View;

import androidx.appcompat.view.ActionBarPolicy;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder {

    public class ViewHolder extends ViewHolder.Adapter {
    
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
        }

        @Override
        public void onClick(View view) {
            ActionBarPolicy items;
            onClickListener.onClick(items.get(getAdapterPosition()));
        }
    }

        public class Adapter {
        }
    }
