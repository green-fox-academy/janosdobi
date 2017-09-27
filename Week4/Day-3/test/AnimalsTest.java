import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {

    @Test
    public void testHunger() throws Exception {
        Animals testSubject = new Animals();
        assertEquals(50, testSubject.hunger);
    }

    @Test
    public void testThirst() throws Exception {
        Animals testSubject = new Animals();
        assertEquals(50, testSubject.thirst);
    }

    @Test
    public void eat() throws Exception {
        Animals testSubject = new Animals();
        testSubject.eat();
        testSubject.eat();
        assertEquals(48, testSubject.hunger);
    }

    @Test
    public void drink() throws Exception {
        Animals testSubject = new Animals();
        testSubject.drink();
        testSubject.drink();
        testSubject.drink();
        assertEquals(47, testSubject.thirst);
    }

    @Test
    public void play() throws Exception {
        Animals testSubject = new Animals();
        testSubject.play();
        testSubject.play();
        assertEquals(52, testSubject.hunger);
    }

}