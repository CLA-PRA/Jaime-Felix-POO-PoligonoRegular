package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static PoligonoRegular pr;

    @BeforeAll public static void setUp() {
        pr = new PoligonoRegular(4, 3.0);
    }

    @Test public void testN() {
        assertTrue(pr.getN()==4);
    }

    @Test public void testLado() {
        assertTrue(pr.getLado()==3.0);
    }

    @Test public void testPerimetro() {
        assertTrue(String.format("%.2f",pr.getPerimetro()).equals("12.00"));
    }

    @Test public void testArea() {
        assertTrue(String.format("%.2f",pr.getArea()).equals("9.00"));
    }
}