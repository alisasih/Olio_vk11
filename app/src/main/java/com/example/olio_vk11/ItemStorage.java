package com.example.olio_vk11;

import java.util.ArrayList;

public class ItemStorage {
    private ArrayList<Item> items = new ArrayList<>();

    private static ItemStorage itemStorage = null;

    private ItemStorage() {
    }

    public static ItemStorage getInstance() {
        if(itemStorage == null) {
            itemStorage = new ItemStorage();
        }
        return itemStorage;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }
}
