package org.example.clase18_Matchers;

import java.util.Arrays;

public class Matchers {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
//        int[] array = {1,3,5,7,9};

        System.out.println("---- allMatch ----");
        boolean resultadoAllMatch = Arrays.stream(array)
                .allMatch(n -> n % 2 == 0);
        System.out.println("Todos son pares?: " + resultadoAllMatch);

        System.out.println("---- anyMatch ----");
        boolean resultadoAnyMatch = Arrays.stream(array)
                .anyMatch(n -> n % 10 == 0);
        System.out.println("Alguno es divisible por 10?: "+ resultadoAnyMatch);

        System.out.println("---- noneMatch ----");
        boolean resultadoNoneMatch = Arrays.stream(array)
                .noneMatch(Matchers::isOdd);
        System.out.println("resultado noneMatch: " + resultadoNoneMatch);


    }
    public static boolean isOdd (int n){
        return n % 2 !=0;
    }
}
