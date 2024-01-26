package org.campus02.student.rectangle;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * berechne den Umfang
     * @return
     */
    public int berechneUmfang() {
        return 2 * (a + b);
    }

    /**
     * berechne die Fläche
     * @return
     */
    public int berechneFlaeche() {
        return a * b;
    }
}