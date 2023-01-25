package Arraez;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una farse");
        String frase = sc.nextLine();
        int contador=0;
        for (int i = 0; i <frase.length() ; i++) {
            if (frase.charAt(i) ==' '){
                contador++;
            }
        }
        System.out.println("hay " + (contador+1)+" palabras");
    }
}
