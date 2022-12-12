package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int control=0;
    do {

        System.out.println("\n1 derecha\n2 Izquierda \n3 subir \n4 Bajar \n5 Salir " );
        control= sc.nextInt();
        if (control==1){
            System.out.println("->");
        } else if (control==2) {
            System.out.println("<-");
        } else if (control==3) {
            System.out.println("↓");
        } else if (control==4) {
            System.out.println("↑");
        } else if (control==5) {
            System.out.println("salir");
        }
    }while (control !=5);
    }
}
