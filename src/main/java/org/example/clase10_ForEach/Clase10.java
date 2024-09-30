package org.example.clase10_ForEach;

import java.util.List;
import java.util.function.Consumer;

public class Clase10 {
    public static void main(String[] args) {

        List<String> listaNombres = List.of("andres", "juan", "pedro");

        // usando una clase
        listaNombres.forEach(new Consumidor());

        // usando una clase anónima
        listaNombres.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Desde una clase anónima: " + s);
            }
        });

        // usando una lambda
        listaNombres.forEach(s -> System.out.println("Desde una lambda: " + s));

        // usando una lambda 2
        listaNombres.forEach(s -> System.out.println(s));

        // veamos el ejemplo lambda 2, cuando el parametro que se recibe es el mismo que se va ejecutar dentro
        // podemos usar Method reference:
        listaNombres.forEach(System.out::println);

        // dento puedo hacer cualquier cosa siempre que sea VOID
        // e.g. mutando la cadena
        listaNombres.forEach(s-> {
            String cadena = s;
            cadena = cadena.toUpperCase();
            System.out.println(cadena);
        });
    }
}