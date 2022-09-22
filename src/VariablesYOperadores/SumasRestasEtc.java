package VariablesYOperadores;

import java.util.Scanner;

public class SumasRestasEtc {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //Pedir por teclado dos numeros y guardalos en dos variables enteros
        System.out.print("Primer numero:");
        int num1= sc.nextInt();
        System.out.print("segundo numero");
        int num2 = sc.nextInt();
        //Crear variables que guarden el resultado de las 5 operaciones posibles
        int suma= num1 + num2;
        int resta= num1 - num2;
        int producto= num1 * num2;//es una multiplicacion
        int resto= num1 % num2;//es el resto de una division
        int cociente= num1 / num2;// ojo es el cociente de la division entera
        //Mostar el resultado de cada operacion

        System.out.println(num1+ "+" + num2 + "="+ suma);
        System.out.println(num1 +"-" + num2 + "="+ resta);
        System.out.println(num1+ "*" + num2 + "="+ producto);
        System.out.println( num1 +"/" + num2 + "="+ cociente);
        System.out.println("el resto de dividir " + num1 +"entre" + num2 + "es igual a "+ resto);


    }
}
