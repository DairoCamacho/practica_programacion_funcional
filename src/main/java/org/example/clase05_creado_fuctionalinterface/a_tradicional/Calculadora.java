package org.example.clase05_creado_fuctionalinterface.a_tradicional;

public class Calculadora implements Calculable {
    @Override
    public double sumar (double a, double b){return a + b;}
    @Override
    public double restar (double a, double b){return a - b;}
    @Override
    public double multiplicar (double a, double b){return a * b;}
    @Override
    public double dividir (double a, double b){return a / b;}
}
