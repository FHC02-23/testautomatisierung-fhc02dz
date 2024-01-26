package org.campus02.dzettel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsDemo {

    int a;
    String s;
    boolean b;

    /**
     * 1. Step
     * Setup
     */
    @BeforeEach
    void setup() {
        a = 1; // a wird bei jedem Test 1 sein
        s = "Hallo Welt"; // bei jedem Test "Hallo Welt"
        b = true;
    }

    // 2. Step
    // Exercise
    @Test
    @DisplayName("test s auf Hallo Welt")
    void abcTest() {
        Assertions.assertEquals("Hallo Welt", s);
    }

    @Test
    void testAEquals4() {
        a = 4;
        Assertions.assertEquals(4, a);
    }

    @Test
    void testAEquals1() {
        Assertions.assertEquals(1, a);
    }

    /**
     * Überprüft, ob die Bedingung true ist
     */
    @Test
    void testAssertTrue() {
        Assertions.assertTrue(b);
    }

    /**
     * Überprüft, ob die Bedingung false ist
     */
    @Test
    void testAssertFalse() {
        b = false;
        Assertions.assertFalse(b);
        // assertFalse mit assertEquals nachgebaut
        //Assertions.assertEquals(false, b);
    }

    @Test
    void testAssertThrows() {
        int[] array = new int[1];
        array[0] = 1;

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int i = array[10];
        });
    }

}
