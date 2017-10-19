package com.greenfox.jani.parkinglot;

import java.util.*;

public class ParkingLot {

    private List<Car> cars;

    public ParkingLot() {
        cars = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            cars.add(new Car());
        }
    }

    public HashMap<Color, Integer> countSameColorCars() {
        HashMap<Color, Integer> parkingCarColors = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            if (!parkingCarColors.containsKey(cars.get(i).getColor())) {
                parkingCarColors.put(cars.get(i).getColor(), 1);
            } else {
                parkingCarColors.put(cars.get(i).getColor(), parkingCarColors.get(cars.get(i).getColor()) + 1);
            }
        }
        return parkingCarColors;
    }

    public HashMap<Type, Integer> countSameTypeCars() {
        HashMap<Type, Integer> parkingCarTypes = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            if (!parkingCarTypes.containsKey(cars.get(i).getType())) {
                parkingCarTypes.put(cars.get(i).getType(), 1);
            } else {
                parkingCarTypes.put(cars.get(i).getType(), parkingCarTypes.get(cars.get(i).getType()) + 1);
            }
        }
        return parkingCarTypes;
    }

    public String getMostFrequentCar() {
        String output = "";
        for (Map.Entry<String, Integer> entry : countSameColorAndTypeCars().entrySet()) {
            if (entry.getValue().equals(collectNumberOfSameCars()[cars.size() - 1])) {
                output = entry.getKey();
            }
        }
        return output;
    }

    private HashMap<String, Integer> countSameColorAndTypeCars() {
        HashMap<String, Integer> parkingCarColorsAndTypes = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            if (!parkingCarColorsAndTypes.containsKey(cars.get(i).getColor().toString() + " " + (cars.get(i).getType()))) {
                parkingCarColorsAndTypes.put(cars.get(i).getColor().toString() + " " + (cars.get(i).getType()), 1);
            } else {
                parkingCarColorsAndTypes.put(cars.get(i).getColor().toString() + " " + (cars.get(i).getType()), parkingCarColorsAndTypes.get(cars.get(i).getColor().toString() + " " + (cars.get(i).getType())) + 1);
            }
        }
        return parkingCarColorsAndTypes;
    }

    private Integer[] collectNumberOfSameCars() {
        Integer[] collectedNumbers = new Integer[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            collectedNumbers[i] = countSameColorAndTypeCars().get(cars.get(i).getColor().toString() + " " + (cars.get(i).getType()));
        }
        Arrays.sort(collectedNumbers);
        return collectedNumbers;
    }
}