package org.example.clase05_creado_fuctionalinterface.b_conlambda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase05 {
    public static void main(String[] args) {

        Operator multiplicacion = (a, b) -> a * b;
        Double resultMultiplicacion = ejecutarOperacion(2, 10, multiplicacion);
        System.out.println(resultMultiplicacion);

        Double resultResta = ejecutarOperacion(2, 10, (a, b) -> a - b);
        Double resultDivision = ejecutarOperacion(2, 10, (a, b) -> a / b);
        Double resultSuma = ejecutarOperacion(2, 10, (a, b) -> a + b);
        Double resultSuma2 = ejecutarOperacion(2, 10, Double::sum);
    }

    public static double ejecutarOperacion(double a, double b, Operator operacion) {
        return operacion.applay(a, b);
    }
}