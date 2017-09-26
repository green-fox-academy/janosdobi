package garden;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> garden = new ArrayList<>();

    public void addPlant(Plant p) {
        garden.add(p);
    }

    public void waterPlants(int Addwater) {
        int j = 0;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).waterNeed()) {
                j++;
            }
        }
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).waterNeed()) {
                garden.get(i).waterAmount += Addwater / j * garden.get(i).absorbRatio;
            }
        }
        System.out.println("Watering with " + Addwater);
    }
    public void gardenStatus() {
        for (int i = 0; i < garden.size(); i++) {
            System.out.println(garden.get(i).waterStatus());
        }
    }
}
