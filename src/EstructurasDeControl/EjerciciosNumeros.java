package EstructurasDeControl;

import java.util.Scanner;

public class EjerciciosNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("n1");
        int n1= sc.nextInt();
        System.out.println("n2");
        int n2= sc.nextInt();
        System.out.println("n3");
        int n3= sc.nextInt();
       // teneos tres nuemros
        //n1 mayor n2 mayor3
        if (n1>n2 && n2>n3){
            System.out.println(n1 + "" +n2+ "" + n3);
        } else if (n1>n3&&n3>n2) {//n1 mayor n3 mayor n2
            System.out.println( n1 + " " + n3 + " "+ n2);
        } else if (n2>n1&& n1>n3) { // n2 n1 n3
            System.out.println(n2 +"" + n1 + " " + n3 );
        }else if (n2>n3 && n3>n1){ // n2 n3 n1
            System.out.println(n2 + "" + n3 + "" + n1);
        } else if (n3>n1&&n1>n2) { //n3 n1 n2
            System.out.println(n3 + "" +n1+ "" + n2);
        } else {//n3 n2 n3
            System.out.println(n3 + "" +n2+ "" + n1);

        }











    }
}
