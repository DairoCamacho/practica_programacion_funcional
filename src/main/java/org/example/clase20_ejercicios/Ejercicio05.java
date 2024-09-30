package org.example.clase20_ejercicios;
/*
    Problema:
    Dado el arreglo de cadenas, imprimir cada nombre de tal forma que estén en mayúsculas,
    y que cada vocal sea reemplazada por una "X", ejemplo:
    "XNX", "FXRNXNDX" ... etc.
 */

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {

        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul"};

        Arrays.stream(nombres)
                .map(str -> str.toUpperCase().replaceAll("[AEIOUáéíóú]", "X"))
                .forEach(System.out::println);

        Arrays.stream(nombres)
                .map(c-> c.toUpperCase())
                .map(nombre -> nombre.chars()
                        .map(c -> (char) ("AEIOUáéíóú".indexOf(c) >= 0 ? 'X' : c))
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())
                .forEach(System.out::println);

        Arrays.stream(nombres)
                .map(nombre -> nombre.chars()
                        .map(c -> (char) (Character.isUpperCase(c) ? c : Character.toUpperCase(c)))
                        .map(c -> (char) ("AEIOUáéíóú".indexOf(c) >= 0 ? 'X' : c))
                        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())
                .forEach(System.out::println);
        /*
        1. Convertir a Stream de caracteres: nombre.chars() convierte cada cadena en un IntStream, donde cada elemento es el código Unicode del carácter.
        2. Mapear y reemplazar vocales:
                map(c -> ...) aplica una función a cada carácter del IntStream.
                Si el carácter es mayúscula, se mantiene igual, sino lo pone Mayuscula
                Si es una vocal se reemplaza por 'X'.
        3. Recolectar en un StringBuilder: collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) recolecta los caracteres modificados en un nuevo StringBuilder y luego lo convierte en una cadena.
        */
    }
}