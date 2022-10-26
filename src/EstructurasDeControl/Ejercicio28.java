package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero mayor");
        int base = sc.nextInt();
        System.out.println("Numero menor");
        int altura = sc.nextInt();
        if (base<=0){
            System.out.println("no me vale");
        } else if (altura<=0) {
            System.out.println(" Tampoco me vale");
        } else if (altura >base) {
            System.out.println( "no sirve");
        } else {
            System.out.println(" Dime un cararcter");
            char c = sc.next().charAt(0);
            for (int i = 0; i <altura ; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }

        }
    }
}
