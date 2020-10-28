import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Algorithms1Test {

    @Test
    void randomBoyName() {
        // gammel test
        /*boolean testBool = false;
        String name = Algorithms1.randomBoyName();
        for (String currentName : new Data().getRandomDrengeNavne()) {
            if (currentName.equals(name)) {testBool = true;}
        }
        assertTrue(testBool);*/

        // new test
        assertEquals("Nam", Algorithms1.randomBoyName(15L));

    }

    @Test
    void randomName() {
        // gammel test
        /*boolean testBool = false;
        String name = Algorithms1.randomName();
        for (String currentName : new Data().getRandomDrengeNavne()) {
            if (currentName.equals(name)) {testBool = true;}
        }
        for (String currentName : new Data().getRandomPigeNavne()) {
            if (currentName.equals(name)) {testBool = true;}
        }
        assertTrue(testBool);*/

        // new test
        assertEquals("Nam", Algorithms1.randomBoyName(15L));

    }
}