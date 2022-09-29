package VariablesYOperadores;

import java.util.Scanner;

public class EjemplosOperadoresRelacionales {
    public static void main(String[] args) {

        // sirven para comprar dos numeros y dan como resulyado un boolean
        int num1 =35;
        int num2 =23;

        num2 =num1; // estoy asignando a num2 el valor de num 1

       boolean compracion=  num2==num1;// estoy comparando los valores de num1 y num 2 resultado true lo asignado a comparacion

        boolean otraCompa = num2 !=num1;

       int nueve = 9;
       int otronueve =9;
       int  diez =10 ;
        System.out.println( nueve > otronueve);
        System.out.println( nueve >= otronueve);
      int edad =18 ;
        System.out.println( "mayor de edad " + (edad >= 18));
        System.out.println( "mayor de edad " + (edad > 17));
        // cuando aparecen operadores mezclados de distinto tipo (
        /*1º) Paréntesis
      2 °) Incrementos y decrementos ( + + y -- )
      3º) Operadores aritméticos ( en el orden habitual : primero * y / , después + y - )
      4 °) Operadores relacionales ( > , > = , == , etc. )
      5 °) Operadores lógicos ( en el orden indicado : ! , ^ , && , || )*/

       int num =1000;
       boolean resultado = num +10 > num + 9 ;// 1010 > 1009 true



        //unir operaciones relacionales usando operadores logicas
        int a = 5;
        int b = 6;
        int c = 7;
        // quiero saber si a <= b <= c
        //System.out.println( a <= b <= c); esto asi no se puede poner
        // hay que hacer al comparcion de dos en dos con un and
          System.out.println(a <= b && b <= c );
          // ejemplo: pedimos tres estaturas por teclado y queremos ver si estan en orden ascemdemte
        Scanner sc = new Scanner(System.in);
        int estatura1 = sc.nextInt();
        int estatura2 = sc.nextInt();
        int estatura3 = sc.nextInt();
        boolean ordenascendente =estatura3 <= estatura2 && estatura2 <= estatura1;
        System.out.println( "Orden ascendente ");
        System.out.println( ordenascendente);
        // tambien compramos si estan en orden descendente
        System.out.println();
        boolean ordenDscendente = estatura1>= estatura2 && estatura2>= estatura3;
        System.out.println(ordenDscendente);




    }
}
