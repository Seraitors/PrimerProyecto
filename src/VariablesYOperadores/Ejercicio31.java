package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        // escribe un valor que lea por teclado
        int valor = sc.nextInt();

        // y verifique si es menos que 10
        boolean menosque10 = valor <10 ;

        // el programa deb eimprimir un boolar (true o false)
        System.out.println(menosque10);

    }
}
