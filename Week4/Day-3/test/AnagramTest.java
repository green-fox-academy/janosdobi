import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    @Test
    public void anagram() throws Exception {
        Anagram a = new Anagram();
        String s1 = "listen";
        String s2 = "silent";
        assertTrue(a.anagram(s1, s2));
    }

    @Test
    public void anagramEmpty() throws Exception {
        Anagram a = new Anagram();
        String s1 = "";
        String s2 = "";
        assertFalse(a.anagram(s1, s2));
    }

    @Test
    public void anagramNotequal() throws Exception {
        Anagram a = new Anagram();
        String s1 = "abc";
        String s2 = "abcd";
        assertFalse(a.anagram(s1, s2));
    }

}