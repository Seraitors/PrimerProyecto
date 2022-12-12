package EjemplosString;

import java.util.Scanner;

public class EjemplosString {
    public static void main(String[] args) {
        String cadena=new String("hola");// esto es muy largo
        String cadena2 ="Hola"; // es el unico tipo referencia en que puedes saltar al new al crear
        Scanner sc = new Scanner(System.in);

        String ejemplo="estorocleinimasteoidio";
        //podemso acceder a sus caracteres indicando el indice (la posiciion ) en la quwe estan

        System.out.println( ejemplo.charAt(0));
        System.out.println( ejemplo.charAt(10));// es la letra que estan ebn la psociih 10
        // metodos
        // para saber la longitud del String
        System.out.println("*********************************");
        System.out.println("********* metodos String *******");
        System.out.println("*************************");
        System.out.println(ejemplo.length());// te dice cuantas letras tiene la palabra 4, 3, etc
        String vacia ="";
        System.out.println(vacia.isEmpty());//te dice si esta vacia la variable o no
        System.out.println(ejemplo.isEmpty());//te dice si esta vacia o no
        System.out.println("Todo en mayusculas0" + ejemplo.toUpperCase());//esta te lo pone en mayusucula
        System.out.println("Todo en mayusculas" + ejemplo.toLowerCase());//esta en mminuscula
        System.out.println("Termina con \"cleta\"?" + ejemplo.endsWith("cleta"));//si acaba la palbra con eso te dice si acaba o no
        System.out.println("contiene\"cleido\"?" + ejemplo.contains("cleido"));//si tiene la palbra
        System.out.println("Subcadena" + ejemplo.substring(3,8));//te imprime lo que estan dentro de la palbra
        System.out.println("Sustituye e por i " + ejemplo.replace("e" , "i"));//te cambia la letra por otra que tu quieras
        String conEspacios= "     tititititti";
        System.out.println("longitud" + conEspacios.length() + "String" + conEspacios);//te coge los espacios
        String sinEspacios= conEspacios.trim();
        System.out.println("sin espacios" + sinEspacios.length() +"String" + sinEspacios);
        System.out.println("comparar con equsalsIgnoreCase");
        String minuscula="segunda";
        String mayusucula="SEGUNDA";
        System.out.println("con equals" + minuscula.equals(mayusucula));// comparamos las cosas
        System.out.println("con equalsIgnoreCase" + minuscula.equalsIgnoreCase(mayusucula));// compara todas las mayusculas





    }
}
