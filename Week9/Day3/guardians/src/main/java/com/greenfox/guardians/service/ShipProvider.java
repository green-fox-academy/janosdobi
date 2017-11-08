package com.greenfox.guardians.service;

import com.greenfox.guardians.model.Ship;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShipProvider {

    @Bean
    public Ship ship() {
        return new Ship();
    }
}
