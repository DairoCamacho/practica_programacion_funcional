package org.example.clase09_iterable_iterator;

import java.util.List;

public class clase09 {
    public static void main(String[] args) {
        List<String> nombres = List.of("fernando", "ana", "diana", "jorge");

        // PROGRAMACIÓN IMPERATICA
        // se especifica los pasos que se deben realizar para lograr el objetivo
        /*
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        */
        /*
        int counter = 0;
        while (true){
            System.out.println(nombres.get(counter));
            counter++;
            if ( counter >= nombres.size()){
                break;
            }
        }
        */

        // PROGRAMACIÓN DECLARATIVA
        // no se detallan los pasos a seguir, sino solo el resultado deseado
        // bucle for mejorado
        /*
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        */

        ColeccionIventada<String> ci = new ColeccionIventada<>();

        ci.add("hola");
        ci.add("mundo");

        for (String element : ci) {
            System.out.println(element);
        }

    }

}
