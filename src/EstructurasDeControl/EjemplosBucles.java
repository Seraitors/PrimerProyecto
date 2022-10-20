package EstructurasDeControl;

public class EjemplosBucles {
    public static void main(String[] args) {
        //queremos imprimir todos los numeros del 0 al 10
        for (int i =0; i<=10; i++){//desde que i es igual a 0 y mientras i sea <=10 invrementamos la i en 1
            //dentro del bloque escrbimos lo que se tiene que hacer en cada repeticion
            System.out.println(i);

        }
        //queremosimprimir de 1 a 10 ambos inclusives de 2 en 2
        for (int i =1; i < 11; i=i+2){
            System.out.println(i);
        }


        //queiro imprimir de 10 a 0 decrementando de uno en uno
       for (int i = 10 ; i>=0 ; i--){
           System.out.println(i);
       }

    }
}
