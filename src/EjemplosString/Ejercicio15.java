package EjemplosString;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("cadena:");

        String cadena = sc.nextLine();
        System.out.println("Caracter:");

        char c = sc.nextLine().charAt(0);
        int contador=0;
        for (int i = 0; i <cadena.length() ; i++) {
            if (cadena.charAt(i) == c ){
                contador++;
            }
        }
        System.out.println(" Aparece estas veces " + c +' '+ contador);
    }
}
