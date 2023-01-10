package Arraez;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EjemploArraylis {
    public static void main(String[] args) {
        ArrayList<String>  palabras = new ArrayList<>();

        palabras.add("Valentin");
        palabras.add("pepe");
        palabras.add("Manolo");

        //podemso añadir un elemto en uns posicion determinada
        palabras.add(1,"Pepe");
        System.out.println(palabras);

        System.out.println(palabras.get(palabras.size()-1));
        // quiero remplazar  a javi a otro nombre

        palabras.set(2,"Javier Arreaza ");
        System.out.println(palabras);
        System.out.println(palabras.size());
        //quiero quitar un elemnto
        palabras.remove("Valentin");
        System.out.println(palabras.size());
        System.out.println(palabras);

//recorremso el arraylist
        for (int i = 0; i <palabras.size() ; i++) {
            palabras.set(i , palabras.get(i) + "s");

        }
        System.out.println(palabras);

    }
}
