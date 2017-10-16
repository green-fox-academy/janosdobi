import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        if (romanNumbers == null) {
        romanNumbers = new RomanNumbers();
        }
    }

    @Test
    public void convertToRomanI() throws Exception {
        assertEquals("I", romanNumbers.convertToRoman(1));
    }

    @Test
    public void convertToRomanII() throws Exception {
        assertEquals("II", romanNumbers.convertToRoman(2));
    }

    @Test
    public void convertToRomanIII() throws Exception {
        assertEquals("III", romanNumbers.convertToRoman(3));
    }

    @Test
    public void convertToRomanIV() throws Exception {
        assertEquals("IV", romanNumbers.convertToRoman(4));
    }

    @Test
    public void convertToRomanV() throws Exception {
        assertEquals("V", romanNumbers.convertToRoman(5));
    }

    @Test
    public void convertToRomanVI() throws Exception {
        assertEquals("VI", romanNumbers.convertToRoman(6));
    }

    @Test
    public void convertToRomanVII() throws Exception {
        assertEquals("VII", romanNumbers.convertToRoman(7));
    }

    @Test
    public void convertToRomanVIII() throws Exception {
        assertEquals("VIII", romanNumbers.convertToRoman(8));
    }

    @Test
    public void convertToRomanIX() throws Exception {
        assertEquals("IX", romanNumbers.convertToRoman(9));
    }



}