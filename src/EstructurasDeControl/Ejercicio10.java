package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eres culpable (S/N)");
        String culpable = sc.nextLine();
        if (culpable.equals("S")){//la comparacion entre string se hace con el metodo equals:si la avriable culpable es igual a s
            System.out.println( "a la carcel");
        } else if( culpable.equals("N")) {
            System.out.println("a casa");
        }else {
            System.out.println(" no me tomes e pelo");
        }
    }
}
