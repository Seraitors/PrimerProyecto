package Arraez;

import java.util.Arrays;

public class EjemplosaApi {
    public static void main(String[] args) {

        // Arrays.sort(nombre)
        int []enteros={ 5,-23,22,102,734,-44};

        //quieero ordenarlo
        Arrays.sort(enteros);

        System.out.println(Arrays.toString(enteros));

        //cmprara arraes
        int[] num1= {1,2,3,4,5};
        int[] num2= {6,2,7,4,5};
        int[] num3= {1,2,3,4,5};
        System.out.println(Arrays.equals(num1,num2)); // imprime Flase
        System.out.println(Arrays.equals(num1,num3)); // imprime true



    }
}
