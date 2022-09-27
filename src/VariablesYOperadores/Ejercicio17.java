package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
//calcula area de un trianglo
        Scanner sc = new Scanner(System.in);
        System.out.printf("Base:");
        double base = sc.nextDouble();
        System.out.printf("Altura:");
        double altura = sc.nextDouble();
        //calculamos
        double area =( base * altura)/2;
        System.out.printf(" area "+ area);

    }
}
