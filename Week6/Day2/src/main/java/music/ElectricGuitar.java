package main.java.music;

public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        super.setNumberOfStrings(6);
        super.setName("Electric Guitar");
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
        super.setName("Electric Guitar");
    }

    @Override
    String sound() {
        return "Twang";
    }
}
