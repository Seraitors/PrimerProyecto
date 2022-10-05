package VariablesYOperadores;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
// pida precio de venta de procduvto
        Scanner sc = new Scanner(System.in);
        System.out.println(" Precio del producto ");
        double precio = sc.nextDouble();//100


        System.out.println("cantidad de productos a comprar ");
        int cantidad = sc.nextInt();//5
        sc.nextLine();
        //cantidad de productos comprndos
        System.out.println(" porcentaje de iva a apliocar");
        double porcentajeIVA= sc.nextDouble();//10

        //Calcular el precio sin iva
        double precioT= precio*cantidad;
        System.out.println(precioT);
        //calcula precio con iva
        double ivacalculado = precio * porcentajeIVA/100;// 500*10/100=50
        System.out.println(ivacalculado);
        //precio con iva
        double precioconiva = precio + ivacalculado;
        System.out.println();



    }
}
