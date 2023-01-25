package Arraez;

import java.util.Scanner;

public class Ejercicio14Metodos {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
     String farse=dimeFrase();
     int numeropalabras=bucle(farse);
     imprimeresultado(numeropalabras);
    }
    public static String dimeFrase(){
        System.out.println("Introduce una frase");
        String farse=sc.nextLine();
        return farse;
    }

    public static int bucle(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == ' ') {
                contador++;
            }

        }
        return contador + 1;
    }
    public static  void  imprimeresultado (int palabras){
        System.out.println( palabras);
    }
}
