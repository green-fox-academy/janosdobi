package garden;

public class Tree extends Plant {

    public Tree(String color) {
        this.color = color;
        absorbRatio = 0.4;
        waterAmount = 0;
    }

    public String waterStatus() {
        if (waterAmount < 10) {
            return "The " + this.color + " Tree needs water!";
        }
        return "The " + this.color + " Tree does not need water!";
    }

    public boolean waterNeed() {
        return (waterAmount < 10);
    }
}
