package org.example.clase09_iterable_iterator;

import java.util.Iterator;

public class ColeccionIventada<E> implements Iterable<E> {
    /* la estructura de datos fundamental de la programacion
        es el array, de él descienden todas las demas estrcturas de datos
     */
    private E[] array;

    private static final int DEFAULT_CAPACITY = 10;
    // para conocer la cantidad de espacios ocupados del array
    private int size;

    // un constructor donde se indique la capacidad que va tener
    public ColeccionIventada(int capacity) {
        size = 0;
        array = (E[]) new Object[capacity];
    }

    // Otro constructor pero sin parametros
    public ColeccionIventada() {
        this(DEFAULT_CAPACITY);
    }

    // metodo para crear elementos
    public void add(E e) {
        // verificar que el array tiene capacidad
        ensureCapacyty();

        // aumentar el tamaño del arry para dar cabida al nuevo elemento
        size++;
        // en la posicion de size agrege el elemento
        array[size] = e;
    }

    private void ensureCapacyty() {
        if (size == array.length) {
            // si se alcanzó el limite, entonces duplicar el tamaño
            int newSize = array.length *2;
            // creamos un array auxiliar
            E[] newArray = (E[]) new Object[newSize];
            // copiamos el contenido del array al nuevo array
            // array viejo - partiendo de la posicion cero - copie el nuevo array - partiendo del posicion cero - ponga todos los elementos
            System.arraycopy(array, 0, newArray, 0, size);
            // cambiamos el puntero del array viejo por el array nuevo
            array = newArray;

        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            // index actual
            int currentIndex = 0;

            @Override
            public boolean hasNext() {
                // si currentIndex es cero, siempre habra un siguiente elemento
                return currentIndex < size;
            }

            @Override
            public E next() {
                /*
                if(!hasNext()){
                    throw new NoSuchFieldException();
                }
                */
                currentIndex++;
                return array[currentIndex];
            }
        };
    }
}
