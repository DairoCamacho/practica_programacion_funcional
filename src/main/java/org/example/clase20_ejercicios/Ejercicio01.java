package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
 */

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] resultado = Arrays.stream(arreglo)
                .filter(n -> n % 2 == 0)
                .toArray();
        System.out.println(Arrays.toString(resultado)); // [2, 4, 6, 8, 10]
    }
}