package org.example.clase06_tipos_de_funcionalinterfaces;

public class Clase06 {
    public static void main(String[] args) {
        System.out.println("λ");
        /* Aquí una clasificación más completa basada en la
        combinación de retorno y parámetros:

        Metodo sin retorno y sin parámetros (Consumer):
            Ejemplos típicos: acciones, eventos, tareas a realizar.
            Interfaz representativa: java.util.function.Consumer

        Metodo sin retorno y con uno o más parámetros (Consumer):
            Similar al caso anterior, pero con más flexibilidad para recibir datos.
            Interfaz representativa: java.util.function.Consumer
            Consumer<T>, su SAM es "void accept(T t)"

        Metodo con retorno y sin parámetros (Supplier):
            Genera un valor.
            Interfaz representativa: java.util.function.Supplier
            Supplier<R>, su SAM es "R get()"

        Metodo con retorno y con uno o más parámetros (Function):
            Realiza una transformación de datos.
            Interfaz representativa: java.util.function.Function
            Function<T,R> su SAM es "R apply(T t)"

        Metodo con retorno BOOLEAN y con uno o más parámetros (Predicate):
            Evalúa el predicado sobre el argumento dado.
            Interfaz representativa: java.util.function.Function
            Predicate<T> su SAM es "boolean test(T t)"
        */
        // sin retorno - sin parametros -> CONSUMER
        ejecutorTipo1(() -> System.out.println("Cualquier cosa VOID"));
        // sin retorno - CON parametros (uno o más) -> CONSUMER
        ejecutorTipo2(Integer.MAX_VALUE, (a) -> System.out.println(a));
        // CON retorno - sin parametros -> SUPPLIER
        ejecutorTipo3(() -> {
            int a = 2;
            int b = 3;
            return a + b;
        });
        // CON retorno - CON parametros (uno o más) -> FUNCTION
        ejecutorTipo4(10, 10, (a, b) -> (int) Math.pow(2, 10));
        // CON retorno boolean - CON parametros (uno o más) -> PREDICATE
        ejecutor5(3, (a) -> a % 2 == 0);

    }

    private static void ejecutor5(int a, IFunctionalTipo5 f) {
        boolean result = f.metodo5(a);
        System.out.println("Es par?: "+result);
    }

    private static void ejecutorTipo4(int a, int b, IFunctionalTipo4 f) {
        int result = f.metodo4(a, b);
        System.out.println(result);
    }

    private static void ejecutorTipo3(IFunctionalTipo3 f) {
        int result = f.metodo3();
        System.out.println(result);
    }

    public static void ejecutorTipo2(int a, IFuncionalTipo2 f) {
        f.metodo2(a);
    }

    public static void ejecutorTipo1(IFuncionalTipo1 f) {
        f.metodo1();
    }
}
