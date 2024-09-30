package org.example.clase22_Reduce_Avanzado;

import java.util.Arrays;
import java.util.List;

public class ReduceUsandoIdentity {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int reduccionSuma = Arrays.stream(arr)
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduccionSuma);

        int reduccionProducto = Arrays.stream(arr)
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduccionProducto);

        List<String> nombres = List.of("ana", "amelia", "fernando");

        String reduccionCadena = nombres.stream()
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(reduccionCadena);
    }
}
