package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();//ejemplo 100
        //tenemos que ir mirando todos los numeros entre 1 y n:
        //si es multiplo : al dividirlo por 5 el resto da 0 = lo muestro por pantalla
        //si no es multiplo de 5 , no hago nada
        for (int i=1 ; i <=n; i++){
            //si es multiplo de 5
            if (i %5==0){
                System.out.println(i + "");
            }
        }


    }
}
