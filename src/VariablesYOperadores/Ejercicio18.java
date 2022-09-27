package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        //calcula un programa que te de la temperatura
        //Reamur = Centígrados x 0.8
        //Fahenheit = (Centígrados * 9/5)+32
        //Kelvin = Centígrados + 273
        Scanner sc = new Scanner(System.in);
        System.out.println(" Dime la temperatura ");
        double centigrados = sc.nextDouble();// grados
        double remur = centigrados * 0.8;// reamur
        double fa = ( centigrados *9/5)+35; //fahenhit
        double kel = centigrados + 273 ;// kelvin
        System.out.println( "reamur "+ remur);
        System.out.println("fahenti " + fa);
        System.out.println("Kelvin " + kel);


    }
}

