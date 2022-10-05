package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //pedidimos los datos
        Scanner sc = new Scanner(System.in);
        System.out.printf("edad");
        int edad = sc.nextInt();
        System.out.println("Nivel de estudios :\n0- sin estudios \n1 - Educacion primaria\n2 - eso\n3 - grado medio \n 4 - estudios superiores" );
        int estudios = sc.nextInt();
        System.out.printf("Ingresos");
        int ingresos= sc.nextInt();
        boolean jasp;
        if (edad<=28&&estudios >3 || edad < 30 && ingresos > 28000){
            jasp=true;
        }else {
            jasp = false;
        }
if ( jasp){
    System.out.println("eres un joven aunque sobradamente preparado");
}
    }
}
