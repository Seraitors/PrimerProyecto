package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {

        /*
        */

        Scanner sc = new Scanner(System.in);
       int numero=0; //lo declafro antes para imprimirlos despues del bucle
        do {
            System.out.print("introduce un numero de 1 100 ambos inclusive");
             numero= sc.nextInt();
        }while (numero<1 || numero >100); // sigo en el bucle si introduzco el numero fuera del rango si meto un numero
            // cuando el numero introducido es correcto lo imprimo

        System.out.println( numero);
    }
}
