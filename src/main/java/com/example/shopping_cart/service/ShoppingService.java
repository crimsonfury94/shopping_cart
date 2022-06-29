package com.example.shopping_cart.service;

import java.util.Collection;

public interface ShoppingService {
    boolean addItem(int id);

    Collection<Integer> getItem();
}
