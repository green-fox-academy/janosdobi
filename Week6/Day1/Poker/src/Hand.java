import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {

    protected List<Card> bothHands;
    protected List<Card> white;
    protected List<Card> black;

/*   public Hand() {
        generateHands();
        createPlayers();
    }*/

    public Hand() {
        white = new ArrayList<>(Arrays.asList(new Card ("2H"), new Card("3D"), new Card("5S"),
                new Card("9C"), new Card("KD")));
        black = new ArrayList<>(Arrays.asList(new Card ("2C"), new Card("3H"), new Card("4S"),
                new Card("8C"), new Card("AH")));
        bothHands = new ArrayList<>(Arrays.asList(new Card ("2H"), new Card("3D"), new Card("5S"),
                new Card("9C"), new Card("KD"), new Card ("2C"), new Card("3H"), new Card("4S"),
                new Card("8C"), new Card("AH")));
    }

    public void generateHands() {
        bothHands = new ArrayList<>();
        while(bothHands.size() < 10) {
            Card card = new Card();
            if(!bothHands.contains(card)) {
                bothHands.add(card);
            }
        }
    }

    public void createPlayers() {
        white = new ArrayList<>();
        black = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            white.add(bothHands.get(i));
        }
        for (int i = 5; i < 10; i++) {
            black.add(bothHands.get(i));
        }
    }
}