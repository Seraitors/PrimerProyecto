package EjemplosString;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



/*        String n1="15";
        String n2="16";
        //String n1="15";
        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);


        System.out.println( a+b);

        String cadena=String.valueOf(100);
        System.out.println(cadena+cadena);
        Scanner sc = new Scanner(System.in);*/


        int n = 0;
        String cadena="";
        do {
            System.out.println("Numero");
            n=sc.nextInt();sc.nextLine();
            if (n!=0){
                String num=String.valueOf(n);
                cadena=cadena +num + " ";
            }

        }while (n!=0);
    }
}
