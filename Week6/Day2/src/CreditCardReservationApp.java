import com.greenfox.bx.*;

import java.util.ArrayList;
import java.util.List;

public class CreditCardReservationApp {

    public static void main(String[] args) {
        List<CreditCard> cardReservationList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            cardReservationList.add(new CreditCardReservation(i));
            System.out.println(cardReservationList.get(i));
        }
    }
}