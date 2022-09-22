package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio4  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero:");
        int num1= sc.nextInt();
        System.out.print("segundo numero");
        int num2 = sc.nextInt();
        System.out.print("Tercer numero");
        int num3 = sc.nextInt();
        System.out.print("Cuarto numero");
        int num4 = sc.nextInt();

        int suma = num1 + num2;
        int mult = num3 * num4;
        System.out.println(num1+ "+" + num2 + "="+ suma);
        System.out.println(num3+ "*" + num4 + "="+mult );

    }
}
