package metodos;

import java.util.Scanner;

public class CosasDeLoros {
    public  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // crea cuatro metodso
        double peso =pesoLoro();
        int edad=edadLoro();
        double calculo=semillas(peso,edad);
        imprimeRacion(calculo);

        //pide el peso del loro(no recibe nada )

        // pide la edad del loro y l adevuelve (no recib enada )

        //calcula la cantidad de semillas queu hay que darles comn esta formula :
        // peso del loro / de 5 + la edad del loro( recibe tanto el peso cpomo la edad)
        // y la devulev
      //imprime cuantas semillas tenemos que darle diariamente al loro
        //( recibe cantidad de semilla e intrude el resultado con algun twxto)


    }
    public  static double pesoLoro( ){
        System.out.println("Dime el peso");
        double peso= sc.nextInt();
        return peso;
    }
public static int edadLoro(){
    System.out.println("Dime la edad");
    int edad= sc.nextInt();
    return edad;
}


public static double semillas(double peso , int edad){
    double calculo= (peso/5)+edad;
    return calculo;
}
public static void imprimeRacion(double racion1){
    System.out.println(racion1);
}

}
