package com.example.shopping_cart.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
    @JsonProperty
    private final int item;

    public Item(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }
}
