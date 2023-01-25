package Arraez;

import java.util.Arrays;

public class Ejercicio22 {
    public static void main(String[] args) {

int [][] tabla = new int[5][5];
        for (int i = 0; i < tabla.length ; i++) {
            for (int j = 0; j <tabla[i].length ; j++) {
                tabla[i][j]=(int)(Math.random() *11);
            }
        }
        for (int i = 0; i < tabla.length ; i++) {
            for (int j = 0; j <tabla[i].length ; j++) {
                System.out.print(tabla[i][j ]+ "\t");
            }
            System.out.println();
        }

     // vamos a sumar las filas




        int []sumaFila=new int[5];
        for (int i = 0; i < tabla.length ; i++) {
            int suma=0;
            for (int j = 0; j <tabla[i].length ; j++) {
                suma=suma+tabla [i][j];
            }
            // cda vez que termino de sumar una fila guardo el resultado en el array
           sumaFila[i]=suma;

        }
        System.out.println(Arrays.toString(sumaFila));


        int []sumaColumna=new int[5];
        for (int i = 0; i < tabla.length ; i++) {
            int suma=0;
            for (int j = 0; j <tabla[i].length ; j++) {
                suma=suma+tabla [i][j];
            }
            // cda vez que termino de sumar una fila guardo el resultado en el array
            sumaColumna[i]=suma;

        }
        System.out.println(Arrays.toString(sumaColumna));
    }
}
