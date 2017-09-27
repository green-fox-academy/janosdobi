import java.util.ArrayList;
import java.util.List;

public class Animals {

    int hunger;
    int thirst;

    public Animals() {
        hunger = 50;
        thirst = 50;
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

    List<Animals> animals = new ArrayList<>();

    int slots = 20;

    void breed (Animals animal) {
        if (slots > 0) {
            animals.add(animal);
        }
        slots--;
    }

    void slaughter () {
        Animals temp = new Animals();
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

    public Animals get(int i) {
        return animals.get(i);
    }
}
