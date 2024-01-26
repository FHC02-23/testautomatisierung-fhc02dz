package org.campus02.student.calculator;

public class Calculator {

    public static void main(String[] args) {
        int resultAdd = add(2,2);
        System.out.println("resultAdd = " + resultAdd);

        int resultSub = subtract(2, 2);
        System.out.println("resultSub = " + resultSub);
    }

    /**
     * addiere 2 zahlen
     * @param a zahl 1
     * @param b zahl 2
     * @return ergebnis der addition
     */
    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    /**
     * subtrahiere 2 zahlen
     * @param a zahl 1
     * @param b zahl 2
     * @return ergebnis der subtrahierung
     */
    public static int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    /**
     * 2 Zahlen multiplizieren
     * @param a zahl 1
     * @param b zahl 2
     * @return ergebnis der Multiplikation
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
}