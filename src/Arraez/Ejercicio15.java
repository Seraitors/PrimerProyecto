package Arraez;

import java.util.Arrays;

public class Ejercicio15 {
    public static void main(String[] args) {

        int []  enteros = new int[10];


        for (int i = 0; i <enteros.length ; i++) {
            enteros[i]=(int) (Math.random() *100);
        }


        System.out.println(Arrays.toString(enteros));
    enteros=desplazar(enteros);
        System.out.println(Arrays.toString(enteros));
    }

    public static int [] desplazar(int [] enteros ){
        int [] solucion = new int[10];
        solucion[0]=enteros[enteros.length -1];
        for (int i = 0; i < enteros.length -1 ; i++) {
            solucion[i+1] =enteros[i];
        }


        return solucion;
    }
}
