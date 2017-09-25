import java.util.ArrayList;
import java.util.List;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    public Sharpie(String color, float width){
        this.color = color;
        this.width = width;
    }

    public void use(){
        inkAmount -= 5;
    }
}

class SharpieSet {

    List<Sharpie> sharpies = new ArrayList<>();

    public SharpieSet (){
    }

    int countUsable() {
        int count = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                count++;
            }
        }
        return count;
    }

    void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
            }
        }
    }

    void add (Sharpie sharpie) {
        sharpies.add(sharpie);
    }


}

class Main3 {
    public static void main(String[] args) {
        Sharpie redBig = new Sharpie("red", (float) 43.6);
        redBig.use();
        System.out.println(redBig.inkAmount);
        System.out.println(redBig.color);

        SharpieSet sharpiesList = new SharpieSet();
        sharpiesList.add(redBig);

        System.out.println(sharpiesList.countUsable());


    }
}
