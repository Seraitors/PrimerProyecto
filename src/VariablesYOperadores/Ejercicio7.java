package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        //ve recibo cantidad de minutos
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();
        //calculamos cuantas horas y minutos corresponden
        int horas = minutos /60;
        int minutosRestantes =minutos % 60;

        //y muestro por panyatalla a cuantas horas y minutos correspondan
        System.out.println( minutos + "minutos equivalentes a"+ horas + "y" +minutosRestantes + "minutos");
    }
}
