/*si un aeropuerto tiene varias pistas en la misma orientacion, a cada una se le anade
una letra indicando su posicion relativa cuando nos aproximamos a ella. 
Ası, se puede anadir una L para indicar que es la pista mas a la izquierda, 
una C para la pista central o la R para la pista mas a la derecha
(en nuestro caso, ignoraremos la posibilidad de que haya mas de 3 pistas con la misma
orientacion). Como es logico, la pista que esta a la izquierda aproxim´andonos por un lado se convierte
en la pista mas a la derecha viniendo desde el lado contrario. 
Es por esto que 18L se convierte en 36R, por ejemplo.
Dada la codificacion de una pista en uno de sus extremos, ¿cual es en el otro?*/
package pistadeaterrizaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PistaDeAterrizaje {

    public static void main(String[] args) throws FileNotFoundException {

        //variables para leer archivo
        File archivo = new File("src/pistadeaterrizaje/datos");
        Scanner entrada = new Scanner(archivo);

        //variables 
        String pista;
        int numero;
        Character letra; //no confundir con un tipo char

        //reccorrer los datos
        while (entrada.hasNext()) {

            pista = entrada.next();

            numero = Integer.parseInt(pista.substring(0, 2));
            letra = (pista.length() == 3) ? pista.charAt(2) : null;

            numero = (18 + numero) % 36;
            if (numero == 0) {
                numero = 36;
            }
            //mostrar formateado 
            System.out.printf("%02d", numero);

            //mostrar pistas
            if (letra != null) {
                switch (letra) {
                    case 'R':
                        System.out.print('L');
                        break;
                    case 'L':
                        System.out.print('R');
                        break;
                    case 'C':
                        System.out.print('C');
                        break;
                    default:
                         System.out.print(" NO hay pista para tí");
                }

            }

            //bajar linea
            System.out.println();
        }

    }

}
