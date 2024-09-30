package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de cadenas, elimina los elementos duplicados.
 */

import java.util.Arrays;

public class Ejercicio09 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        Arrays.stream(nombres)
                .distinct()
                .forEach(System.out::println);
    }
}