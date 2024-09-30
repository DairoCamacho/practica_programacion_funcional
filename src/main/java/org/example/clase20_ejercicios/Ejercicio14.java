package org.example.clase20_ejercicios;
/*
    Problema:
    Dado la matriz de números, aplana la misma, posteriormente deberás obtener:
    1. El menor
    2. El mayor
    3. La suma de todos sus elementos
    4. El promedio
    5. El producto.
 */

import java.util.Arrays;

public class Ejercicio14 {
    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] arrayResult = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        System.out.println(Arrays.stream(arrayResult).min().orElseThrow()); // 1
        System.out.println(Arrays.stream(arrayResult).max().orElseThrow()); // 9
        System.out.println(Arrays.stream(arrayResult).sum()); // 45
        System.out.println(Arrays.stream(arrayResult).average().orElseThrow()); // 5.0
        System.out.println(Arrays.stream(arrayResult).reduce((a, b) -> a * b).orElseThrow()); // 362880
    }
}