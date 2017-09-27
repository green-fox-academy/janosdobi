import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(6, extension.add(3, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(11, extension.add(7, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(8, extension.maxOfThree(5, 5, 8));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(11, extension.maxOfThree(6, 11, 5));
    }

    @Test
    void testMedian_four() {
        assertEquals(4, extension.median(Arrays.asList(7,5,3,4)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testIsVowel_a() {
        assertTrue(extension.isVowel('a'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("avalmava", extension.translate("alma"));
    }

    @Test
    void testTranslate_kolbice() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}