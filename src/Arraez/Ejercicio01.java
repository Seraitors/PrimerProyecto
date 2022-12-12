package Arraez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        //cra un programa que pida 10 letras por teclado
        //las vaya guardando en un array de caracteres
        //luego pida un cararcter
        // y al final muestra cuantas veces aparece el caracter

        Scanner sc = new Scanner(System.in);

        char [] letras = new char[10];

        for (int i = 0; i <letras.length ; i++) {
            letras[i]= sc.next().charAt(0);

        }
        System.out.println(Arrays.toString(letras));


        System.out.println("que caracter quieres que te cuente");
        char c = sc.next().charAt(0);
        int contador= 0;
        for (int i = 0; i < letras.length; i++) {
             if (letras[i] == c){
                 contador++;

             }


        }

        System.out.println(contador);



    }
}
