package com.example.shopping_cart.data;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {

    private final List<Integer> cart;

    public Cart() {
        this.cart = new ArrayList<>();
    }

    public List<Integer> getCart() {
        return cart;
    }
}
