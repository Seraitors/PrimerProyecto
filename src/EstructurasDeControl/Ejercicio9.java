package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        String user= "pablito";
        String contrase ="1234";

        Scanner sc = new Scanner(System.in);
        System.out.printf("usuario");
        String usuario = sc.nextLine();
        System.out.printf("Contraseña");
        String contraseña= sc.nextLine();
        if( usuario.equals(user) && contraseña.equals(contrase)){
            System.out.println("Has entrado ");
        } else {
            System.out.println("Erroooo alerta ");
        }
    }
}
