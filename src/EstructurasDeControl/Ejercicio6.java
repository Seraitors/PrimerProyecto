package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tazas= sc.nextInt();
        boolean finde= sc.hasNextBoolean();
        //empezemos declaron una bariable existo
        boolean exito;
        if ( tazas >= 10 && tazas <= 20 && finde==false){
            exito =true;
        } else if (finde == true && tazas >= 15 && tazas <=25){
            exito=true;

            } else {
                exito=false;
            }

        //ponemos resultado
        System.out.println(exito);
        }

    }

