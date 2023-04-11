package com.example.olio_vk11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private Context context;
    private ArrayList<Item> items = new ArrayList<>();

    public ItemListAdapter(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }


    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.newItem.setText(" " + items.get(position).getNewItem());
        holder.information.setText(" " + items.get(position).getInformation());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
