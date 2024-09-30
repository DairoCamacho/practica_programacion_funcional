package org.example.clase20_ejercicios;
/*
    Problema:
    Dada el arreglo de cadenas, devolver el primer elemento que inicia con j.
 */

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "joaquin", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};

        Function<String, Predicate<String>> startWithLetter = letra -> str -> str.startsWith(letra);

        Optional<String> resultado = Arrays.stream(nombres)
                .filter(startWithLetter.apply("j"))
                .findFirst();
        System.out.println(resultado.orElseThrow());
    }
}