package EjemplosString;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();


        System.out.print(cadena.charAt(0));
        for (int i = 0; i <cadena.length(); i++) {
            if (cadena.charAt(i) == ' '){
                System.out.print(cadena.charAt(i+1));

            }

        }
    }
}
