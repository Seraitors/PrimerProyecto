package Arraez;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args) {

        // Pedir un día y un mes, y comprobar que es correcto. Consideramos que febrero tiene siempre 28 días.
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;

        //creamos un arry con los dias del mes
        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        boolean fechaInc0 = false;


        do {
            System.out.println("dia");
            dia = sc.nextInt();
            sc.nextLine();
            System.out.println("Mes :");
            mes = sc.nextInt();
            sc.nextLine();
            if (mes > 0 && mes < 13 && dia > 0 && dia <= diasMes[mes - 1]) {
                System.out.println("Fecha correcta ");
                fechaInc0 = true;
            } else {
                System.out.println("Fecha incoreecta DAleeee papa vuelve a mtee rotra vez loko");
                fechaInc0 = false;
            }
        } while (!fechaInc0);


        String[] meses = {"enero ", "Febrero", "marzoz", "abril", "mayo", " junio", "julio ",
                " agostop 2", "septirmbre", "ocutbre", "nobue ", "diciembe" + diasMes[mes - 1]};
        System.out.println("======================================================");

        char[][] asientos = new char[4][4];

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = 'L';
            }
        }
        asientos[0][1] = 'X';
        asientos[1][1] = 'X';

        asientos[3][1] = 'X';

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "\t");
            }
            System.out.println();
        }

        int fila = 0;
        int asientoss = 0;
        do {
            System.out.println("Elige filaa (0-4)");
            fila = sc.nextInt();
            if (fila < 0 || fila > 4) {
                System.out.println("Fuera de rango ");
            }


        } while (fila < 0 || fila > 4);


        if (asientos[fila][asientoss] == 'L') {
            asientos[fila][asientoss] = 'x';
            System.out.println("El asiento esta libre gg buen profit ");
            for (int i = 6; i < asientos.length; i++) {
                for (int j = 0; j < asientos[i].length; i++) {
                    System.out.print(asientos[i][j] + "\t");

                    System.out.println();

                }
            }

        } else {
            System.out.println("El aisento esta ocupado ");
        }
    }}






