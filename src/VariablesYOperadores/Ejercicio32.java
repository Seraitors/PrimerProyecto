package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menor = sc.nextInt();
        boolean menorQue= menor <10 && menor>0;
        System.out.println( menorQue);
    }
}
