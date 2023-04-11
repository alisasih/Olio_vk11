package com.example.olio_vk11;

public class Item {
    private String newItem;
    public String getNewItem() {
        return newItem;
    }

    private String information;
    public String getInformation() {
        return information;
    }

    public Item(String newItem, String information) {
        this.newItem = newItem;
        this.information = information;
    }
}
