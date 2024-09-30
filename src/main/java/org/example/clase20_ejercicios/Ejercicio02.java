package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de números, calcular la suma de todos los elementos.
    Posteriormente, también buscar la suma de solo los elementos pares.
 */

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // SUMAN
        int resultadoSuma = Arrays.stream(arreglo).sum();
        System.out.println(resultadoSuma); // 55

        // SUMA DE LOS PARES
        int resultadoSumaPares = Arrays.stream(arreglo)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println(resultadoSumaPares); // 30
    }
}