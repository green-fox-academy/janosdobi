package main.java.music;

public abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument() {
    }

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    abstract String sound();

    @Override
    public void play() {
        System.out.println(getName() + ", a " + numberOfStrings + "-stringed instrument, that " + sound() + "s.");
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
