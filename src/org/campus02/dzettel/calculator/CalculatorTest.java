package org.campus02.dzettel.calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    /**
     * wird vor jedem Test ausgeführt
     * wird benötigt, um Resource, Objekte zur Verfügung zu stellen
     */
    @BeforeEach
    void setUp() {
        System.out.println("Werde vor jedem Test aufgerufen");
    }

    /**
     * @Test gibt an, dass hier ein Test ausgeführt werden soll
     *
     * @DisplayName -> vergibt sprechende Namen für den einzelnen Test
     */
    @Test
    @DisplayName("teste addition")
    void additionsTest() {
        System.out.println("Test Addition");
        int result = Calculator.add(2, 2);
        int erwartet = 4;

        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void testSubtract() {
        //int result = Calculator.subtract(2, 1);
        //int erwartet = 1;
        Assertions.assertEquals(1, Calculator.subtract(2, 1));
    }

    /**
     * wird nach jedem Test aufgerufen
     * Setup bereinigen
     * Aufräumen
     */
    @AfterEach
    void tearDown() {
        System.out.println("tear down -> nach jedem Test");
    }

    @Test
    void compare1With1() {
        Assertions.assertTrue(Calculator.compare(1, 1));
    }

    @Test
    @DisplayName("Vergleiche 1 mit 2")
    void compare1With2() {
        Assertions.assertFalse(Calculator.compare(1, 2));
    }
}