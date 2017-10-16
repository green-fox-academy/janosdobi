import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {

    protected List<Card> whiteHand;
    protected List<Card> blackHand;

    public Game() {
        whiteHand = new ArrayList<>(Arrays.asList(new Card("2H"), new Card("3D"),
                new Card("5S"), new Card("9C"), new Card("KD")));
        blackHand = new ArrayList<>(Arrays.asList(new Card("2C"), new Card("3H"),
                new Card("4S"), new Card("8C"), new Card("AH")));
    }

    public Card getHighCard(List<Card> list) {
        List<Integer> valuesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            valuesList.add(list.get(i).getValue());
        }
        Collections.sort(valuesList);
        return list.get(valuesList.indexOf(valuesList.get(4)));
    }

    public String getHighHand() {
        if (getHighCard(whiteHand).getValue() > getHighCard(blackHand).getValue()) {
            return "white";
        } else {
            return "black";
        }
    }
}