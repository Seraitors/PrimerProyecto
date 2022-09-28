package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" escribe un numero");
        int numero = sc.nextInt();
        int decenas = numero /  10;
        int unidades = numero %10;
        System.out.printf( unidades + " "+ decenas);
    }
}
