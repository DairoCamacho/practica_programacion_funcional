package org.example.clase17_SumMinMaxAverageCountDistinct;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class IntStreamYoperacionesBasicas {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 10, 4, 5, 4, 5, 4, 7, 8, 10, 2, 5, 7, 3, 1, 2, 5};

        System.out.println("\n-----DISTINCT para eliminar duplicados----");
        int[] sinRepetidos = Arrays.stream(array)
                .distinct()
                .toArray();
        System.out.println(Arrays.toString(sinRepetidos));

        System.out.println("\n-----SORTED para ordenar de menos a mayor ----");
        Arrays.stream(sinRepetidos)
                .sorted()
                .forEach(s -> System.out.print(s + ", "));

        System.out.println("\n-----FILTER para sacar solo los pares ----");
        Arrays.stream(sinRepetidos)
                .sorted()
                .filter(n -> n % 2 == 0)
                .forEach(s -> System.out.print(s + ", "));

        System.out.println("\n-----MIN para sacar el valor minimo ----");
        OptionalInt min = Arrays.stream(array).min();
        System.out.println(min.orElseThrow());

        System.out.println("\n-----MAX para sacar el valor maximo ----");
        OptionalInt max = Arrays.stream(array).max();
        System.out.println(max.orElseThrow());

        System.out.println("\n-----AVERAGE para sacar el valor maximo ----");
        OptionalDouble average = Arrays.stream(array).average();
        System.out.println(average.orElseThrow());

        System.out.println("\n-----BOXED para convertir un Aray a List----");
        List<Integer> list = Arrays.stream(array)
                .distinct()
                .boxed()
                .toList();
        System.out.println(list);


    }
}
