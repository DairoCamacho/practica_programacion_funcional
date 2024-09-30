package org.example.clase18_OrdenInverso;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenInverso {
    public static void main(String[] args) {
        int[] array = {5, 8, 9, 10, 10, 4, 5, 4, 5, 4, 7, 8, 10, 2, 5, 7, 3, 1, 2, 5};

        // orden natural ( menor a mayor )
        int[] minToMax = Arrays.stream(array)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(minToMax));

        // orden inverso
        int[] maxToMinArray = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(n -> n)
                .toArray();
        System.out.println(Arrays.toString(maxToMinArray));

        List<Integer> maxToMinList = Arrays.stream(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(maxToMinList);

    }
}
