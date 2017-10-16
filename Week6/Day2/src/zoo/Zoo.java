package zoo;

public class Zoo {

    public static void main(String[] args) {

        Animal reptile = new Reptile("Crocodile");
        Animal mammal = new Mammal("Koala");
        Animal bird = new Bird("Parrot");

        System.out.println("Who want a baby?");
        System.out.println(reptile.getName() + ", " + reptile.wantChild());
        System.out.println(mammal.getName() + ", " + mammal.wantChild());
        System.out.println(bird.getName() + ", " + bird.wantChild());
    }
}