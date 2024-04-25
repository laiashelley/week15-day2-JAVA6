// 1- Rellenar ArrayList y mostrar resultado:

// Crear un arraylist mediante un bucle con los números del 20 al 50. Mostrar después todo el contenido del arraylist final.

import java.util.ArrayList;

public class Java6ejercicio1 {
    public static void main(String[] args) throws Exception {
        
    ArrayList <Integer> numeros = new ArrayList <Integer> ();

    for (int i = 20; i <= 50 ; i++){
        numeros.add(i);
    }

    System.out.println(numeros);


    }
}
