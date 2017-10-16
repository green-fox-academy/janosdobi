import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void testGetHighCardWhite() throws Exception{
        Game game = new Game();
        Card card = new Card("KD");
        assertEquals(card, game.getHighCard(game.whiteHand));
    }

    @Test
    public void testGetHighCardBlack() throws Exception{
        Game game = new Game();
        Card card = new Card("AH");
        assertEquals(card, game.getHighCard(game.blackHand));
    }

    @Test
    public void testGetHighHand() throws Exception{
        Game game = new Game();
        assertEquals("black", game.getHighHand());
    }
}