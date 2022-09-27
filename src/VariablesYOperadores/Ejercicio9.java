package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("momento inicial");
        System.out.println("========");
        System.out.println("intodruce l ahora");
        int hora1 = sc.nextInt();
        int M= hora1 *60 ; //minutos
        int mr = M * 60;// segundos
        // mr es todo pasado a sg

        System.out.println("Introduce los minutos");
        int min1 = sc.nextInt();
        int minT = min1*60;
        //minT e todo pasado a sg

        System.out.println(" introduce los segundos");
        int seg1 = sc.nextInt();
        int segT1 = mr + minT + seg1 ;
        System.out.println(segT1 + " segundos");
        //truco: pasarlo a seg el momento inicial y el momento final
        //multiplicas todos lod iniciales y los finales  luego restarlo para ver la difrencia
        // hayar diferencia entre ambos
        //de esa diferencia de seg que tenemos lo pasamos a h min seg
        System.out.println("Momenos final");
        System.out.println("========");
        System.out.println("Introduce 1 hora");
        int hora2 = sc.nextInt();
        int min= hora2*60 ;//min
        int minR =min *60; // seg
        //minR es todo pasado a sg

        System.out.println("minutos secundarios");
        int min2 = sc.nextInt();
        int seg = min2 *60; //seg
        //seg es todo pasado a sg

        System.out.println( "introduce segundos finales");
        int segf= sc.nextInt();
        //esos son segundos directamente
        int sgT2= minR + seg + segf;
        System.out.println(sgT2 + "segundos");

        int direfencia = sgT2 - segT1;

        int pasaSaM = direfencia /60 ; //minutos
        int elresto= direfencia %60 ; //segundos
        int pasarMaH = pasaSaM /60 ;//horas
        int Mrestantes = pasaSaM %60 ;//minutos
        System.out.println( "tenemos una diferencia de " + pasarMaH + "horas " + Mrestantes + "minutos "+ elresto + "segundos" );


    }
}
