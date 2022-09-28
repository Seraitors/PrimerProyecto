package VariablesYOperadores;

public class EjemplosIncrementosDecremento {
    public static void main(String[] args) {
        //de momento no le vamos a ver utilidad
        // pero es super util cuando veamos bucles for , while, do-while
        // se utilan cuando queremos que una variable aumente o disminuya
        int n =10;
        System.out.println("1. "+ n);
        //quiero aunmentar la unuidad
        n = n + 1;
        System.out.println( "2. " + n);
        //esto lo podriamos a ver echo asi
        n++; // incremento el valor de n en 1  - es lo mismo que n=n + 1
        System.out.println( "3. "+ n);
        //otra forma de escribir eso mismo es
        n += 1;// esto tambien vale para el producto (n*=1) etc ..


        // lo mismo para el decremento
        // si quiero que la variable disminuya en 1 unidad puedo hacerlo de dos formas

        System.out.println( "4. " + n);
        //y una opcion mas de escribir lo mismo(pero no es esactamente lo mismo)
        ++n;
        System.out.println("5. "+ n);
        n =n-1;
        n--;
        n-=1;
        --n;
        System.out.println(" decremento tras decremento ...."+ n);
        //diferencia entre prefijo ++ o sufijo
        int a = 4;
        int b = a++; // primero asig ana a b
        System.out.println(b);
        System.out.println(a);
// hasta que no pintas a no se cambia b
        int c = 10;
        System.out.println( "c+" + c++);
        System.out.println( "c" + c);


    }
}
