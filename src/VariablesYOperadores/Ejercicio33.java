package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numero = sc.nextInt();
        int numero2= sc.nextInt();
        int numero3 = sc.nextInt();
        boolean resultado= numero < numero2 &&  numero2<numero3;
        System.out.println(resultado);

    }

}
