package twentyplusone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> myDeck;
    private int cardSum;

    public Deck() {
        cardSum = 0;
        myDeck = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            Card myCard = new Card();
            if (!myDeck.contains(myCard)) {
                myDeck.add(myCard);
            }
        }
    }

    public int getCardSum() {
        return cardSum;
    }

    public void setCardSum(int cardSum) {
        this.cardSum = cardSum;
    }

    public void shuffleDeck() {
        Collections.shuffle(myDeck);
    }

    public Card pullFirst() {
        return myDeck.get(0);
    }

    public Card pullLast() {
        return myDeck.get(myDeck.size() - 1);
    }

    public Card pullRandom() {
        return myDeck.get((int) (Math.random() * 52));
    }
}
