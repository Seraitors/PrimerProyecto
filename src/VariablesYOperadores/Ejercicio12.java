package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int centenas = num / 100;
        int auxiliar = centenas %100; // en este resto estan las decenas y unidades
        int decenas = auxiliar/ 10;
        int unidades = decenas %10;
        System.out.println( unidades + "" + decenas + " " + centenas);
    }
}
