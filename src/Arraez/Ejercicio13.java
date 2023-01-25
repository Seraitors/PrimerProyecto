package Arraez;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        ArrayList < Integer> arrayList= new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Numero");

            int n= sc.nextInt(); sc.nextLine();

            arrayList.add(n);
           ;

        }
        boolean ordenCre=true;
        System.out.println(arrayList);

        for (int i = 0; i <arrayList.size() ; i++) {

            if ( !(arrayList.get(i) <= arrayList.get(i+1))){

               ordenCre=false;
                break;
            }

        }


        System.out.println(ordenCre);
        boolean ordendrecee=true;
        if (!ordenCre){

            for (int i = 0; i <arrayList.size() -1  ; i++) {

                if ( !(arrayList.get(i) <= arrayList.get(i+1))){
                    ordendrecee=false;
                    break;
                }
            }
        }


        if (ordenCre){
            System.out.println("esta ordenado");
        } else if (ordendrecee) {
            System.out.println("esta en un orden decreciente");
        }else {
            System.out.println("no esta ordenado");
        }
    }
}
