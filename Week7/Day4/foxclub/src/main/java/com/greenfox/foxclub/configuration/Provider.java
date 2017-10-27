package com.greenfox.foxclub.configuration;

import com.greenfox.foxclub.model.Drink;
import com.greenfox.foxclub.model.Food;
import com.greenfox.foxclub.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Provider {

    @Bean
    public Fox fox() {
        return new Fox();
    }

    @Bean
    public Food food() {
        return new Food();
    }

    @Bean
    public Drink drink() {
        return new Drink();
    }
}