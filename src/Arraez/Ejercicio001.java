package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] A1 = new double[5];
        for (int i = 0; i < A1.length; i++) {
            A1[i] = sc.nextDouble();


        }
        System.out.println(Arrays.toString(A1));
    }
}
