
// 2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.

// Para acabar, escribir 'salir'. Al final, mostrar todos los elementos introducidos por el usuario.

import java.util.ArrayList;
import java.util.Scanner;

public class Java6ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
    
        ArrayList <String> santJordi = new ArrayList <String>();

        String nombresStJordi;

        do {
            System.out.println("Que caracteriza el dia de Sant Jordi?");

            nombresStJordi = sc.nextLine();

            santJordi.add(nombresStJordi);

        } while (!nombresStJordi.equalsIgnoreCase("salir"));

        sc.close();

        System.out.println("Lo que caracteriza el dia de Sant Jordi es:");
        
        for (String santJordiDia : santJordi){
            System.out.println(santJordiDia);
        }

    }
}
