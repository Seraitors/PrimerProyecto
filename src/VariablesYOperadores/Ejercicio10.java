package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dece = sc.nextInt();
        int  eje = dece / 10 ; // cociente
        int decen = dece % 10 ;//resto
        System.out.println(eje + " decenas ");

    }
}
