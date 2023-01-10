package Arraez;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arrayList = new ArrayList<>();
        int numero = 0;
        do {
            System.out.println("Introduce numero  (Negativo para terminar)");
              numero = sc.nextInt();

            if (numero> 0){
                arrayList.add(numero);
            }
        }while (numero >=0);
        System.out.println(arrayList);
        System.out.println("ordenador");
        Collections.sort(arrayList);

    }
}
