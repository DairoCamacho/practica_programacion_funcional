package org.example.clase16_aplanamiento_y_suma;

import java.util.Arrays;

public class a_formaTradicional {
    public static void main(String[] args) {
        // forma tradiconal
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        /* suma de todos los elementos y aplanarlos ( pasar todo a un solo array)
         lo primero computamos el tamaño, por que no siempre tenemos matrices cuadradas (n*n)
         sino que puede variar el num de filas con respecto al num de colum (n*m)
        */
        int size = caculateSize(arr);
        int[] arregloPlano = new int[size];
        int counter = 0;
        for (int[] row : arr) { // O(n^2)
            for (int element:row){
                arregloPlano[counter]= element;
                counter++;
            }
        }
        System.out.println(Arrays.toString(arregloPlano));
        // encontrar la suma de todos los numeros
        int suma = 0;
        for (int i : arregloPlano) {
            suma += i;
        }
        System.out.println(suma);
    }

    private static int caculateSize(int[][] arr) {
        int size= 0;
        for (int[] row : arr) {
            size += row.length;
        }
           return size;
    }
}
