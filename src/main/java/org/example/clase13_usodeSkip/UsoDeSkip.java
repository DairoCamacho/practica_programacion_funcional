package org.example.clase13_usodeSkip;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UsoDeSkip {
    public static void main(String[] args) {

        final List<Venta> ventasPorMes = Arrays.stream(Month.values())
                .map(month -> new Venta(month, generarDoubleAleatorio()))
                .toList();

        System.out.println(ventasPorMes);

        // omitir los 6 primeros meses para sacar un reporte solo de los ultimos meses
        ventasPorMes.stream()
                .skip(6)
                .forEach(System.out::println);
    }

    public static Double generarDoubleAleatorio() {
        return (double) new Random().nextInt(2000);
    }
}
