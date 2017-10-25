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

    public String getBalanceInString() {
        return String.format("%.2f Zebra", balance);
    }

    public BankAccount() {
        this.isKing = false;
        this.animalType = "lion";
        this.name = "Mufasa";
        this.balance = 1000.00;
        this.isBadGuy = false;
    }

    public void raiseTheBalance() {
        setBalance(getBalance() + 100.0);
    }
}