
// 3- CRUD: recepción internacional... y universal!

// Te han encargado organizar la recepción oficial para el primer contacto extraterrestre, en la montaña de Montserrat.

// Solo unos pocos en el mundo pueden asistir. ¿A quién enviarías? De momento la lista sólo puede ser de cinco elegid@s. OK

// Pero dos de ellos, en los puestos 2 y 3, se asustan y se dan de baja, y entra entonces el personaje X (darle nombre) en el puesto 2.

// La persona que está en el último puesto, se pone enferma y te recomienda que pongas en su lugar al personaje Y (darle nombre). Ojo con saber qué índice es el último

// En el último momento, se añade el personaje Z (darle nombre) al puesto vacante (puesto 3).

// Ves mostrando a cada paso cómo va quedando la lista actualizada: los medios están muy interesados en seguir la noticia al minuto

import java.util.ArrayList;

public class Java6ejercicio3 {
    public static void main(String[] args) throws Exception {

        // Creamos lista de invitados principales. 
        
        ArrayList <String> invitadosMontserrat = new ArrayList <String> ();

        // Cinco elegidos:

        invitadosMontserrat.add("Eric");
        invitadosMontserrat.add("Laia");
        invitadosMontserrat.add("Pol");
        invitadosMontserrat.add("Martí");
        invitadosMontserrat.add("Cooper");

        System.out.println(invitadosMontserrat);

        // Posiciones 2 i 3 se asustan i se dan de baja i entra Taichi en posición 2:

        invitadosMontserrat.remove(1);
        invitadosMontserrat.remove(1);

        System.out.println(invitadosMontserrat);

        invitadosMontserrat.add(1,"Taichi");

        System.out.println(invitadosMontserrat);

        // Persona en último puesto se da de baja y recomienda a Gennai para su posición:

        invitadosMontserrat.set(invitadosMontserrat.size() - 1, "Gennai");

        System.out.println(invitadosMontserrat);

        // En último momento, se añade Mars al puesto vacante 3:

        invitadosMontserrat.add(2,"Mars");

        System.out.println(invitadosMontserrat);


    }
}
