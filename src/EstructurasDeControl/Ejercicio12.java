package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Dia");
        int dia = sc.nextInt();
        System.out.printf("DMes");
        int mes = sc.nextInt();
        System.out.printf("Año");
        int año = sc.nextInt();
        // empezamos con el año
        if ( año !=0){
            if (mes>=1 && mes<=12 ){
                //si entra aqui es que el mes es tanbien coreecto
                //ahora hay que comprobar el dia
                if (mes == 1 || mes ==3 || mes==5 || mes ==7 || mes ==8 ||mes==10|| mes ==12){
                    if (dia >= 1 && dia <=31){
                        System.out.println("fecha correcta"+ dia + "/" + mes + "/"+ año);//comprobamos que el dia en el que etamos
                    }

                } else if (mes ==4 || mes ==6||mes ==9||mes==11) {
                    if ( dia >=1&& dia<=30){
                        System.out.printf("dia fecha y esas csas");
                    }
                } else if (mes==2) {
                    if (año % 4==0 && año %100 != 0 || año 400==0){
                        if (dia >=1 && dia<=28)
                    }
                }


            }else {
                System.out.println("Fecha incorrecta");
            }
        }else {// si entra aqui el año ==0
            System.out.println("Fecha incorrecta");
        }

    }
}
