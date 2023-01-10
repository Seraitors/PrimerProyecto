package Arraez;

import java.util.Arrays;

public class Ejercicio23 {
    public static void main(String[] args) {
        int [][] diagonal = new int [5][5];
        for (int i = 0; i < diagonal.length ; i++) {
            for (int j = 0; j < diagonal[i].length ; j++) {
                if (i == j){
                    diagonal[i][j] =  1;
                }else {
                    diagonal[i][j]=0;
                }
            }
        }

        for (int i = 0; i <diagonal.length ; i++) {
            System.out.println(Arrays.toString(diagonal[i]));
        }
    }
}
