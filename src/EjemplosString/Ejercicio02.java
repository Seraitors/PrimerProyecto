package EjemplosString;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase= sc.nextLine();
        String sudFrase= sc.nextLine();
        boolean resultado=frase.startsWith(sudFrase);
        System.out.println(resultado);
        //ese comando sirve para saber si en la 1 primera variable cuando escribbimos te sale la palbra y en la 2 le dices si empieza pior es palabra te dice si es verdad o no

    }
}
