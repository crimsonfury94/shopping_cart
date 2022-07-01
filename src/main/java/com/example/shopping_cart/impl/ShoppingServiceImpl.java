package com.example.shopping_cart.impl;

import com.example.shopping_cart.data.Cart;
import com.example.shopping_cart.service.ShoppingService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private final Cart cart;

    public ShoppingServiceImpl(Cart cart) {
        this.cart = cart;
    }


    @Override

    public boolean addItem(Integer item) {
        return cart.getCart().add(item);
    }

    @Override
    public Cart getItem() {
        return cart;
    }

}
