package com.example.shopping_cart.controller;

import com.example.shopping_cart.service.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping(path = "/add")
    public boolean add(int id) {
        return shoppingService.addItem(id);
    }

    @GetMapping(path = "/get")
    public Collection<Integer> get() {
        return shoppingService.getItem();
    }
}
