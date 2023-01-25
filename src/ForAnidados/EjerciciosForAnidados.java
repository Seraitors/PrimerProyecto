package ForAnidados;

import java.util.Scanner;

/**
 *  Estos ejercicios estan en l ahoja de estructuras de control de l a 1 evolucion
 */

public class EjerciciosForAnidados {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

      int ejecicio = menu();
        String seguir ="";
        do {
           switch (ejecicio){
        case 27:
            ejecicio27();
            break;

        case 28:
            ejercicio28();
            break;

        case 29:
            ejercicio29();
            break;
        case 35:
            ejercicio35();
            break;
        default:
            System.out.println( "ese ejer no entra");


    }
    System.out.println("Quierews hacver otro ejer (S/N)");
    seguir=sc.nextLine().substring(0,1);
} while (seguir.equalsIgnoreCase("S"));


    }



    public static void ejecicio27() {
        String enunciado= " Escribe un programa que dado un numero que introducido por teclado sea , un cuadrdo de dimensiones";
        System.out.println("Introducr un numero");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce un caracter ");
        char c = sc.nextLine().charAt(0);
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }



    }
    public  static  void    ejercicio28(){
        System.out.println("a");

        int a = sc.nextInt();
        System.out.println("b");
        int b = sc.nextInt(); sc.nextLine();
        System.out.println("Caracter:");
        char c = sc.nextLine().charAt(0);

        int base , altura =0;
        if (a>b){
            base=a;
            altura=b;
        }else {
            base=b;
            altura=a;
        }
        // en base tengo ya numero mayor y en altura el menor
        //ahora pinto el rectangulo
        //tengo que hacer tantas filas como sea
        for (int i = 0; i <altura ; i++) {
            for (int j = 0; j <base ; j++) {

                System.out.print(c + "\t");
            }
            System.out.println();

        }
    }
    public  static  void ejercicio29 (){
        String enunciado =" otro enunciado de l apagina de internet que no e copiado es el 29";


        System.out.println("Numero");
        int n = sc.nextInt();sc.nextLine();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print((i*j) + "\t");

            }
            System.out.println();
        }
    }
    public  static void ejercicio35(){
        String enunciado = " otro enunciado pero ete es el 35";

        System.out.println("n=");
        int n = sc.nextInt();sc.nextLine();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

    //metodo menu que pregunta que ejer quieres hacer 27 . 28 .29 .35
    //y devuelv eel numero de ejer a realizar

    public  static int  menu(){

        System.out.println(" que ejercicio quieres hacer ?\n27\n28\n29\n35");

        int ejercicio =sc.nextInt();
        sc.nextLine();
        return ejercicio;
    }
}
