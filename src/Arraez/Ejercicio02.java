package Arraez;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double [] decimales =new double[5];
        for (int i = 0; i <decimales.length ; i++) {
            decimales[1]= sc.nextDouble();

        }

        System.out.println("  ");

        for (int i = decimales.length -1; i >=0 ; i--) {
            System.out.println(  decimales[i]+ " ");
        }


    }
}
