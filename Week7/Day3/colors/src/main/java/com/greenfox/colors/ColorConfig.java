package com.greenfox.colors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColorConfig {

    @Bean
    public MyColor myColor() {
        return new RedColor();
    }

    @Bean
    public MyColor myColor2() {
        return new BlueColor();
    }
}