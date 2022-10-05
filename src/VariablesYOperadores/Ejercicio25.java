package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("precio total de la compra");
        double precioCompra = sc.nextDouble();
        // calculamos el 15%
        double descuento = precioCompra *15/100;

        // descontamos esa cantidad
        double preciocondescuento = precioCompra - descuento ;
        System.out.println( "debe abonar  " + preciocondescuento + "$" );




    }
}
