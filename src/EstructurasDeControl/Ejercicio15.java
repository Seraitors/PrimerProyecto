package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {


/*
        15. Tenemos un programa que pregunta a los estudiantes qué lenguaje de
        programación están estudiando. Hay cuatro opciones, una de las cuales es correcta:
        Java, Kotlin, Scala o Python
        Tu tarea consiste en leer el número de respuesta de la entrada estándar y generar
        el resultado de la prueba: " ¡Sí! ",*/

        Scanner sc = new Scanner(System.in);
        System.out.println(" que estas estudiando \n1. java \n2. kotlin\n3S. Scala\n4 . pytom");
        int opcion = sc.nextInt();
        switch ( opcion){
            case 1:
                System.out.println("SI");
                break;
            case 2:
                System.out.println("no");
                break;
            case 3:
                System.out.println("no");
                break;
            case 4:
                System.out.println("no");
                break;
            default:
                System.out.println("opscion incorrecta");
        }
        System.out.println("Fin");
    }

}
