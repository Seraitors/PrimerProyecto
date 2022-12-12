package EjemplosString;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String cadena = sc.nextLine();
        String invertido= "";

        for (int i = cadena.length()-1 ; i >=0; i--) {
            invertido=invertido+cadena.charAt(i);

        }
        System.out.println(invertido);


    }
}