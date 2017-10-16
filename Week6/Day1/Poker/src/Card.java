import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {

    protected List<String> colors;
    protected List<String> values;
    protected StringBuilder name;

    public Card() {
        colors = new ArrayList<>(Arrays.asList("C", "D", "H", "S"));
        values = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));
        createCard();
    }

    public Card(String name){
        colors = new ArrayList<>(Arrays.asList("C", "D", "H", "S"));
        values = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));
        this.name = new StringBuilder();
        this.name.append(name);
    }

    public void createCard() {
        name = new StringBuilder();
        name.append(values.get((int) (Math.random() * 12)));
        name.append(colors.get((int) (Math.random() * 3)));
    }

    @Override
    public String toString() {
        return name.toString();
    }
}