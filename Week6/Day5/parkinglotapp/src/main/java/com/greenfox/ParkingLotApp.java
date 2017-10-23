package com.greenfox;

public class ParkingLotApp {

    public static void main(String[] args) {

        ParkingLot myLot = new ParkingLot();

        for (Color name: myLot.countSameColorCars().keySet()){
            System.out.println(name + " " + myLot.countSameColorCars().get(name));
        }

        System.out.println();

        for (Type name: myLot.countSameTypeCars().keySet()){
            System.out.println(name + " " + myLot.countSameTypeCars().get(name));
        }

        System.out.println();

        System.out.println(myLot.getMostFrequentCar());
    }
}