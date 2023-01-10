package Arraez;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mes =0;
        do {
            System.out.println("di un numero de mes (1-12)");
            mes = sc.nextInt();

        }while (mes <0 || mes > 12);

        //array de meses con numeros
        String[] NombrerMes= {"Ene","Feb","Marx","Abril","Mayo","Junio","Julio","Serp","ovtu","nom","Dic"};
        // arrays de meses con los dias
        int[]NombreDias={31,31,31,31,31,31,31,31,31,31,31,31};


        System.out.println(NombrerMes[mes -1] + " tiene " + NombreDias[mes]);
    }
}
