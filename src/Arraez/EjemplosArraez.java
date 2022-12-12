package Arraez;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EjemplosArraez {
    public static void main(String[] args) {

        double[] elementos;
        // para imprimir

        elementos= new double[5];
        elementos [0] = 10.8;
        elementos [1] = 14.3;
        elementos [2] = 13.5;
        elementos [3] = 12.1;
        elementos [4] = 9.7;
        System.out.println();

        String[ ] cadenas = new String[5];
        cadenas [0]= "Lunes";
        cadenas [1]= "Martes";
        cadenas [2]= "Miercoles";
        cadenas [3]= "Jueves";
        cadenas [4]= "Viernes";

        String[] meses ={"Enero","Fre","mar","abri","may","jun","julñ","agod","sep","oc","nom","dic"}; // en ves de new pongo llaves y dentro los valores separados por comas

        for (int i = 0; i <elementos.length ; i++) {
            System.out.printf(elementos[i] +" ");
        }

        System.out.println();
        System.out.println(Arrays.toString(cadenas));// una manera de imprimir


        for (String elemento:meses // otra menar de imprimir
             )
            System.out.printf(elemento + " "); {

        }

    }
}
