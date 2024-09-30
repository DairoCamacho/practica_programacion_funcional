package org.example.clase02_razones_historicas;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase02 {
    public static void main(String[] args) {
        List<Persona> listaPersonas = generarPersonas(10);
        listaPersonas.add(new Persona("Ana", "Perez"));
        System.out.println("Antes de ordenar: \n" + listaPersonas);
        // HASTA AQUI SUPONGAMOS QUE ESTOS DATOS SON LOS TRAE UNA DB

        // supongamos que necesitamos ordenar los datos en backend
        // así es como se hacia antes de java 8
        // necesitamos el metodo "compare" de la interface Comparator
        // lo que nos obligaba a crear una clase q' implemente "Comparator"
        listaPersonas.sort(new ComparadorPorLongitudNombre());

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