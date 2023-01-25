package Arraez;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();


        for (int i = 0; i <10 ; i++) {
            enteros.add((int) (Math.random() *100));


        }

        System.out.println(enteros);
    int indice =0;
        do {
            System.out.println("Indice del elemento a eliminar ");
            indice=sc.nextInt();sc.nextLine();
            if ((indice< 0 || indice >9)){

                System.out.println("error . el numero debe de estsr 0,9");
            }



        }while (indice< 0 || indice >9);
        System.out.println("");

        enteros.remove(indice);
    }
}
