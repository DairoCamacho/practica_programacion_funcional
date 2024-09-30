package org.example.clase05_creado_fuctionalinterface.c_usandogenericos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase05 {
    public static void main(String[] args) {

        Operator<Integer> multiplicacion = (a, b) -> a * b;
        int resultMultiplicacion = ejecutarOperacion(2, 10, multiplicacion);

        Integer resultResta = ejecutarOperacion(2, 10, (a, b) -> a - b);
        Float resultDivision = ejecutarOperacion(2.3F, 10.5F, (a, b) -> a - b);
        Long resultSuma = ejecutarOperacion(2L, 10L, (a, b) -> a + b);
        Double resultSuma2 = ejecutarOperacion(2.3, 10.5, Double::sum);
    }
    //                Acotamos
    //                   |
    //                   V
    public static <T extends Number> T ejecutarOperacion(T a, T b, Operator<T> operacion) {
        return operacion.apply(a, b);
    }
}