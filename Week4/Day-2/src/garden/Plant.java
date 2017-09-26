package garden;

public class Plant {

    int waterAmount;
    String color;
    double absorbRatio;

    public String waterStatus() {
        if (waterAmount < 5) {
            return "The " + this.color + " Flower needs water!";
        }
        return "The " + this.color + " Flower does not need water!";
    }

    public boolean waterNeed() {
        return (waterAmount < 5);
    }
}
