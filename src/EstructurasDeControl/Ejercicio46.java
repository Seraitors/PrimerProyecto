package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio46 {
    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 100 + 1);

       /* Escribe un programa que pida números al usuario entre 1 al 100 hasta que éste
        adivine un número que el programa ha elegido al azar. El programa debe ir dando
        pistas sobre si el número que tiene que adivinar es mayor o es menor que el
        introducido. El juego termina cuando te rindes (pulsando 0) o adivinas el número. Si
        se introduce un número fuera del intervalo debe dar un mensaje de error.


        */
        Scanner sc = new Scanner(System.in);
        int numero =0;
        do {
            System.out.println("Adivina el numero");
            numero = sc.nextInt();
            if (numero< 0 || numero > 100 ){
                System.out.println("Fuera de rango");
            } else if (numAleatorio==numero) {
                System.out.println("Has acertado");


            }else if (numero==0) {
                System.out.println("Te has rendido");
                break;

                }else if (numAleatorio>numero) {
                System.out.println("Mas grande");
            }

            else if (numAleatorio <numero) {
                System.out.println("Mas pequeño");

            }


        }while (numero !=numAleatorio );
        System.out.println("Te has rendido el numero hera " + numAleatorio);
    }
}
