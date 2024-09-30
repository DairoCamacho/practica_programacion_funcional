package org.example.clase14_reutilizandoLambdas;

import java.util.List;
import java.util.function.Predicate;

public class Reutilizando3 {
    public static void main(String[] args) {

        // requisitos filtrar nombres que comienzan por la letra A

        List<String> amigos = List.of("ana", "anabel", "fernando");
        List<String> enemigos = List.of("adriana", "joaquin", "jorge");
        List<String> conocidos = List.of("diana", "ramon", "alan", "armando");

        // En el caso anterior vemos que se pueden repetir los predicados por cada caso
        // podemos sintetizar más si creamos una Higth Orden Function basandonos en un metodo estico
        // reemplazamos la expresión lambda por la Higth Orden Function
        amigos.stream().filter(predicateSupplier("a")).forEach(System.out::println);
        enemigos.stream().filter(predicateSupplier("j")).forEach(System.out::println);
        conocidos.stream().filter(predicateSupplier("d")).forEach(System.out::println);

    }

    public static Predicate<String> predicateSupplier(final String letra) {

        return nombre -> nombre.startsWith(letra);
    }
}
