package org.example.clase12_filter;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UsoDeFilter {
    public static void main(String[] args) {
        List<String> nombres = List.of("fernando", "ana", "diana","jessica", "anastasia", "anabel", "pepe", "juan");

        nombres.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.endsWith("a"))
                .filter(s -> s.contains("t"))
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}