package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        //El director de una escuela está organizando un viaje de estudios, y requiere
        //determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía
        //de viajes por el servicio.
        // La forma de cobrar es la siguiente:
        //a. Si son 100 alumnos o más, el costo por cada alumno es de 65 euros;
        //b. de 50 a 99 alumnos, el costo es de 70 euros,
        /* c. de 30 a 49, de 95 euros,
         d. y si son menos de 30, el costo de la renta del autobús es de 4000 euros, sin
        importar el número de alumnos.


                Escribe un programa que, introduciendo el número de alumnos que van de viaje,
        permita determinar el pago a la compañía de autobuses y lo que debe pagar
       cada alumno.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("dime el numero de alumnos");
        int alumnos= sc.nextInt();
        double calculo=0;
        double costoAlumno = 0;
        if (alumnos>=100){
            costoAlumno= 65;
            System.out.println("cada alumno paga " + costoAlumno);
            calculo=alumnos*costoAlumno;
            System.out.println("el total a pagar es " + calculo);
        } else if (alumnos>=50 && alumnos<=99 ) {
            costoAlumno=70;
            System.out.println("cada alumno paga " + costoAlumno);
            calculo=alumnos*costoAlumno;
            System.out.println("el total a pagar es " + calculo);
        } else if (alumnos>= 30 && alumnos<= 49) {
            costoAlumno=95;
            System.out.println("cada alumno paga " + costoAlumno);
            calculo=alumnos*costoAlumno;
            System.out.println("el total a pagar es " + calculo);
        } else  {
            costoAlumno =4000;
            calculo = alumnos / costoAlumno;
            System.out.println("El total es " + calculo);
        }


    }





}
