package garden;

public class Main {
    public static void main(String[] args) {

        Flower yellow = new Flower("Yellow");
        Flower blue = new Flower("Blue");
        Tree purple = new Tree("Purple");
        Tree orange = new Tree("Orange");

        Garden myGarden = new Garden();
        myGarden.addPlant(yellow);
        myGarden.addPlant(blue);
        myGarden.addPlant(purple);
        myGarden.addPlant(orange);

        myGarden.gardenStatus();
        System.out.println();
        myGarden.waterPlants(40);
        myGarden.gardenStatus();
        System.out.println();
        myGarden.waterPlants(70);
        myGarden.gardenStatus();
    }
}
