package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("numero 1:");
        int numero1= sc.nextInt();
        System.out.print("numero 2:");
        int numero2= sc.nextInt();

        if (numero1 > numero2){
            System.out.println(" El numero 1 es mayor");
        } else {
            System.out.println("El numero dos es mayor");
        }
    }
}
