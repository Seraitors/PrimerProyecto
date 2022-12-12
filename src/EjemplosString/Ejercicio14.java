package EjemplosString;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" dime un cadena");
        String cadena = sc.nextLine();
        System.out.println(" dime un caracter");
        char c1 = sc.next().charAt(0);
        System.out.println("dime a tu ppaa");
        char c2 = sc.next().charAt(0);

        cadena = cadena.replace(c1,c2);
        System.out.println(cadena);

    }
}
