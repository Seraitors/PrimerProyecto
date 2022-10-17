package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Numero");
        int numero= sc.nextInt();
        String dia="";
        switch (numero){
            case 1 ->dia="lunes";
            case 2 ->dia="martes";
            case 3 ->dia="miercoles";
            case 4 ->dia="jueves";
            case 5 ->dia="viernes";
        }
        System.out.println(dia);
    }
}
