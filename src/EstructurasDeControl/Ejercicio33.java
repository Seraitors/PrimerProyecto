package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime l abase ");
        int base = sc.nextInt();
        System.out.println("dime el exponente");
        int exponente = sc.nextInt();
        // saque el resultado por pantalla el resultado de la potencia
        int guardar=1;
        for ( int i= 0; i<exponente; i++){
            guardar= guardar*base;
            System.out.println(guardar);
        }
    }
}
