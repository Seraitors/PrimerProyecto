package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        //escribe un programa que este dado un numero n introducido por teclado
        //cuadrado dimension n+n com un crarcter
        // tenemos que pedir un numero por teclado que no nos cuelen un nuemro neg
        Scanner sc = new Scanner( System.in);
        System.out.println( "Introduce un numero positivo ");
        int n = sc.nextInt();
        if ( n<=0){
            System.out.println( " no me vale");
        }else {//si entra por aqui n es mayor que cero entonces lo pongo aqui
            // ahora pedimos un caracter para dibujar el cuadrado
            System.out.println("caracter");
            char c = sc.next().charAt(0);
            for (int i = 0; i <n ; i++) {// si N es igual que 4 dibujara la fila 0,1,2,3,
               // ahora vamos a usar el for interno para las columnas
                for (int j = 0; j <n ; j++) {
                    System.out.print( c + " ");
                }
                System.out.println();
            }

        }
    }
}
