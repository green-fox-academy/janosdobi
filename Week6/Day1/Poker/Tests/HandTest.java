import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HandTest {

    Hand hand;

    @Before
    public void before() {
        hand = new Hand();
    }

    @Test
    public void generateTest() throws Exception {
        assertEquals(10, hand.bothHands.size());
    }

    @Test
    public void testNumberOfWhiteCards() {
        assertEquals(5, hand.white.size());
    }

    @Test
    public void testNumberOfBlackCards() {
        assertEquals(5, hand.black.size());
    }

}