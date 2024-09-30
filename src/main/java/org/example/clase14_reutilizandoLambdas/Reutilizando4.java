package org.example.clase14_reutilizandoLambdas;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reutilizando4 {
    public static void main(String[] args) {
        // requisitos filtrar nombres que comienzan por la letra A

        List<String> amigos = List.of("ana", "anabel", "fernando");
        List<String> enemigos = List.of("adriana", "joaquin", "jorge");
        List<String> conocidos = List.of("diana", "ramon", "alan", "armando");

        // podemos quitar el método estático y convertirlo en algo funcional
        /*
        public static Predicate<String> predicateSupplier(final String letra){
            return nombre -> nombre.startsWith(letra);
        }*/
        /*
        si analizamos el método estático vemos que:
                            recibe un genérico T y
                            retorna un genérico R ...
        esto es lo mismo que un Functional !!
        */
        /*
        Function<String, Predicate<String>> predicateSupplier = (String letra) -> {
            Predicate<String> predicado = nombre -> nombre.startsWith(letra);
            return predicado;
        };
        */
        // sintetizamos lo anterior a:
        Function<String, Predicate<String>> starWithLetter = letra -> string -> string.startsWith(letra);

        amigos.stream()
                .filter(starWithLetter.apply("a"))
                .forEach(System.out::println);

        enemigos.stream()
                .filter(starWithLetter.apply("j"))
                .forEach(System.out::println);

        conocidos.stream().filter(starWithLetter.apply("r")).forEach(System.out::println);
    }
}
