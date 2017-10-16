import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rules {

    Hand hand;

    public Rules() {
        hand = new Hand();
    }

    public String getHighCard() {
        List<String> myList= new ArrayList<>();
        for (int i = 0; i < hand.bothHands.size(); i++) {
            myList.add(hand.bothHands.get(i).toString());
        }
        Collections.sort(myList);
        return myList.get(9);
    }
}