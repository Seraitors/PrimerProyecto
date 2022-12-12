package EjemplosString;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println( cadena.startsWith("J") || cadena.startsWith("j"));
    }
}
