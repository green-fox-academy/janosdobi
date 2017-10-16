package zoo;

public class Reptile extends Animal {

    public Reptile(String name) {
        super(name);
    }

    @Override
    public void greet() {

    }

    @Override
    public String wantChild() {
        return "want a child from an egg!";
    }

    @Override
    public void move() {

    }

    @Override
    public void sleep() {

    }
}
