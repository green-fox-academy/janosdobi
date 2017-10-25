package com.greenfoxacademy.bankofsimba.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class BankAccount {

    @Getter
    @Setter
    private String name;
    private double balance;
    @Getter
    @Setter
    private String animalType;

    public String getBalance() {
        return String.format("%.2f Zebra", balance);
    }

}