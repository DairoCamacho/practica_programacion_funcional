package org.example.clase07_clousure;

public class Clase07 {
    public static void main(String[] args) {
        /*
         * Closure (Cierre)
         * Un closure en programación funcional es una función que tiene acceso a variables de un entorno externo, incluso después de que ese entorno haya dejado de existir. Es como una "instantánea" de un entorno en un momento dado.
         * */
        /*
         * Lexical Scope
         * El alcance léxico se refiere a la forma en que una variable es accesible dentro de un programa. En Java, el alcance de una variable está determinado por el bloque de código en el que se declara. Las expresiones lambda y los métodos anónimos heredan el alcance léxico del contexto en el que se definen.
         * */
        /*
         * Callback
         * Un callback es una función que se pasa como argumento a otra función y se ejecuta en un momento posterior, generalmente cuando se completa alguna tarea. Es una forma de invertir el control de flujo de un programa.
         * */
        /*
         * Función de Alto Orden (Higher-Order Function)
         * Una función de alto orden es una función que puede:
         *   - Tomar otra función como argumento.
         *   - Retornar otra función como resultado.
         * En Java, las expresiones lambda y los métodos de referencia nos permiten crear funciones de alto orden.
         * */
        /*
         * Relación entre los conceptos
         * Closure y Lexical Scope: Los closures se basan en el alcance léxico para capturar variables de un entorno externo.
         * Callback y Funciones de Alto Orden: Los callbacks son un ejemplo de funciones de alto orden, donde una función se pasa como argumento a otra función.
         * */
        /*
         * En resumen:
         * Closure: Captura variables de un entorno externo.
         * Lexical Scope: Define el alcance de las variables.
         * Callback: Función que se pasa como argumento y se ejecuta más tarde.
         * Función de Alto Orden: Toma funciones como argumentos o retorna funciones.
         * */
    }
}
