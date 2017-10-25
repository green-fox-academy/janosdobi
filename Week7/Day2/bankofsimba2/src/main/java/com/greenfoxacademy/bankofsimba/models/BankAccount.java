package com.greenfoxacademy.bankofsimba.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class BankAccount {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private int balance;
    @Getter
    @Setter
    private String animalType;

}
