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
        //con los decimales:
        //Cuando los escribimoa en el codigo fuenye: se pone
        //cuando metemos lso datos por teclado:se pone ,

        //formas alternativas de declarar una variable (pag11)
        String lenguaje = "java";
        String version ="8 o superior";
        //esto tambien se puuede hacer asi:
        String lenguaje1 ="java" , version1 ="10 o Uperiro";
        int num1 = 5 , num2=10; //declaro variables int en la misma linea
        //tambien se puede hacer
        int num3; //aqui declaro la varible sin asignar nada, coge el valor por definion y es el 0
        num3=6;
        num3=num1; // aqui guarda en numero 3 el valor de numero 1
        System.out.println(num3);
        //inferencia de tipo
        var variable="hola";
        var otraVariable=10;
        System.out.println(lenguaje1);




    }

}
