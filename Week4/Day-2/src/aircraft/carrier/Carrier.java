package aircraft.carrier;

import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircraft> aircrafts;
    int carrierAmmo;
    int carrierHealth;

    public Carrier(int carrierAmmo, int health) {
        aircrafts = new ArrayList<Aircraft>();
        this.carrierAmmo = carrierAmmo;
        this.carrierHealth = health;
    }

    public void addAircraft(String type) {
        aircrafts.add(new Aircraft(type));
    }

    public void fill() {
        for (Aircraft a : aircrafts) {
            a.refill(carrierAmmo);
        }
    }

    public void fight(Carrier another) {
        int totalDamage = 0;
        for (Aircraft aircraft : aircrafts) {
            totalDamage += aircraft.fight();
        }
        another.carrierHealth -= totalDamage;
    }

    public void getStatus() {
        int totalDamage = 0;
        for (Aircraft a : aircrafts) {
            totalDamage += a.actAmmo * a.baseDamage;
        }
        if (carrierHealth <= 0) {
            System.out.println("It's dead, Jim! :(");
        } else {
            for (Aircraft a : aircrafts) {
                System.out.println(a.getStatus());
            }
            System.out.println("HP: " + carrierHealth + ", Aircraft count: " + aircrafts.size() + ", Ammo storage: " + carrierAmmo + ", Total Damage: " + totalDamage);
        }
    }
}
