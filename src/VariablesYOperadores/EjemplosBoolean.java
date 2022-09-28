package VariablesYOperadores;

public class EjemplosBoolean {
    public static void main(String[] args) {

        boolean apto = false;
        System.out.println( "es apto ? "+ apto);
        // operadores logicos
        //Unario  not
        // es como una puert alogica se diena poniendoo !

        System.out.println( !apto); //NOT
        // operadores binarios : se utilizan con 2 variables
        //AND y esto es de electricidad  las dos van por el mismo lado se activa falla una ya no va
        System.out.println( " AND");
        System.out.println( " =======");
          boolean v1 = true;
          boolean v2 = false;
          boolean and = v1 && v2 ;
        System.out.println( and);

        // OR | ES O POR AQUI O POR AQUI
        System.out.println( " OR ");
        boolean or = v1 || v2;
        System.out.println(or);

        //XOR ^
        System.out.println( "XOR");
        boolean xor = v1 ^v2 ;
        System.out.println( xor);

        boolean frío = false ; // no hace frio
        boolean seco = true ; // hace tiempo seco
        boolean verano false ; // no estamos en verano
        boolean trekking = seco && ( !frío || verano ) ; // true , nos vamos de trekking !

    }
}
