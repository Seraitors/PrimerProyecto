package Arraez;

import java.util.Arrays;

public class Ejercicio06 {
    public static void main(String[] args) {

        int [] array = new int[ 200];

        for (int i = 0; i <array.length ; i++) {

            array  [i]= (int )(Math.random() * 22 -11);

            System.out.println(Arrays.toString(array));

        }

        int contadorPostivo=0;
        int contadorNega=0;
        int contadorCero=0;
        int suma=0;
        int resta=0;

        for (int i = 0; i <array.length ; i++) {

            if (array[i]<0){
                contadorNega++;
                resta = resta +array[i];

            } else if (array[i]==0) {
                contadorCero++;
            }else {
                contadorPostivo++;
                suma= suma+ array[i];
            }
        }
        double  media= suma /contadorPostivo;
        double media1 = resta / contadorNega;

        System.out.println(contadorPostivo);
        System.out.println(contadorCero);
        System.out.println(contadorNega);
        System.out.println(suma);
        System.out.println(resta);
        System.out.println( " meidia suma" +media);
        System.out.println(" media resta" + media1);

    }
}
