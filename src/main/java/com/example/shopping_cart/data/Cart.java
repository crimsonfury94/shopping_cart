package com.example.shopping_cart.data;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


public class Cart {

    private int item;

    public Cart() {

    }

    public Cart(int item) {
        this.item = item;
    }

    public int getItem() {
        return item;
    }

    @Bean
    @RequestScope
    private Cart cart() {
        return new Cart();
    }


}
