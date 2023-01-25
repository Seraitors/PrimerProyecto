package EjemplosString;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cadena1=  pidecadena();
        String cadena2=  pidecadena();
        // ver si cadena 2 esta dentro de cadena 1

boolean resultado = contieneSbcadena(cadena1,cadena2);
        if (cadena1.contains(cadena2)){
            System.out.println("si");
        }else {
            System.out.println("no");
        }


    }


public  static String pidecadena(){
    Scanner sc = new Scanner(System.in);
    String cadena=sc.nextLine();
    return cadena;
}

    public  static boolean contieneSbcadena(String cadena1,String cadena2){

        if (cadena1.contains(cadena2)){
            return  true;
        }

        return false;
    }
}
