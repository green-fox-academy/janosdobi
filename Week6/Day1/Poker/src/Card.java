import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    private String suit;
    private String value;
    private List<String> suits;
    private List<String> values;

    public Card(String name){
        suits = new ArrayList<>(Arrays.asList("C", "D", "H", "S"));
        values = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));
        this.value = name.substring(0, 1);
        this.suit = name.substring(1);
    }

    public int getValue() {
        return values.indexOf(this.value);
    }

    public int getSuitValue() {
        return suits.indexOf(this.suit);
    }

    @Override
    public String toString() {
        return this.value + this.suit;
    }
}