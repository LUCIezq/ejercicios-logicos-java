package facil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumeroUnicoDeOcurrencias {

    /**
     * Dada un vector de enteros arr, devuelve verdadero si el número de
     * ocurrencias de cada valor en la matriz es único o falso en caso contrario.
     */

    public boolean numeroUnicoDeOcurrencias(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        Set<Integer> result = new HashSet<>();

        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int num : counts.values()) {
            if (result.contains(num)) {
                return false;
            }
            result.add(num);
        }
        return true;
    }
}
