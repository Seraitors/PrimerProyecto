package Ejercicios;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nombre= sc.nextLine();
        int edad= sc.nextInt();
        int años= sc.nextInt();
        //se pone esto por que si no cuando lo ejecutas se lo salta
        sc.nextLine();
        String comida= sc.nextLine();
        System.out.println("El formulario de " +nombre +" "+ edad + " "+ "años y de "+ años+ "de experencia , esta completo. nos comunicaremos con usted si necesitamos alguien que cocine comida"+ comida);

    }
}
