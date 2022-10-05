package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nota de examenes1");
        double parcial1= sc.nextDouble();
        System.out.println("parcial2");
        double parcial2= sc.nextDouble();
        System.out.println("parcial3");

        double parcial3= sc.nextDouble();
        // calificacion de la nota final
        System.out.println("examen final");
        double examenF= sc.nextDouble();
        //trabajo final
        System.out.printf("Trabajo final");
        double trabajoF= sc.nextDouble();
        // calculos
        double  promedioP= ( parcial1 + parcial2 + parcial3)/3;
        double promedioPT = promedioP * 55 / 100;
        System.out.println(promedioPT);
        double examen= examenF * 30 / 100;
        System.out.println(examen);
        double trabajo=  trabajoF * 15 / 100;
        System.out.println( trabajo);
        double total = promedioPT+ trabajo + examen;
        System.out.println( total);






       /* double porcentaje1= sc.nextDouble();
        System.out.printf(" Nota final examen");
        double porcentaje2= sc.nextDouble();
        System.out.print(" Trabajo final");
        double porcentaje3= sc.nextDouble();
        //calculamos
        double porcentage1=porcentaje1 *55/100;
        double porcentage2=porcentaje2 *30/100;
        double porcentage3=porcentaje3 *15/100;

        double sumaT= porcentage1+porcentage2+porcentage3;
        System.out.println("el total de las notas es " +sumaT);*/


    }
}
