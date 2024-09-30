package org.example.clase16_aplanamiento_y_suma;

import java.util.Arrays;

public class b_FlatMap {
    public static void main(String[] args) {
        // usando prog funcional
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[] arrayPlano = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println(Arrays.toString(arrayPlano));

        // como sería sumar todos los elementos:
        System.out.println(Arrays.stream(arrayPlano).sum());
    }

}
