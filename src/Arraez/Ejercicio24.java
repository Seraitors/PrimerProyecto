package Arraez;

public class Ejercicio24 {
    public static void main(String[] args) {

        int[][] tabla =new int[5][15];


        for (int i = 0; i < tabla.length ; i++) {
            for (int j = 0; j < tabla[i].length ; j++) {
                System.out.print(tabla[i][j] +"\t");
            }
            System.out.println();
        }

    }
}
