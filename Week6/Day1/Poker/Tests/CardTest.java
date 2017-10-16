import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CardTest {

    @Test
    public void testCard() throws Exception {
        Card card = new Card("4C");
        assertEquals("4C", card.toString());
    }

    @Test
    public void testGetValue() throws Exception {
        Card card = new Card("AH");
        assertEquals(12, card.getValue());
    }

    @Test
    public void testGetSuitValue() throws Exception {
        Card card = new Card("AH");
        assertEquals(2, card.getSuitValue());
    }
}