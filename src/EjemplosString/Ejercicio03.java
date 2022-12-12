package EjemplosString;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena= sc.nextLine();
        System.out.println("Cambiame las letras a por b " + cadena.replace("a", "b"));

    }
}
