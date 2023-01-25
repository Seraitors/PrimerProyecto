package Arraez;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio18 {
    public static void main(String[] args) {


        ArrayList<Integer> enteros1 =new ArrayList<>();
        ArrayList<Integer> enteros2 =new ArrayList<>();
        for (int i = 0; i <10 ; i++) {

            enteros1.add((int) (Math.random() *100 ));
            enteros2.add((int) (Math.random() *100 ));

        }


        Collections.sort((enteros1));
        Collections.sort((enteros2));
        System.out.println(enteros1);
        System.out.println(enteros2);

        ArrayList<Integer> enteros3=new ArrayList<>();
        enteros3.addAll(enteros1);
        enteros3.addAll(enteros2);
        System.out.println(enteros3);

        Collections.sort(enteros3);
        System.out.println(enteros3);

    }
}
