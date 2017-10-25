package com.greenfoxacademy.bankofsimba.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BankAccount {

    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;
    private boolean isBadGuy;

    public String getBalance() {
        return String.format("%.2f Zebra", balance);
    }
}