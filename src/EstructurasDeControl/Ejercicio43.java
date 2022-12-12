package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {

        //haz un programa qu eimprima los 50 primeros multiplos de 5 añadiendo un salto de linea cada 10
        Scanner sc = new Scanner(System.in);
        int numero=1;
        int contador=0;

        while (contador<50){

            if (numero%5==0){
                //si el nuemoer es un multiplo lo imprimimos
                System.out.println(numero);
                contador++;
                if (contador%10==0){
                    System.out.println();
                }
            }//cada vez que incremento un numero el contador

            numero++;
        }

    }
}
