import java.util.ArrayList;
import java.util.List;

public class Pirate {

    String name;
    int intoxLevel = 0;
    boolean alive = true;

    public void howsItGoingMate() {
        if (intoxLevel < 4) {
            System.out.println("Pour me anodder!");
        } else if (!alive) {
            System.out.println("He's dead :(");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public void drinkSomeRum() {
        if(alive) {
            intoxLevel++;
        } else {
            System.out.println("He's dead :(");
        }
    }

    public void die() {
        alive = false;
    }

    public void brawl(Pirate p) {
        int chance = (int) (1 + (Math.random() * 100));
        System.out.println(chance);
        if (chance < 33) {
            die();
            System.out.println("He is dead!");
        } else if (chance >= 33 && chance < 66) {
            System.out.println(p.name + " is dead");
            p.die();
        } else {
            System.out.println("Both pirates have passed out!");
        }
    }

    public static void main(String[] args) {
        Pirate jackSparrow = new Pirate();
        jackSparrow.name = "Jack Sparrow";
        Pirate blackBeard = new Pirate();
        blackBeard.name = "BlackBeard";
        for (int i = 0; i < 5; i++) {
            jackSparrow.drinkSomeRum();
        }
        jackSparrow.howsItGoingMate();
        jackSparrow.brawl(blackBeard);
    }

}
