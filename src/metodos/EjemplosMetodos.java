package metodos;

import java.util.Scanner;

public class EjemplosMetodos {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String nombre =pideNombre();
    // quiero imprimir le metodo nombrre
        imprimenombre(nombre);
        otroNombre(nombre);// esto es llamar al metodo lenght
    }
    public static String pideNombre(){
        System.out.print("Dime nombre:");



        String nombre = sc.nextLine();
        // cuando devulve algo un metodo hay que poner return
        return nombre;
    }

public static void  imprimenombre(String n ){// del parametro tengoq ue poner el tipo y el nombre que yo quiera
    System.out.println(n );
}



 public static void otroNombre(String p){
     System.out.println(p.length());
 }
// declara un metodo que no reciba nada pregunta un nombre y lo devuelve



}
