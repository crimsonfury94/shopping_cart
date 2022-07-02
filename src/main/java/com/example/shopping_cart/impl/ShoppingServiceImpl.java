package com.example.shopping_cart.impl;

import com.example.shopping_cart.data.Cart;
import com.example.shopping_cart.service.ShoppingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private final Cart cart;

    public ShoppingServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override
    public boolean addItem(List<Integer> item) {
        return cart.getCart().addAll(item);
    }

    @Override
    public List<Integer> getItem() {
        return cart.getCart();
    }

}
