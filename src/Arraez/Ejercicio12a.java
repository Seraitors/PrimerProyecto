package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12a {
    public static void main(String[] args) {

        int []enteros=new int[10];
        for (int i = 0; i < enteros.length ; i++) {
            enteros [i]=(int)(Math.random() *10 + 1);
        }
        System.out.println(Arrays.toString(enteros));
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a insertar ");
        int n = sc.nextInt(); sc.nextLine();
      int pos =0;
        do {
            System.out.println(" en que posicion lo quieras insertar ");
             pos= sc.nextInt();

        }while (pos> enteros.length);
        for (int i = pos; i < enteros.length -1 ; i++) {
            enteros[i+1]=0;
        }
    }
}
