package com.example.shopping_cart.data;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;


public class Cart {

    @Bean
    @RequestScope
    public Cart cart() {
        return new Cart();
    }
}
