package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double [] longitud= new  double[20];
/*
        int[] numeros = new int[200];
        int max = 10;
        int min = -10;
        if (min < 0) {
            min = min - 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * (max - min + 1) + (min));


        int max = 10;
        int min = -10;
        do {
            longitud[20] = (int) (Math.random() * (max - min + 1) + (min));
            if (min < 0) {
                min = min - 1;
        }while (!longitud==500);*/

        int tamaño =0;
        do {
            System.out.println("tamaño");
            tamaño = sc.nextInt();
            // si el tamañoes negativo o 0 , sigo preguntandop
            if (tamaño <=0){
                System.out.println("Tamaño incoreecto");
            }


        }while (tamaño<=0); // si el tamaño es negativo a 0 , sigo preguntando

        int[] numeros =new int[ tamaño];

        for (int i = 0; i <numeros.length ; i++) {
            numeros[i] = (int) (Math.random() * (10 ) + 1);

        }
        System.out.println(Arrays.toString(numeros));
            int suma=0;
        for (int i = 0; i <numeros.length ; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("suma  " + suma);
    }
}
