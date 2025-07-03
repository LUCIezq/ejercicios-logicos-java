package facil;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroUnicoTest {

    private NumeroUnico solucion;

    @BeforeEach
    public void setUp() {
        solucion = new NumeroUnico();
    }

    @Test
    public void test1() {
        int[] nums = {2, 2, 1};
        int esperado = 1;
        int obtenido = solucion.singleNumber(nums);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void test2() {
        int[] nums = {4, 1, 2, 1, 2};
        int esperado = 4;
        int obtenido = solucion.singleNumber(nums);
        assertEquals(esperado, obtenido);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        int esperado = 1;
        int obtenido = solucion.singleNumber(nums);
        assertEquals(esperado, obtenido);
    }
}
