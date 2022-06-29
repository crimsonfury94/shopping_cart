package com.example.shopping_cart.service;

import com.example.shopping_cart.data.Cart;

import java.util.List;

public interface ShoppingService {
    Cart addItem(int item);

    List<Cart> getItem();
}
