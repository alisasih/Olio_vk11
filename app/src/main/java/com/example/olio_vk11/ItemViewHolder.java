package com.example.olio_vk11;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView newItem, information;
    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        newItem = itemView.findViewById(R.id.rvItem);
        information = itemView.findViewById(R.id.rvInformation);
    }
}
