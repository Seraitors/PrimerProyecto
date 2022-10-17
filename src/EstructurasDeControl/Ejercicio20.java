package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("operación a realizar");
        char operacion =sc.next().charAt(0);
        //creamos una varianble antes del bloque y guardamos el resyltado antes de bloque
        //miro el valor de la variable operacion y en funcion de eso hago un aoperacion u otra
        int resultado=0;
        switch (operacion){
            case '+':
                resultado=n1+n2;
                break;
            case'-':
                resultado=n1-n2;
                break;
            case'*':
                resultado=n1*n2;
                break;
            case '/':
                resultado=n1/n2;
                break;
            default:
                System.out.println("operacion incorrecta");



        }
        System.out.println( "aqui tienes el resultado" + resultado);
    }
}
