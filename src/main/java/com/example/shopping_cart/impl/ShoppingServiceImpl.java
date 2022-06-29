package com.example.shopping_cart.impl;

import com.example.shopping_cart.service.ShoppingService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    private final List<Integer> shoppingCart = new ArrayList<>();


    @Override
    public boolean addItem(int id) {

        return shoppingCart.add(id);
    }

    @Override
    public Collection<Integer> getItem() {
        return shoppingCart;
    }

}
