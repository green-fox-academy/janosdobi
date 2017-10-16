package zoo;

public class Bird extends Animal {

    public Bird(String name) {
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
