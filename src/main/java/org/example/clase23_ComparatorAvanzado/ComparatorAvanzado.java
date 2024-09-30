package org.example.clase23_ComparatorAvanzado;

import java.util.Comparator;

import static java.util.Comparator.comparing;

import java.util.function.Function;
import java.util.List;
import java.util.Optional;

public class ComparatorAvanzado {
    public static void main(String[] args) {
        List<Persona> personas = List.of(
                new Persona("ana", "puentes", 33),
                new Persona("pedro", "whatever", 11),
                new Persona("pedro", "puentes", 12),
                new Persona("pedro", "puentes", 13),
                new Persona("jorge", "gonzales", 22)
        );

        // esta es una forma de ordenar usando un comparator
        personas.stream()
                .sorted(ComparatorAvanzado::diferenciaEdad)
                .forEach(System.out::println);

        // del ejemplo anterior, podriamos extraer
        // la logica del comparator de estas dos formas:
        Comparator<Persona> byAge = (p1, p2) -> p1.getEdad() - p2.getEdad();
        Comparator<Persona> byAge2 = ComparatorAvanzado::diferenciaEdad;
        Comparator<Persona> byAgeDescendiente = byAge.reversed();

        // extraer el comparator nos permite usarlo NO SOLO para Ordenar
        // sino tambien para obtener un MIN, MAX, o agrupar
        Optional<Persona> minByAge = personas.stream()
                .min(byAge);
        System.out.println("\nLa minima edad es de: " + minByAge.orElseThrow());

        // como funciona el min o max anteror?
        // lo hace usando un reduce, que seria algo como esto:
        Optional<Persona> minByAgeExplicado = personas.stream()
                .reduce((p1, p2) -> p1.getEdad() > p2.getEdad() ? p1 : p2);
        System.out.println("\nLa minima edad es de: " + minByAge.orElseThrow());


        /* veamos el metodo comparing de la clase Comparator
         este recibe una Function que se llama KeyExtractor
         y devuelve un compator.*/
         /*Como funciona: mandame una funcion que esté en terminos de T ( en este caso Persona)
         y el valor de regreso debe ser el tipo de dato que tu quieres que use como llave para ordenar*/
        // creamos esta funcion:
        Function<Persona, Integer> byAge3 = Persona::getEdad;
        Function<Persona, String> byName = Persona::getNombre;

        List<Persona> listResultado = personas.stream()
                .sorted(comparing(byAge3))
                .toList();
        System.out.println(listResultado);

         /*la importancia de comparing es que retorna un Comparator
         esto significa que podemos seguir usando los metodos de Comparator
         por ejemplo el metodo thenComparing para hacer comparaciones simultaneas
         o consecutivas,
         por ejem: primero por nombre, luego por edad
         */
        List<Persona> listDoblementeOrdenada = personas.stream()
                .sorted(comparing(byName).thenComparing(byAge3))
                .toList();
        System.out.println(listDoblementeOrdenada);
    }

    public static int diferenciaEdad(Persona p1, Persona p2) {
        return p1.getEdad() - p2.getEdad();
    }
}
