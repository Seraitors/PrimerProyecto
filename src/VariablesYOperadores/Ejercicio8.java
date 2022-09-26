package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //Escribe un programa que reciba el tiempo en segundos
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();// 3751 seg
        //calcular de ese tiempo las horas minutos y segundos

        //de los segundos que entran ,primero dicido por 60 para saber cuantos min y seg hay
        int minutos= segundos /60 ; // 62 min
        int segundosR = segundos % 60;//31 seg


        //horas que quedan
        int horas = minutos / 60; // 1 hora
        int minR = minutos % 60;// 2 min
        System.out.println( segundos + " contienen " + horas + " horas " + minR + "minutos "+ segundosR + "segundos ");


    }
}

