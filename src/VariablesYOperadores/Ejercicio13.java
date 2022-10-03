package VariablesYOperadores;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
/*232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.*/
        Scanner sc = new Scanner(System .in);
        int euros = sc.nextInt();
        int billetes500= euros / 500;
        int auxiliar = euros% 500;// en el resto queda lo demas : de 200 de 100
        int billetes200 = auxiliar / 200;
        auxiliar = auxiliar %200;// aqui en este resto esta lo que queda de 50,20
        int billetes100 =  auxiliar /100;
        auxiliar = auxiliar % 100;
        int  billetes50 = auxiliar/50;
        auxiliar = auxiliar %50;
        int billetes20  = auxiliar/20;
        auxiliar = auxiliar %20;
        int billetes10 = auxiliar /10;
        auxiliar = auxiliar%10;
        int billetes5= auxiliar/5;
        auxiliar=auxiliar %5;
        int moneas2= auxiliar/2;
        int moneas1= auxiliar%2;
        System.out.println( euros + " " + billetes500+ " " + billetes200+ " "+ billetes100 + " " + billetes50 +" "+ billetes20 +" "+ billetes10 + " " + billetes5);


    }
}
