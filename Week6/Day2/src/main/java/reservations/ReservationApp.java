package main.java.reservations;

import java.util.ArrayList;
import java.util.List;

public class ReservationApp {

    public static void main(String[] args) {

        List<Reservation> reservs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            reservs.add(new Reservation());
            System.out.println(reservs.get(i));
        }
    }
}