package org.example.clase02_razones_historicas;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtils {

    private static final Faker faker = new Faker(new Locale("es", "MX"));

    public static String generarNombre() {
        return faker.name().firstName();
    }

    public static String generarApellido() {
        return faker.name().lastName();
    }
}
