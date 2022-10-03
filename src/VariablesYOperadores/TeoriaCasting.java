package VariablesYOperadores;

public class TeoriaCasting {
    public static void main(String[] args) {
int num = 100; // ocupa en momiria 32 bits
        long numGrande = num; // puedo asignar un int a long sin mas
        // y al rebes ?
        long numGrande2= 101;// long ocupa 64 bits
        int entero =(int) numGrande2;// esto es un casting expliucito


// de int a short

short numerocorto= ( short) num ;// no puedo hacerlo directamente por que int 32 bits y no cabe en short

// de char a int
        char letra ='A';
int letraAsci= letra;
        System.out.println(letraAsci);
        //float a double
        float decimal=3.34f;
        double decimalD=decimal;

        //de double a float
        double decimalDo= 32.1234;
        float float1 = (float) decimalDo;

        // de double a int
        int entero32Bits = (int) decimalDo;
        System.out.println( entero32Bits);//resultado rmprevisible
        // de double a short
        short entero16Bist= (short) decimalDo;



    }
}
