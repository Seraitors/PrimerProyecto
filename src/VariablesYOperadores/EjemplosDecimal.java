package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosDecimal {
    public static void main(String[] args) {
        //tipo double
        double ceroComaCero = 0.0;
        double unoComaCero = 1.0;
        double DecimalNeg = -1.234;
        //float
        float decimalFloat = 1.2f ;
        float muchos = -35.78457457547545f;
        System.out.println(muchos); //con esto perdemos precision
// notacion cientifica
        double eps = 5e-3;
        double eps1 = 0.01e2;
        System.out.println(eps);
        // operaciones aritmeticas
        System.out.println("suma "+ (eps + eps1));
        System.out.println("resta " + (eps - eps1));
        System.out.println( "multiplicar" + (eps * eps1));
        System.out.println("division " + (eps / eps1));
        // no tiene sentido hacer el resto %

        //que pasa si divido numeros enteros y los guardo en una variable con decimales
         double d1 = 5/4 ; //sin decimales te da el numero entero
        System.out.println( " division "+ d1);
        double d2 = 5.0 /4.0;// con la coma te da los decimales
        System.out.println( "division 2 "+ d2);
// falta de precision
        System.out.println( 3.3/3);


        // leer desde teclado num decimales
        Scanner sc = new Scanner(System.in);
        float decimalTeclado = sc.nextFloat();// numeros decimales se en teclado se meten con una coma
        System.out.println(decimalTeclado);
        double decimalT = sc.nextDouble();
        System.out.println(decimalT);


    }
}
