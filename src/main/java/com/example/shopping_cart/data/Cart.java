package com.example.shopping_cart.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


public class Cart {

    @JsonProperty
    private final int item;

    public Cart(int item) {
        this.item = item;
    }

    @Bean
    @RequestScope
    public Cart cart() {
        return new Cart(item);
    }

}
