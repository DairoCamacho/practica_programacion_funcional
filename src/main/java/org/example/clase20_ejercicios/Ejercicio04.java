package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de números, encontrar cuántas veces aparece el número 10.
 */

import java.util.Arrays;

public class Ejercicio04 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};

        // contar cuántas veces aparece el número 10
        long count = Arrays.stream(arreglo)
                .filter(n -> n == 10)
                .count();
        System.out.println(count); // 3
    }
}