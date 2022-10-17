package EstructurasDeControl;

import java.util.Scanner;

public class EjemplosSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("elige una variable del 1+4");
        int accion = sc.nextInt();
        sc.nextLine();// acuerdate de poner esto para que no te saltre
        /*if ( accion ==1){
            System.out.println("comenzandopartida");
        } else if (accion==2) {
            System.out.println(" cargando partida");

        } else if (accion==3) {
            System.out.println("mostarr ayuda");

        } else if (accion==4) {
            System.out.println("salir");
        }else {
            System.out.println("accion incorrecta");
        }*/
        //esto se puede poner de otar forma
        //cuando en el if tienes == 0 equals evaluas el balor de una variable y segun sea haces una accion o otra
       /* switch (accion){//este parentesisis solo puede ir el nombre de l avariable
            case 1:
                System.out.println("comenzando partida");
                break;
            case 2 :
                System.out.println(" cargando partida");
                break;
            case 3:
                System.out.println("mostarr ayuda");
                break;
            case 4 :
                System.out.println("accion incorrecta");
            default:// aqui entra si no se cumple ninguno d elos casos anteriores
                System.out.println("accion incorrecta");
                break;*/
// este es otro ejemplo
        System.out.println("dia de la semana:");
        String dia = sc.nextLine();
        //segun el dia de la semana ponme un numero
        int numero =0;
        switch (dia){
            case "lunes":
                numero=1;
                break;
            case "martes":
                numero=2;
                break;
            case "miercoles":
                numero=3;
                break;
            case "jueves":
                numero=4;
                break;
            case "viernes":
                numero=5;
                break;
            case "sabado":
                numero=6;
                break;
            default:
                System.out.println("Lo que has introducido no es correcto");




        }
        System.out.println(numero);
    }
}
