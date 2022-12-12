package EjemplosString;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String cadena= sc.nextLine();
        int inf = sc.nextInt();
        int sup = sc.nextInt();

        String subcadena=cadena.substring(inf , sup);
        System.out.println(subcadena);


        if (inf >=0 && sup >= 0 && inf <cadena.length() && sup<subcadena.length()&& inf !=sup){

            System.out.println(subcadena);

        }else {
            System.out.println("mal");
        }


    }
}
