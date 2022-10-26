package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1 cuantos numeros se van a a introducir
        System.out.println("Numero introducidos");
        //ahora lo vamos a pedir
        int numeros = sc.nextInt();
        int contadorDePositivo = 0;
        int contadorDeNegativos = 0;
        int contadorDeCeros = 0;

        int contador = 0;//la variable contador sirve para contar los nmeros qu e e metido

        for (int i = 0; i < numeros; i++) {
            System.out.printf("Introduce numero;");
            int n = sc.nextInt();
            // cada vez que meto un numero el contador se incremneta en una unidad


            if (n > 0) {
                // si el numero e spositivio negativo 0
                contadorDePositivo++;
                System.out.println("conatdor de positivio" + contadorDePositivo);
            } else if (n < 0) {
                // si no es positivo , puede ser negativo 0
                contadorDeNegativos++;
                System.out.println(" contador de negativos " + contadorDeNegativos);
            } else {
                // la unica posibilidad que queda si no ha entrado en ningun de las cosas anteriores que sea 0
                contadorDeCeros++;
                System.out.println(" contador de ceros " + contadorDeCeros);
            }

        }
        System.out.println( "total de positivos " + contadorDePositivo);
        System.out.println( "total de negativods " + contadorDeNegativos);
        System.out.println( "total de ceros " + contadorDeCeros);

    }
    }