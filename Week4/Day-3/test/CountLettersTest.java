import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Before
    public void before() {



    }


    @Test
    public void countLetters() throws Exception {
        CountLetters c = new CountLetters();
        HashMap<Character, Integer> testMap= new HashMap<>();
        testMap.put('a' ,0);
        testMap.put('s', 1);
        testMap.put('d', 2);
        testMap.put('f', 3);
                assertEquals(testMap ,c.countLetters("asdf"));
    }

}