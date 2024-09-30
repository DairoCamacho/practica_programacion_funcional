package org.example.clase24_groupingBy;

import java.time.LocalDate;
import java.time.Period;

public class PersonaUtils {
    // esto hara las veces de Function<Persona, Integer>
    public static int calcularEdad(Persona persona){
        return Period.between(persona.getFechaNacimiento(), LocalDate.now()).getYears();
    }

    public static char obtenerPrimerCaracter (Persona persona){
        return persona.getNombre().charAt(0);
    }
}
