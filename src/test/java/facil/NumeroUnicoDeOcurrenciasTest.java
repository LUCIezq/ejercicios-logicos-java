package facil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumeroUnicoDeOcurrenciasTest {

    private NumeroUnicoDeOcurrencias solucion;

    @BeforeEach
    public void setUp() {
        solucion = new NumeroUnicoDeOcurrencias();
    }

    @Test
    public void test1() {
        int[] numeros = {1, 2, 2, 1, 1, 3};
        assertTrue(solucion.numeroUnicoDeOcurrencias(numeros));
    }

    @Test
    public void test2() {
        int[] numeros = {};
        assertTrue(solucion.numeroUnicoDeOcurrencias(numeros));
    }

    @Test
    public void test3() {
        int[] numeros = {1, 2};
        assertFalse(solucion.numeroUnicoDeOcurrencias(numeros));
    }

    @Test
    public void test4() {
        int[] numeros = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertTrue(solucion.numeroUnicoDeOcurrencias(numeros));
    }
}
