package main.java.music;

public class BassGuitar extends StringedInstrument {

    public BassGuitar() {
        super.setNumberOfStrings(4);
        super.setName("Bass Guitar");
    }

    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
        super.setName("Bass Guitar");
    }

    @Override
    String sound() {
        return "Duum-duum-duum";
    }
}
