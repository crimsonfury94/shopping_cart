package com.example.shopping_cart.controller;

import com.example.shopping_cart.service.ShoppingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShoppingController {

    private final ShoppingService shoppingService;

    public ShoppingController(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    @GetMapping(path = "/add")
    public boolean add(@RequestParam List<Integer> item) {
        return shoppingService.addItem(item);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return shoppingService.getItem();
    }
}
