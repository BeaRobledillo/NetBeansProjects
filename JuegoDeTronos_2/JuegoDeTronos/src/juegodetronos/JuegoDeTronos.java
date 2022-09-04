package juegodetronos;

import java.util.ArrayList;

public class JuegoDeTronos {

    public static void main(String[] args) {

        ArrayList<Actuar> listaHumanos = new ArrayList<>();
        listaHumanos.add(new Khal("Su pana", 3, 200, "no tiene", "Drogo", "Khal"));

        //(String jinete, int anioColeta, int numCaballos, String familia, String nombre, String titulos)
        listaHumanos.add(new GusanoGris(2, "Antonio", 2, 8, "no tiene", "GusanoGris", "Guardia de la reina"));
        //(int miraditas, String nombreReal, int edadSepPadre, int numArmas, String familia, String nombre, String titulos)

        listaHumanos.add(new Dragon("Viserion"));

        recorreListaPersonajes(listaHumanos);

    }

    public static void recorreListaPersonajes(ArrayList<Actuar> listaHumanos) {
        for (Actuar objetoLista : listaHumanos) {
            /*Al tener la capacidad de agrupar elementos de diferente tipo bajo la implementación de una interfaz
            la estructura que almacena a todos ellos debe ser de tipo interfaz. Todos los elementos implementan el método declarado en la interfaz
            de forma obligada, por ello no necesitamos preguntar por el tipo actual de la referencia.
            Sólamente debemos preocuparnos por el tipo actual de la referencia si una de las clases implementa un método propio no "heredado" (implementado)
            como es el caso del método volar() de dragón que no está presente en la clase ancestra (Actuar) y por tanto nos obliga a comprobar mediante instanceof el tipo
            actual y ejecutar el método mediante downcasting
             */
            System.out.println(objetoLista.actuar());

            if (objetoLista instanceof Dragon) {
                System.out.println(((Dragon) objetoLista).volar());
            }

        }

    }

}
