package org.example.clase20_ejercicios;
/*
    Problema:
    Dado el arreglo de números, devuelve otro arreglo con cada una de las raíces cuadradas
    del arreglo original.
 */

import java.util.Arrays;

public class Ejercicio12 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arrayResult = Arrays.stream(arreglo).map(x -> x * x).toArray();

        System.out.println(Arrays.toString(arrayResult)); // [1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

    }
}