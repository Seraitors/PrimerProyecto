package EstructurasDeControl;

public class Ejercicio30 {
    public static void main(String[] args) {
        //hacer un programa que hag ala suma y el producto de los 30 primer
        //quiero hacer : 0+1+2+3+4+5+6+7+8+9..........29
        // y tambien quiero hacer : 1*2 *3*4*5----30 si pones 0 todo es 0
        int suma=0;
        int producto=1;
        for ( int i = 0 ; i<30; i++){
            suma = suma +i;
        }
        System.out.println( suma);
    for( int i =1; i<31; i++){
        producto= producto *i;
    }
        System.out.println(producto);
        System.out.println(suma );
    }
}
