package Ejercicios;

public class LasVariables {
    public static void main(String[] args) {
        //Variables
        int a; //Declaro la variable a
        a = 5 ; //Declaro la variable a  y a continuacion guardo en ella un 5
        System.out.println("La variable a vale" + a);
        // su valor puede ser modificado en cualquier momwento
        a = 8 ;
        System.out.println("La variable a vale" + a);

        //Reglas para nombrar variables
        //int 0a =5; (peta)
        //Puede contener cualquiera letra o digito
        //No puede contner ningun caracter especail (signos de puntuacion )
        //No puede contener espacios
        int _variable =4;//Asi tambein se pueden declarar variables
        System.out.println("Tipos de varianles");
        System.out.println("======");
        System.out.println("Las variables se declara poniendo 1 , el tipo de variable que es y 2 el nombre que le damos a l avariable");
        System.out.println("Variables para numeros enteros: byte,short, int long ");
        System.out.println("byte"); //Poniendo byte tambien es igual que poner int y declaras la variable
        byte variableBytePos = 127;// es el numero mas grande que puedo guaradar en una variable de typo byte
        byte variableByteNeg = -128;// es el numero mas pequeño que puedo guardar en una variable byte
        System.out.println("variablesBytePos = " +variableBytePos);
        System.out.println("variablesByteNeg =" + variableByteNeg);
        System.out.println("Numero con decimal : float o double");
        double decimal = 3.14 ;
        double numero = 3;
        System.out.println(numero);
        System.out.println(decimal);
        float otroDecimal = 8.43f; //si declaramos una variable de tipo float ponemos una f
        //con los decimales:
        //Cuando los escribimoa en el codigo fuenye: se pone
        //cuando metemos lso datos por teclado:se pone ,

        //formas alternativas de declarar una variable (pag11)
        String lenguaje = "java";
        String version ="8 o superior";
        //esto tambien se puuede hacer asi:
        String lenguaje1 ="java" , version1 ="10 o Uperiro";
        System.out.println(version1);
        int num1 = 5 , num2=10; //declaro variables int en la misma linea
        //tambien se puede hacer
        int num3; //aqui declaro la varible sin asignar nada, coge el valor por definion y es el 0
        num3=6;
        num3=num1; // aqui guarda en numero 3 el valor de numero 1
        System.out.println(num3);
        //inferencia de tipo
        var variable="hola";
        var otraVariable=10;





    }
}
