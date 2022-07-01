package com.example.shopping_cart.service;

import com.example.shopping_cart.data.Cart;

public interface ShoppingService {

    boolean addItem(Integer item);

    Cart getItem();
}
