package org.example.clase05_creado_fuctionalinterface.c_usandogenericos;

@FunctionalInterface
public interface Operator<T> {
    T apply(T a, T b); // creamos una interfaz genérica
}
