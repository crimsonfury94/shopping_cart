package com.example.shopping_cart.service;

import java.util.List;

public interface ShoppingService {

    boolean addItem(List<Integer> item);

    List<Integer> getItem();
}
