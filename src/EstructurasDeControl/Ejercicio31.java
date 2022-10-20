package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numeor");
        int n = sc.nextInt();
        int pro=1;
        for ( int i=n; i>=1 ; i--){
            pro=pro*i;

        }
        System.out.println(pro);
    }
}

