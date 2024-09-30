package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de cadenas, separar a través de una serie de filtros (reutilizando lambdas),
    de tal forma que podamos separar todas las que empiezan con "a", "f", "j", "d", "r", "b".
    Recordar como generar una función que devuelve predicados.
 */

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        Function<String, Predicate<String>> starWithLetter = letra -> str -> str.startsWith(letra);

        Arrays.stream(nombres)
                .filter(starWithLetter.apply("a")) // cambiar el argumento por "a", "f", "j", "d", "r", "b"
                .forEach(System.out::println);
    }
}