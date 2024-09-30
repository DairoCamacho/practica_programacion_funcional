package org.example.clase22_Reduce_Avanzado;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceUsandoBiFunction {
    public static void main(String[] args) {

        List<String> nombres = List.of("ana", "amelia", "fernando");

        System.out.println("--- Como se hace ACTUALMENTE, usando TOLIST() ");
        List<String> result = nombres.stream().filter(s -> s.startsWith("a")).toList();
        System.out.println( "Usando toList en Java 16: " + result);


        System.out.println("\n--- Como se hace ANTES de java 16 usando Collectors");
        List<String> resultConColectors = nombres.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Resultado usando Collectors: " + resultConColectors);

        System.out.println("\n--- Como se hace ANTES de java 16 usando Reduce");
        System.out.println("\n--- Tercera implementación de Reduce desglosada");
        ArrayList<Object> resultConReduce = nombres.stream()
                .filter(s -> s.startsWith("a"))
                .reduce(
                        // identity
                        new ArrayList<>(),
                        // accumulator
                        (lista, elemento) -> {
                            lista.add(elemento);
                            return lista;
                        },
                        // combiner
                        (lista1, lista2) -> {
                            lista1.addAll(lista2);
                            return lista1;
                        }
                );
        System.out.println("usando Reduce: " + resultConReduce);

//        ArrayList<Object> resultConReduce2 = nombres.stream()
//                .filter(s -> s.startsWith("a"))
//                .reduce(ArrayList::new,
//                        List::add,
//                        (lista1, lista2) -> {
//                            lista1.addAll(lista2);
//                            return lista1;
//                        }
//                );
    }
}
