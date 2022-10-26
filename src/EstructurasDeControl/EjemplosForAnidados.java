package EstructurasDeControl;

public class EjemplosForAnidados {
    public static void main(String[] args) {
        //un for anidado se ejucuta dentro de otro for
        //entonces tendremos un for extrno cuya variable se llama i
        //y metemos dentro un for interno cuya variable uele llamarse J

        //la logica que sigue es : por cada una de las vueltas del bucle externo
        //El bucle interno ejecuta todas sus repeticiones

        for (int i = 0; i < 5; i++) {
            System.out.println("i= " + i);
            for (int j = 0; j <10 ; j++) {
                System.out.println("    j= " + j);
            }
        }

    }
}
