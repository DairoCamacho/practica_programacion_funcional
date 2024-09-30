package org.example.clase05_creado_fuctionalinterface.d_quitando_la_interface;

import org.example.clase05_creado_fuctionalinterface.c_usandogenericos.Operator;

import java.util.function.BinaryOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Clase05 {
    public static void main(String[] args) {
        // Aqui no hacemos uso de la variable Operator
        /* BinaryOperator<T>: Representa una operación sobre
        dos operandos del mismo tipo, que produce un resultado
        del mismo tipo que los operandos. Esta es una especialización
        de BiFunction para el caso en el que los operandos y el
        resultado son todos del mismo tipo.
        Esta es una interfaz funcional cuyo método
        funcional es apply(Object, Object).*/
        /* BiFunction<T,T,T>: Representa una función que acepta dos argumentos
        y produce un resultado. Esta es la especialización two-arity (dos polaridades) de Function.
        Esta es una interfaz funcional cuyo método
        funcional es apply(Object, Object).*/
        int resultMultiplicacion = ejecutarOperacion(2, 10, (a, b) -> a * b);
        System.out.println(resultMultiplicacion);

        Integer resultResta = ejecutarOperacion(2, 10, (a, b) -> a - b);
        Float resultDivision = ejecutarOperacion(2.3F, 10.5F, (a, b) -> a - b);
        Long resultSuma = ejecutarOperacion(2L, 10L, (a, b) -> a + b);
        Double resultSuma2 = ejecutarOperacion(2.3, 10.5, Double::sum);
    }
    //                Acotamos
    //                   |
    //                   V
    public static <T extends Number> T ejecutarOperacion(T a, T b, BinaryOperator<T> operacion) {
        return operacion.apply(a, b);
    }
}