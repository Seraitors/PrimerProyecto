package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x1");
        double x1 = sc.nextDouble();
        System.out.println("y1");
        double  y1 = sc.nextDouble();
        System.out.println("x2");
        double x2 = sc.nextDouble();
        System.out.println("y2");
        double y2 = sc.nextDouble();
//calcula y muestra por pantalla
        double distancia = Math.sqrt(Math.pow((x2-x1) , 2 ) +  Math.pow((y2 - y1 ) , 2 ));

        System.out.println ( " La distancia entre A"+  ( " + x1 + " + y1  )+  (  + x2 + + y2 + " +" + distancia));

    }
}
