import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RulesTest {

    Rules rules;

    @Before
    public void before() {
        rules = new Rules();
    }

    @Test
    public void getHighCard() {
        assertEquals("KD", rules.getHighCard());
    }
}