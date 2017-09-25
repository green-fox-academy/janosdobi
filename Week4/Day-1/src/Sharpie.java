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

class Main3 {
    public static void main(String[] args) {
        Sharpie redBig = new Sharpie("red", (float) 43.6);
        redBig.use();
        System.out.println(redBig.inkAmount);
        System.out.println(redBig.color);
    }
}
