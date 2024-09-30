package org.example.clase14_reutilizandoLambdas;

import java.util.List;
import java.util.function.Predicate;

public class Reutilizando2 {
    public static void main(String[] args) {

        // requisitos filtrar nombres que comienzan por la letra A

        List<String> amigos = List.of("ana", "anabel", "fernando");
        List<String> enemigos = List.of("adriana", "joaquin", "jorge");
        List<String> conocidos = List.of("diana", "ramon", "alan", "armando");

        // Podemos usar la interfaz funcional como un contenedor donde podemos guardar
        // una expresion lambda
        Predicate<String> starWithA = nombre -> nombre.startsWith("a");
        Predicate<String> starWithJ = nombre -> nombre.startsWith("j");
        Predicate<String> starWithD = nombre -> nombre.startsWith("d");

        // reemplazamos la expresión lambda por
        amigos.stream().filter(starWithA).forEach(System.out::println);
        enemigos.stream().filter(starWithJ).forEach(System.out::println);
        conocidos.stream().filter(starWithD).forEach(System.out::println);
    }
}
