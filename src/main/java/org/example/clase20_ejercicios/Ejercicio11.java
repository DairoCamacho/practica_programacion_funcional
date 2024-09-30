package org.example.clase20_ejercicios;
/*
    Problema:
    Dado el arreglo de números, devuelve el producto de todos sus elementos.
 */

import java.util.Arrays;
import java.util.OptionalInt;

public class Ejercicio11 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        OptionalInt result = Arrays.stream(arreglo).reduce((a, b) -> a * b);

        System.out.println(result.orElseThrow()); // 3628800

    }
}