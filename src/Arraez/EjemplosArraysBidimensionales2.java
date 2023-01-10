package Arraez;

import java.util.Arrays;

public class EjemplosArraysBidimensionales2 {
    public static void main(String[] args) {
        // declaramos un array de 5xlo que sea

        String [][] tabla = {
                {"",""," Valentin","Rebeca",},
                {"Sara","GEma","Valeria","Tatiana","claudia","Javier"},

                { "Antonio","Chrisitian",},
                {"Jose Antonio","Victor","Daniel","Javier","Jorge","aitor"},
                { "Miguel","Alberto","Franciso","Roberto"}






        } ;
        for (int i = 0; i <tabla.length ; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        System.out.println(tabla[3][1]);





    }
}
