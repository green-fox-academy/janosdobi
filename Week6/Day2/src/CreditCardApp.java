import com.greenfox.bx.*;

import java.util.ArrayList;
import java.util.List;

public class CreditCardApp {

    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cardList.add(new CreditCard(i));
            System.out.println(cardList.get(i));
        }
    }
}