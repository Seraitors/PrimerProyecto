package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una vocal");
        char  c=0;
        do {
            System.out.println("introduce un caracpter");
            c=sc.nextLine().charAt(0);
            if (c== 'a'|| c =='e' ||c=='i'||c=='o'||c=='u' ||c== 'A'|| c =='E' ||c=='I'||c=='O'||c=='U'){
                System.out.println("vocal");
            } else if (c==8) {
                break;
            } else {
                System.out.println("no vocal");
            }
        }while (c !=' ');






    }
}
