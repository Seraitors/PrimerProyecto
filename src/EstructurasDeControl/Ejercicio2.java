package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " dime tu sueldo");
        int sueldo = sc.nextInt();
        if ( sueldo > 9000 ){
            System.out.println(" abona impuestos");
        } else {
            System.out.println( " no los abones no llegas perro");
        }
    }
}
