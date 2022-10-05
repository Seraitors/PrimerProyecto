package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* System.out.println("dime tu edad");
        int edad = sc.nextInt();

        // si la edad es mayor que 100 es una persona con mucha xp
        // si no , pues nada , no se die nada
        if (edad> 100) {
            System.out.println("eres una persona con mucha xp");
        }
        //El resultado de l acondicion es boolean  ; podemos ismplificar aveces imprive verdasd  falso*/

        /*boolean semaforoA= false;
        if (semaforoA == true) {
        System.out.println( "adelanete cruza");
        } else {
                System.out.println( "dentente o te mueres");*/

        //vamos a ver si un numero es par o impar
        /*
        System.out.println("introduce numero");
           int numero = sc.nextInt();
           if ( numero %2 == 0){
               System.out.println( "numero par");
           }else {
               System.out.println( "numero impar");
           }*/

        int presupuesto = sc.nextInt();
        if (presupuesto < 100) {
            System.out.println("esto no es para mi ");
        } else if (presupuesto >= 100 && presupuesto < 200) {
            System.out.println("me comprare el paquetre basico");
        } else if (presupuesto >= 200 && presupuesto < 300) {
            System.out.println("me comprare el paquete estandar");
        } else {
            System.out.println("me compro lo que quiera");
        }
    }
}
