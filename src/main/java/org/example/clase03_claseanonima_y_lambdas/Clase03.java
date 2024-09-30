package org.example.clase03_claseanonima_y_lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase03 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = generarPersonas(10);

        listaPersonas.add(new Persona("Ana", "Perez"));

        System.out.println("Antes de ordenar: \n" + listaPersonas);

        // ahora eliminamos el archivo que contenia la clase
        // ComparadorPorLongitudNombre y metemos toda esa logica
        // dentro de sort creando una CLASE ANONIMA
        listaPersonas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                int primero = o1.getNombre().length();
                int segundo = o2.getNombre().length();
                return Integer.compare(primero, segundo);
            }
        });

        // Ahara no nos interesa la clase anonima, lo que queremos es
        // la logica del metodo COMPARE, entonces extraemos esa logica
        // y creamos una LAMBDA
        listaPersonas.sort((o1, o2) -> {
            int primero = o1.getNombre().length();
            int segundo = o2.getNombre().length();
            return Integer.compare(primero, segundo);
        });
        // podemos resumir más esa expresion lambda
        listaPersonas.sort((o1, o2) ->
                Integer.compare(o1.getNombre().length(), o2.getNombre().length())
        );
        System.out.println("Despues de ordenar: \n" + listaPersonas);
    }

    private static List<Persona> generarPersonas(int n) {
        List<Persona> personas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nombre = FakerUtils.generarNombre();
            String apellido = FakerUtils.generarApellido();
            personas.add(new Persona(nombre, apellido));
        }
        return personas;
    }
}