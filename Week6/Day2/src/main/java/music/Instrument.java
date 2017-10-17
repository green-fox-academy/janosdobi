package main.java.music;

public abstract class Instrument {

    private String name;

    abstract void play();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
