package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {

        // Esch Un programa que Lea cuatro numeros por teclado
        //y decremente cada uno de ellos .
        //El programa debe mostrar los resultados en la misma linea , en el mismo orden que entraron , separados por espacios .
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        n3 -= 1; // por que esto asi no lo puedo poner dentro del sout
        n4--; // no lo pongo dentro por que me imprimira primero antes de incrementarse
        System.out.println( (n1-1) + " "+  --n2 + " "+ n3 +" "+  n4 );

    }
}
