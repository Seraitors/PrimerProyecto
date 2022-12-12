package EjemplosString;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //que lea dos cadenas
        String cadena1= sc.nextLine();
        String cadena2= sc.nextLine();
        //quito los espacios a las dos cadenas
        cadena1=cadena1.replace(" ","");
        cadena2=cadena2.replace(" ","");

        // las comparos
        System.out.println( "son iguales " + cadena1.equals(cadena2));
        //si me da mayusculas
        System.out.println( "son iguales " + cadena1.equalsIgnoreCase(cadena2));


    }
}
