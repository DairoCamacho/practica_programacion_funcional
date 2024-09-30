package org.example.clase19_reduce;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class Reduce {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // n(n+1)/2
        // punteros    ^  ^
        //            (t, u)
        System.out.println("Reduce tiene tres forma de implementarse: ");
        System.out.println("reduce(BinaryOperator<T> accumulator)");
        System.out.println("reduce(T identity, BinaryOperator<T> accumulator)");
        System.out.println("reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)");

        System.out.println("\n---- reduce(BinaryOperator<T> accumulator) ----");
        OptionalInt resultadoSuma = Arrays.stream(array)
                .reduce((t, u) -> t + u);
        System.out.println("Suma: " + resultadoSuma.orElseThrow());

        // lo anterior es igual a usar el metodo SUM() de Stream
        System.out.println("Suma: " + Arrays.stream(array).sum());

        // usemos la multiplicacion (nota es lo mismo que el factorial de 10 => n! donde n =10
        // hay mejores formas de calcular facotiriales usando BigIntegers
        OptionalInt resultadoProducto = Arrays.stream(array)
                .reduce((t, u) -> t * u);
        System.out.println("Faltorial: " + resultadoProducto.orElseThrow());

        // obtener el maximo
        OptionalInt resultadoMaximo = Arrays.stream(array)
                // .reduce((a,b)-> Integer.max(a,b))
                .reduce(Integer::max);
        System.out.println("Maximo: " + resultadoMaximo.orElseThrow());

        // obtener el minimo
        OptionalInt resultadoMinimo = Arrays.stream(array)
                // .reduce((a,b)-> Integer.min(a,b))
                .reduce(Integer::min);
        System.out.println("Maximo: " + resultadoMinimo.orElseThrow());

        // concatenar cadenas
        String[] cadenas = {"hola", "mundo", "en","java"};

        Optional<String> resultadoCadenas = Arrays.stream(cadenas)
                .reduce((s1, s2) -> s1 + " - " + s2);
        System.out.println(resultadoCadenas.orElseThrow());

        // imprimir arreglos en formato 1, 2, 3
        Optional<String> resultadoIntegerToString = Arrays.stream(array)
                .mapToObj(Integer::toString)
                .reduce((str1, str2) -> str1 + ", " + str2);
        System.out.println(resultadoIntegerToString.orElseThrow());
    }
}
