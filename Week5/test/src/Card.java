public class Card {

    protected String color;
    protected String value;

    public Card() {

    }

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " " + color;
    }

}
