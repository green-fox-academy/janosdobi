package zoo;

public abstract class Animal {

    private String name;
    private int age;
    private String gender;

    public abstract void greet();
    public abstract String wantChild();
    public abstract void move();
    public abstract void sleep();

    public String getName() {
        return this.name;
    }

    public Animal(String name) {
        this.name = name;
    }

}
