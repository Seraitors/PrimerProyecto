package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosDoWhile {
    public static void main(String[] args) {

        //la ventaja que tiene do-while es que si o si imprima
    // por ejemplo pedimos numeros y 0 para salir
        Scanner sc = new Scanner(System.in);
        System.out.println( "introduce numeros (0pata saluir)"  );
        int numero =0;
        do {
            numero = sc.nextInt();
        }while ( numero !=0);//mientras eso no sea fase eso va a seguir dividiendo numero

    }
}
