import java.util.ArrayList;
import java.util.List;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public Animal() {

    }

    public void eat() {
        hunger -= 1;
    }

    public void drink() {
        thirst -= 1;
    }

    public void play() {
        thirst += 1;
        hunger += 1;
    }
}

class Farm {

    List<Animal> animals = new ArrayList<>();

    int slots = 20;

    void breed (Animal animal) {
        if (slots > 0) {
            animals.add(animal);
        }
        slots--;
    }

    void slaughter () {
        Animal temp = new Animal();
        for (int i = 0; i < animals.size() - 1; i++) {
            for (int j = 0; j < animals.size() - i - 1; j++) {
                if (animals.get(j).hunger > animals.get(j + 1).hunger) {
                    temp = animals.get(j + 1);
                    animals.add(j + 1, animals.get(j));
                    animals.remove(j + 2);
                }
            }
        }
        animals.remove(0);
    }

    public Animal get(int i) {
        return animals.get(i);
    }

}

class Main2 {
    public static void main(String[] args) {
        Animal wolf = new Animal();
        System.out.println(wolf.hunger);
        wolf.play();
        System.out.println(wolf.thirst);
        wolf.drink();
        wolf.eat();
        System.out.println(wolf.thirst);
        Farm myFarm = new Farm();


        Animal tiger = new Animal();
        Animal camel = new Animal();
        myFarm.breed(tiger);
        myFarm.breed(camel);
        System.out.println(myFarm.get(1).hunger);
        }

    }


