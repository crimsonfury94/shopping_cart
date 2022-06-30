package com.example.shopping_cart.impl;

import com.example.shopping_cart.data.Cart;
import com.example.shopping_cart.service.ShoppingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {


    private final List<Cart> shoppingCart = new ArrayList<>();


    @Override

    public Cart addItem(Cart item) {
        Cart cart = new Cart();
       shoppingCart.add(cart);
        return cart;
    }

    @Override
    public List<Cart> getItem() {
        return shoppingCart;
    }

}
