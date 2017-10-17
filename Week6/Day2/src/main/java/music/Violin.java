package main.java.music;

public class Violin extends StringedInstrument {

    public Violin() {
        super.setNumberOfStrings(4);
        super.setName("Violin");
    }

    public Violin(int numberOfStrings) {
        super(numberOfStrings);
        super.setName("Violin");
    }

    @Override
    String sound() {
        return "Screech";
    }
}
