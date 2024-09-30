package org.example.clase11_Map_apiSream;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase11 {
    public static void main(String[] args) {

        List<String> listaNombres = List.of("fernando", "ana", "diana", "jéssica");
        // Interface Stream
        // Stream es una secuencia de datos que puede ser operados de forma secuencial

        // e.g. convertir en mayusculas // String -> String
        final List<String> nombreUpperCase = listaNombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .toList();
        System.out.println(nombreUpperCase);

        // e.g. no retornar nada e imprimir solamente
        listaNombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .forEach(System.out::println);

        // e.g. de String a Integer
        final List<Integer> longitudNombres = listaNombres.stream()
                .map(nombre -> nombre.length())
                .toList();
    }
}