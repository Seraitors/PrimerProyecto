package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("B");
        int b= sc.nextInt();
        //tenemso que hacer un asuma dsde a hasta b
        //declaramos una varable suma
        int suma=0;

        for (int i=a ; i<=b; i++){
            //aqui dentro vamos acumulando todos los numeros desde a hasta b
            suma= suma +i;//sumo lo que tengo acumulado hasta ese momento
        }
        System.out.println(suma);
    }
}
