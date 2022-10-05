package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
 // variables sueldo base ,comision , (el 10% de la venta , venta (hace 3 ventas )

        //datos que necesitamos pedir
        Scanner sc = new Scanner(System.in);
        System.out.println( "sueldo base");
        double sueldo = sc.nextDouble();
        System.out.println("Venta 1");
        double venat1= sc.nextDouble();
        System.out.printf("venta 2");
        double venta2= sc.nextDouble();
        System.out.printf("venta3");
        double venta3= sc.nextDouble();
        //ahora claculamos la comision que obtiene por acad venta
        double comision1 = venat1 *10/100;
        double comision2 = venta2 *10/100;
        double comision3 = venta3*10/100;
        double comision= comision1 + comision2 + comision3;
        System.out.println("oprendra por comision" + comision);
        System.out.println(" el total sera ");
        double total = sueldo + comision;
        System.out.println(" esto es el total " + total);




    }
}
