package com.greenfox.jani.parkinglot;

import java.util.*;

public class Vehicle {

    public static void main(String[] args) {

        List<Car> vehicles = new ArrayList<>();
        for (int i = 0; i < 256; i++) {
            vehicles.add(new Car());
        }

        HashMap<Color, Integer> colorMap = new HashMap<>();
        for (int i = 0; i < vehicles.size(); i++) {
            if (!colorMap.containsKey(vehicles.get(i).getColor())) {
                colorMap.put(vehicles.get(i).getColor(), 1);
            } else {
                colorMap.put(vehicles.get(i).getColor(), colorMap.get(vehicles.get(i).getColor()) + 1);
            }
        }
        for (Color name: colorMap.keySet()){
            System.out.println(name + " " + colorMap.get(name));
        }

        System.out.println();

        HashMap<Type, Integer> typeMap = new HashMap<>();
        for (int i = 0; i < vehicles.size(); i++) {
            if (!typeMap.containsKey(vehicles.get(i).getType())) {
                typeMap.put(vehicles.get(i).getType(), 1);
            } else {
                typeMap.put(vehicles.get(i).getType(), typeMap.get(vehicles.get(i).getType()) + 1);
            }
        }
        for (Type name: typeMap.keySet()){
            System.out.println(name + " " + typeMap.get(name));
        }

        HashMap<String, Integer> carMap = new HashMap<>();
        for (int i = 0; i < vehicles.size(); i++) {
            if (!carMap.containsKey(vehicles.get(i).getColor().toString() + " " + (vehicles.get(i).getType()))) {
                carMap.put(vehicles.get(i).getColor().toString() + " " + (vehicles.get(i).getType()), 1);
            } else {
                carMap.put(vehicles.get(i).getColor().toString() + " " + (vehicles.get(i).getType()), carMap.get(vehicles.get(i).getColor().toString() + " " + (vehicles.get(i).getType())) + 1);
            }
        }
        Integer[] array = new Integer[vehicles.size()];
        for (int i = 0; i < vehicles.size(); i++) {
            array[i] = carMap.get(vehicles.get(i).getColor().toString() + " " + (vehicles.get(i).getType()));
        }
        Arrays.sort(array);
        String output = "";
        for (Map.Entry<String, Integer> entry : carMap.entrySet()) {
            if (entry.getValue().equals(array[vehicles.size() - 1])) {
                output = entry.getKey();
            }
        }
        System.out.println(output);
    }
}