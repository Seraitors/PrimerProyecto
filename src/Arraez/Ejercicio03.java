package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a1 = new int[5];
        int []a2 = new int[5];
        int []a3 = new int[5];


        for (int i = 0; i <a1.length ; i++) {

            System.out.println("Valor " + (i+1) + " de a1");

            a1[i]= sc.nextInt();
        }


        for (int i = 0; i <a2.length ; i++) {

            System.out.println("Valor " + (i+1) + " de a2");

            a2[i]= sc.nextInt();
            a3[i]= a1[i]+ a2[i];
        }

        System.out.println( "a1" +Arrays.toString(a1));
        System.out.println("a2" + Arrays.toString(a2));
        System.out.println("a3" + Arrays.toString(a3));



    }
}
