package com.greenfoxacademy.bankofsimba.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    @Autowired
    BankAccount account;

    private List<Animal> animals;
    private List<Double> money;
    private List<String> types;
    private List<BankAccount> myAccounts;

    public Bank() {
        this.animals = Arrays.asList(new Animal("Scar"), new Animal("Timon"), new Animal("Pumba"), new Animal("Rafiki"), new Animal("Mufasa"));
        this.money = Arrays.asList(1000.00, 0.00, 0.00, 5000.00, 10000.00);
        this.types = Arrays.asList("lion", "rat", "pig", "monkey", "lion");
    }

    public List<BankAccount> getAccounts() {
        List<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            accounts.add(new BankAccount(animals.get(i), money.get(i), types.get(i), false, false));
            if (accounts.get(i).getAnimal().equals("Mufasa")) {
                accounts.get(i).setKing(true);
            }
            if (i % 2 == 0) {
                accounts.get(i).setBadGuy(true);
            }
        }
        return accounts;
    }

    public void raiseTheBalance(BankAccount a) {
        if (!a.isKing()) {
            a.setBalance(a.getBalance() + 10.0);
        } else {
            a.setBalance(a.getBalance() + 100.0);
        }
    }
}