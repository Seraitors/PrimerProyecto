package EjemplosString;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();

        String invertida="";
        cadena=cadena.replace(" ", "");

        //System.out.println(cadena);

        for (int i = cadena.length() -1; i >= 0 ; i--) {

            invertida = invertida+ cadena.charAt(i);

        }
        System.out.println(invertida);


        if (cadena.equals(invertida)){
            System.out.println("es un palindro");
        }else {
            System.out.println("Pues no ");
        }


    }
}
