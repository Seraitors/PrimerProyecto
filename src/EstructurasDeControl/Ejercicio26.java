package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        //queremos que pida 10 numero por teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("dime 10 numeros");
         double suma = 0;

       for (int i =0; i<10 ; i++){
           System.out.println("numero");
          double n = sc.nextDouble();
    // est enumero que pido lo tengo que ir acumulando
           suma=suma +n;
       }
    // cuando salgoo del bucle  ya tengo el numerador de la media
        double media = suma /10;
        System.out.println(" la media es "+ media);


    }

}
