package org.example.clase03_claseanonima_y_lambdas;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerUtils {

    private static final Faker faker = new Faker(new Locale("es", "MX"));

    public static String generarNombre (){
        return faker.name().firstName();
    }
    public static String generarApellido(){
        return faker.name().lastName();
    }
}
