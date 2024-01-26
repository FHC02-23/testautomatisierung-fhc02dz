package org.campus02.dzettel.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    Rectangle r;

    @BeforeEach
    void setUp() {
        r = new Rectangle(2, 4);
    }

    @Test
    void testConstructor() {
        Assertions.assertEquals(2, r.getA());
        Assertions.assertEquals(4, r.getB());
    }

    @Test
    void testConstructorAlessThanZero() {
        Rectangle r2 = new Rectangle(-1, 4);
        Assertions.assertEquals(1, r2.getA());
        Assertions.assertEquals(4, r2.getB());
    }

    @Test
    void testConstructorAEqualsZero() {
        Rectangle r2 = new Rectangle(0, 4);
        Assertions.assertEquals(1, r2.getA());
        Assertions.assertEquals(4, r2.getB());
    }

    @Test
    void berechneUmfang() {
        int umfang = r.berechneUmfang();
        Assertions.assertEquals(12, umfang);
    }

    @Test
    void berechneFlaeche() {
        Assertions.assertEquals(8, r.berechneFlaeche());
    }
}