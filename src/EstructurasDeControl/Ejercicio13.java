package EstructurasDeControl;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" Dime el precio inicial de la uva ");
        double inicial= sc.nextDouble();
        System.out.println("tipo a o b ");
        char tipo = sc.next().charAt(0);
        System.out.println(" tamaño de la uva");
        double tamaño = sc.nextDouble();
        System.out.println("kilos que se van a vender en un embarque");
        double vender = sc.nextDouble();
        double calculos=0;
        //calculos
        if (tipo== 'A'&&tamaño==1){
            calculos =inicial + 0.2;
        } else if (tipo=='A'&& tamaño==2) {
            calculos= inicial +0.3;
        } else if (tipo =='B'&& tamaño ==1) {
            calculos =inicial-0.3;
        } else if ( tipo =='B' && tamaño==2) {
            calculos= inicial -0.5;
        }else{
            System.out.println( " mal datos incorrectos");
        }

    double preciot= calculos* vender;
        System.out.println(" el precio total seria "+ preciot);

    }
}
