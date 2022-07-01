package com.example.shopping_cart.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@Component
@RequestScope
public class Cart {

    private final List<Integer> cart;

    public Cart(List<Integer> cart) {
        this.cart = cart;
    }


    public List<Integer> getCart() {
        return cart;
    }
}
