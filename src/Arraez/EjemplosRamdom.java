package Arraez;

public class EjemplosRamdom {
    public static void main(String[] args) {

        for (int i = 0; i <20 ; i++) {
            int num= (int )(Math.random() * 10 +1);
            System.out.printf("%.2f\t" ,num );
        }
    }
}
