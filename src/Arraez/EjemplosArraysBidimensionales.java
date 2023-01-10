package Arraez;

import java.util.Arrays;

public class EjemplosArraysBidimensionales {
    public static void main(String[] args) {
        // declaramos un array de 3x4 de numeros enteros

        int [][] tabla = new  int  [3][4];

        // lo vamos a rellenar con numeros aletorios de 1 y 4

        for (int i = 0; i < tabla.length ; i++) { // para que arrae de la tabla
            for (int j = 0; j <tabla[i].length ; j++) {

                tabla[i][j]=(int)(Math.random()*4+1);
            }

        }



        for (int i = 0; i <tabla.length ; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

    }
}
