package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de cadenas, ordenarlo alfabéticamente y mostrarlo en pantalla.
    Ordenarlo primero de manera ascendente, posteriormente en orden inverso.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio06 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia"};

        Arrays.stream(nombres)
                .sorted()
                .forEach(System.out::println);

        Arrays.stream(nombres)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}