package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in);
        System.out.println(" numero");
        double numero = sc.nextDouble();
        System.out.println( " porcentaje");
        double porcentaje= sc.nextDouble();
        //calcular elporcenatje
        double porcentajeCalculado= numero *porcentaje /100;
        System.out.println(porcentajeCalculado );
        double incremneto= porcentajeCalculado + numero ;
        System.out.println(" incremento ");
        System.out.println( incremneto);
        System.out.println("decremento");
        double decremento =  numero- porcentajeCalculado;
        System.out.println( decremento);
        }
}
