package org.example.clase20_ejercicios;
/*
    Problema:
    Dado el arreglo de números, obtener el promedio de todos los elementos.
 */

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ejercicio13 {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        OptionalDouble average = Arrays.stream(arreglo)
                .average();
        System.out.println(average.orElseThrow()); //5.5
    }
}