public class Animal {

    int hunger = 50;
    int thirst = 50;

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
class Main2 {
    public static void main(String[] args) {
        Animal wolf = new Animal();
        System.out.println(wolf.hunger);
        wolf.play();
        System.out.println(wolf.thirst);
        wolf.drink();
        wolf.eat();
        System.out.println(wolf.thirst);
    }
}

