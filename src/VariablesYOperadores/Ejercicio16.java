package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el lado de un cuadrado");
        //lado de un cuadrado  lado por lado
        double cuadrado = sc.nextDouble();
        double resulato = cuadrado * cuadrado;
        double perimetro = resulato * 4 ;
        System.out.println( "lado del cuadrado " + resulato);
        System.out.println( "El perimetro es " + perimetro);
    }
}
