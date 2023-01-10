package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int tamaño =0;

    do {
        System.out.println("Tamaño del array");
        tamaño=sc.nextInt();
    }while (tamaño<=0);

    //creamo sun array formado por elementos aletarios
        int [] pares= new int[tamaño];
         int i=0;
         while (i< pares.length){

             int numero=(int)(Math.random() *50+1);
             if(numero %2==0){
                 pares [i]=numero;
                 i++;
             }
         }






        System.out.println(Arrays.toString(pares));
    }
}
