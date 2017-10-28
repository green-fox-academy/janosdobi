package com.greenfoxacademy.bankofsimba.configuration;

import com.greenfoxacademy.bankofsimba.models.Bank;
import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Provider {

    @Bean
    public Bank bank(){
        return new Bank();
    }

    @Bean
    public BankAccount bankAccount() {
        return new BankAccount();
    }
}