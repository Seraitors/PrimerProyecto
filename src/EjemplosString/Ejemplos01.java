package EjemplosString;

import java.util.Scanner;

public class Ejemplos01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        for (int i = 0; i <=cadena.length()-1 ; i++) {//recoremos el string desde el 1 aracter (1 posiciion) hasta el ultimo
            System.out.print(cadena.charAt(i) + " ");
        }
    }
}
