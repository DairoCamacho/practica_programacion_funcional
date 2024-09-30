package org.example.clase08_callback;

public class CallbackEjemplo {
    /*
    // Ejemplo sintaxis de un Callback
    public static void processData(int data, Callback callback) {
        // Procesar los datos
        callback.onCompletion();
    }
    */
    public static void main(String[] args) {
        FunctionPropia<Integer, Integer> callbackPotenciaNumeros = n -> n * n;

        System.out.println(applyFunction(10, callbackPotenciaNumeros));;
    }

    public static Integer applyFunction(Integer n, FunctionPropia<Integer, Integer> funcion){
        return funcion.apply(n);
    }
}
