package org.example.clase21_iterar_cadenas_chars;

import java.util.stream.IntStream;

public class IterarCadenas {
    public static void main(String[] args) {
        System.out.println("\n --- ACTUALMENTE ASÍ SE ITERA SOBRE UN ARRAY DE CADENA ---");
        // la forma actual de trabajar con array de string
        // es usando java.util.StringJoiner
        String[] arr = {"Hola", "Mundo", "Java"};
        System.out.println(String.join(" ", arr));
        // String.join por debajo hace toda la logica de Reduce

        System.out.println("\n --- PERO ITERAR UNA CADENA ES OTRO LIO ---");

        String cadena = "Hola Mundo en Java";
        /*
        * NO PODEMOS HACER: cadena.stream
        * */

        System.out.println("\n --- COMO SE ITERABA UNA CADENA ANTES DE JAVA 9 ---");
        // 1. se convertia un array de caracteres - IntStream
        char[] array = cadena.toCharArray();
        // 2. usaban IntStream y el metodo range así
        IntStream.range(0, array.length)
                .mapToObj(i-> array[i])
                .forEach(System.out::print);

        System.out.println("\n --- ACTUALMENTE ASÍ SE ITERA SOBRE UNA CADENA ---");
        cadena.chars()
                //.forEach(System.out::print); // Pero este devuelve solo números ascii
                .forEach(num-> System.out.print((char) num));

        System.out.println("\n --- Usando CHARS podemos hacer Map, Filter etc ---");
        cadena.chars()
                .filter( str -> str != 'a')
                .forEach(num-> System.out.print((char) num));



    }
}
