package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();
        if ((año%4==0 && año%100 !=0) || (año %4==0 && año %400==0)){//es bisiesto si es divisible por 4 y no es divisible por 100
            System.out.println("bisieto");
        } else {
            System.out.println(" no biniesto");
        }
    }
}
