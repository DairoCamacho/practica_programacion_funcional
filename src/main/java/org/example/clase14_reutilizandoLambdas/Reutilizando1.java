package org.example.clase14_reutilizandoLambdas;

import java.util.List;

public class Reutilizando1 {
    public static void main(String[] args) {

        // requisitos filtrar nombres que comienzan por la letra A

        List<String> amigos = List.of("ana", "anabel", "fernando");
        List<String> enemigos = List.of("adriana", "joaquin", "jorge");
        List<String> conocidos = List.of("diana", "ramon", "alan", "armando");

        // aquí se repite mucho la misma expresión lambda
        amigos.stream().filter(s-> s.startsWith("a")).forEach(System.out::println);
        enemigos.stream().filter(s-> s.startsWith("j")).forEach(System.out::println);
        conocidos.stream().filter(s-> s.startsWith("d")).forEach(System.out::println);
    }
}
