package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de números, encontrar el número más grande y el más pequeño.
 */

import java.util.Arrays;
import java.util.OptionalInt;

public class Ejercicio03 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // el número más grande.
        OptionalInt numeroMasGrande = Arrays.stream(arreglo).max();
        System.out.println(numeroMasGrande.orElseThrow()); // 10

        // el número más pequeño.
        OptionalInt numeroMasPequenno = Arrays.stream(arreglo).min();
        System.out.println(numeroMasPequenno.orElseThrow()); // 1
    }
}