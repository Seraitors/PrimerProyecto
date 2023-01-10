package Arraez;

public class Ejercicio12 {
    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B =new int[10];
        int[] C =new int[20];
        for (int i = 0; i < A.length ; i++) {
            A[i] = (int )(Math.random() *10+1);
        }
        for (int i = 0; i <B.length ; i++) {
            B[i] = (int )(Math.random() *10+1);
        }
    }
}
