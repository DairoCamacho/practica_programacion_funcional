package org.example.clase15_referencias_a_metodos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethosReferences {
    public static void main(String[] args) {
        // 1. Referencia a método static
        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arrayNumbers)
                .map(number -> number * number)
                .forEach(number -> System.out.println(number));

        // podemos hacermos lo mismo que lo anterior pero usando referencia a metodos estaticos
        int[] arrayNumbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(arrayNumbers)
                .map(MathUtils::squaer)
                .forEach(System.out::println);

        // 2. Referencia a constructor

        String[] nombres = {"fernando", "diana", "jorge"};
        final List<Persona> listPersonas = Arrays.stream(nombres)
                .map(nombre -> new Persona(nombre))
                .toList();
        System.out.println(listPersonas);

        // lo anterior podemos mejorarlo así:
        String[] nombres2 = {"fernando", "diana", "jorge"};
        final List<Persona> listPersonas2 = Arrays.stream(nombres)
                .map(Persona::new)
                .toList();
        System.out.println(listPersonas2);

        /*
         3. REFERENCIA A MÉTODO DE INSTANCIA
         en este ejemplo tomamos la lista anterior y deshacemos para volver a un array
         para ello haremos uso del getter de Persona
        */
        // así de forma tradicional llenariamos un array
        List<String> listaNombres = new ArrayList<>();
        for (Persona persona : listPersonas) {
            listaNombres.add(persona.getNombre());
        }
        System.out.println("de forma tradicional: " + listaNombres);

        // usando lambdas
        List<String> listaNombres2 = listPersonas.stream()
                .map(persona -> persona.getNombre())
                .toList();
        System.out.println("usando lambdas: " + listaNombres2);

        // usando referencia a metodos
        List<String> listaNombres3 = listPersonas.stream()
                .map(Persona::getNombre)
                .toList();
        System.out.println("usando referencia a metodos: " + listaNombres3);


    }

}
