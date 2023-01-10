package Arraez;

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {


        int [] lista = new int [10];

        for (int i = 0; i <lista.length ; i++) {

            lista   [i]= (int )(Math.random() *12 -6);
        }

        System.out.println(Arrays.toString(lista));

        // formula para ordenar
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));


    }
}
