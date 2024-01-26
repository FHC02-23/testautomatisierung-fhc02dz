package org.campus02.dzettel.rectangle;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        if (a <= 0) {
            this.a = 1;
        } else {
            this.a = a;
        }
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
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