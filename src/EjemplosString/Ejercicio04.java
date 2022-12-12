package EjemplosString;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena=sc.nextLine();
        System.out.println("Termina en \"burgo\"" + cadena.endsWith("burgo"));

    }
}
