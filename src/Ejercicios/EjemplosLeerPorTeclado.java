package Ejercicios;

import java.util.Scanner;

public class EjemplosLeerPorTeclado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                //Ahora ya podemos meter datos por teclados
        //Pero para poder utilizarlos despues en el programa
        //tenemos que guardarlos en un avariable

        //las variables que guardas palabras o cadenas de ytextos se llaman strim
        System.out.println("Introduce tu nombre ");
        String nombre = sc.nextLine();// escibe el nombre en el teclado y lo guarda
        System.out.println("hola " + nombre);


        System.out.println("Dime tu apellido");
        //creo otra variable para guardar el apellido
        String apellido = sc.nextLine();
        System.out.println("encantado " + nombre +" "+ apellido);
        System.out.println("Cuantos años tienes  ");
        int edad = sc.nextInt();
        /*
        este metodo nextInt tiene un peligo: si a continuación lo salta.
        La manera de evitar cada vez qu eyo escriba nexInt y salte es poner poner nexline sin poner nada y no sale y salgabien
         */
        sc.nextLine();//Esto es solo para evitar que salte
        System.out.println("Vaya pareces muy joven para tener estos años " + edad);
        System.out.println("tienes un perro?");
        String mascota = sc.nextLine();
        System.out.println("Pues muy bien");
        //vamos a meter dato con decimales
        System.out.println("Y cual es tu patrimonio");
        double patrimonio = sc.nextDouble();
        System.out.println("muy bien eso"+ patrimonio);




    }

}
