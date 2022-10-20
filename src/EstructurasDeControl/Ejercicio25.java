package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Primer numero");
        int a = sc.nextInt();
        System.out.println("segundo numero");
        int b = sc.nextInt();
        // ahora tenemos que ver cual es mayor y cual es menor para el for
        //si a es mayor qu eb hacemos la suma desde a hasta b
        // pero si b es mayor que a hacemos la suma
        int suma=0;
        if ( a<b){
            for ( int i=a; i<=b; i++){
                suma = suma+i;
            }

        }else {
            for (int i = b; i <=a; i++) {
                suma = suma +i;
            }
        }
        System.out.println( suma);

    }
}
