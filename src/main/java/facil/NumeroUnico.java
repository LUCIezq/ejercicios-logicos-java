package facil;

public class NumeroUnico {
    /**
     * Dado un array no vacío de enteros nums, cada elemento aparece dos veces excepto uno. Encuentre ese único elemento.
     *
     * Debe implementar una solución con una complejidad de ejecución lineal y usar solo espacio adicional constante.
     */

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
