package org.example.clase24_groupingBy;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UsandoGroupingBy {
    public static void main(String[] args) {

        // crear 10 instancias de personas con su nombre, apellido y fecha de nacimiento
        // usando la clase Persona de este paquete
        List<Persona> personas = List.of(
                new Persona("Juan", "Perez", LocalDate.of(1990, 1, 1)),
                new Persona("Maria", "Gomez", LocalDate.of(1990, 1, 1)),
                new Persona("Pedro", "Gonzalez", LocalDate.of(1991, 2, 1)),
                new Persona("Jose", "Rodriguez", LocalDate.of(1991, 2, 1)),
                new Persona("Luis", "Fernandez", LocalDate.of(1992, 5, 1)),
                new Persona("Ana", "Lopez", LocalDate.of(1992, 5, 1)));

        /* groupingBy es similar comparing, ya que tambien recibe
        una Funcion que recibe un generico y devuelve la llave por la cual 
        se va a grupar los elementos */

        System.out.println("Cantidad de personas: " + personas.size());

        Map<Integer, List<Persona>> mapPersonas = personas.stream()
                .collect(Collectors.groupingBy(PersonaUtils::calcularEdad));

        for (Integer llave : mapPersonas.keySet()) {
            System.out.println("Personas con la edad de: " + llave + " total: " + mapPersonas.get(llave).size());
            System.out.println(mapPersonas.get(llave));
        }

        System.out.println("-- AGRUPANDO POR NOMBRE --");
        Function<Persona, Character> obtenerPrimerCaracter = persona -> persona.getNombre().charAt(0);
        Map<Character, List<Persona>> mapPersonasBy = personas.stream()
                .collect(Collectors.groupingBy(obtenerPrimerCaracter)); // usando una Fuction
//                .collect(Collectors.groupingBy(persona -> persona.getNombre().charAt(0))); // usando lambda
//                .collect(Collectors.groupingBy(PersonaUtils::obtenerPrimerCaracter)); // usando el metodo estatico

        for (Character llave : mapPersonasBy.keySet()) {
            System.out.println("Personas con la edad de: " + llave + " total: " + mapPersonasBy.get(llave).size());
            System.out.println(mapPersonasBy.get(llave));
        }
    }
}
