package Arraez;

import java.util.Arrays;

public class Ejercicio07 {
    public static void main(String[] args) {


        int[] nota = new int [12];
        for (int i = 0; i <nota.length ; i++) {
            nota  [i]= (int )(Math.random() * 10 );

        }
        System.out.println(Arrays.toString(nota));

        double negatvo=0;
        double positivo=0;

        for (int i = 0; i < nota.length; i++) {

            if (nota[i]<=4){
                negatvo++;
            }else {
                positivo++;
            }
        }
        double mediaPositi=0;




    }
}
