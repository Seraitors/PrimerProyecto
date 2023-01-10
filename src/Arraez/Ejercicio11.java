package Arraez;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int []enteros = new int[10];
        for (int i = 0; i <enteros.length ; i++) {

            enteros[i] = (int )(Math.random() *20+1);

        }
        Arrays.sort(enteros);

        System.out.println(Arrays.toString(enteros));


        int numero = 0 ;
        do {

            System.out.println("Introduce un numero entre 1 y 20");
            numero=sc.nextInt();
            if (numero<1 || numero>20){
                System.out.println("Fuera de rango ");
            }

        }while (numero<1 || numero>20);


        boolean encontarr=false;
        for (int i = 0; i <enteros.length ; i++) {
            if (enteros[i] ==numero){


                System.out.println("El nuemro " + numero + " esta en la posiicion " + (i+1) +" Indice " + i + ").");
                encontarr=true;
                break;
            }

        }
    if (encontarr==false){
        System.out.println("El numero no  esta en el array");
    }

    }
}
