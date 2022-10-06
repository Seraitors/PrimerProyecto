package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Es culpable?");
        boolean culpable = sc.hasNextBoolean();
        if (culpable) {
            System.out.println("No culpable");
        } else {
            System.out.println("Es culpable");
        }
    }
}