package com.example.shopping_cart.impl;

import com.example.shopping_cart.data.Cart;
import com.example.shopping_cart.service.ShoppingService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {
    private final List<Cart> shoppingCart = new ArrayList<>();


    @Override
    public Cart addItem(int item) {
        Cart cart = new Cart(item);
        shoppingCart.add(cart);
        return cart;
    }

    @Override
    public List<Cart> getItem() {
        return shoppingCart;
    }

}
