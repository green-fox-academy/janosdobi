import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck extends ArrayList<Card>{

    ArrayList<Card> cards;
    ArrayList<String> colors;
    ArrayList<String> values;
    int count;

    public Deck(int count) {
        cards = new ArrayList<>();
        this.count = count;
        colors = new ArrayList<>(Arrays.asList("Clubs", "Spades", "Diamonds", "Hearts"));
        values = new ArrayList<>(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"));
        int i = cards.size();

        for (; i < count; i++) {
            Card temp = new Card(colors.get(i % 4), values.get((int) (Math.random() * 12)));
            if (!cards.contains(temp)) {
                cards.add(temp);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card draw() {
        Card drawn = cards.get(count - 1);
        cards.remove(count - 1);
        return drawn;
    }

    @Override
    public String toString() {
        return count + " cards - " + count / 4 + " Clubs " + count / 4 + " Spades " + count / 4 + " Diamonds " + count / 4 + " Hearts";
    }
}
