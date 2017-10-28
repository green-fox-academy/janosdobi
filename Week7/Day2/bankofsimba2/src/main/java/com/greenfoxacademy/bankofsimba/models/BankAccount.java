package com.greenfoxacademy.bankofsimba.models;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class BankAccount {

    private Animal animal;
    private Double balance;
    private String animalType;
    private boolean isKing;
    private boolean isBadGuy;

    public String getBalanceInString() {
        return String.format("%.2f Zebra", balance);
    }

    public BankAccount() {

    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isBadGuy() {
        return isBadGuy;
    }

    public void setBadGuy(boolean badGuy) {
        isBadGuy = badGuy;
    }
}