package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int divi= k / n;
        int resto = n % k;
        System.out.println(divi);
        System.out.println( resto);
    }
}

