/*La entrada estara compuesta de multiples casos de prueba, cada uno en una lınea.
Cada uno de los casos de prueba empezara con la descripcion de una “competicion” 
entre nosotros y el vecino. 
Los tres primeros numeros indican los litros de agua de nuestra piscina (1≤ p ≤ 10 elevado a 9), 
el numero de litros de nuestro barreno (1 ≤ b ≤ 10 elevado a 9) 
y por ultimo los litros de agua que la piscina pierde durante el viaje.
A continuacion aparecen tres numeros para indicar la misma informacion pero de nuestro vecino.
La entrada termina cuando alguna de las piscinas no tiene capacidad (aparece a cero).
Para cada caso de prueba aparecera una lınea compuesta por el ganador 
y el numero de viajes que ha realizado. 
Como ganador, se indicara YO si nosotros terminamos antes de llenar la piscina 
(hacemos menos viajes para conseguirlo) 
y VECINO si es el vecino. 
En caso de empate, se indicara EMPATE.
LITROS PISCINA_LITROS BARREÑO_LITROS PERDIDA  (IGUAL PARA VECINO)
 */
package llenandopiscinas;

//importaciones java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LlenandoPiscinas {

    //metodo para sacar los viajes que se van haciendo
    public static int obtenerViajes(int piscinas, int barrenyos, int perdidas) {

        if (perdidas >= barrenyos && barrenyos < piscinas) {
            return Integer.MAX_VALUE; //clase wraper Integer cont la constante del valor máximo
            /*} else if (barrenyos >= piscinas) { //no se debe dar el caso
            //return Integer.SIZE; // return que???
            //perdida;*/
        }

        //varibles para el while
        int viajes = 0;
        int cont = 0;
        int sobra = 0;

        //mientras no este a 0
        while (piscinas > 1) {
            cont = piscinas / barrenyos;
            sobra = cont * perdidas;
            piscinas = (piscinas - (cont * barrenyos)) + sobra;
            viajes += cont;
            if (piscinas != 0 && piscinas <= barrenyos) {
                viajes++; //otro viaje si no está a 0
                break;
            }
        }
        return viajes;

    }//fin del metodo obtenerViajes

    //main (principal)
    public static void main(String[] args) throws FileNotFoundException {

        //variables para leer datos
        File archivo = new File("src/llenandopiscinas/datos");
        Scanner entrada = new Scanner(archivo);
        //variables
        int vecino = 0;
        int yo = 0;

        //variables para mis datos
        int litrosPiscinaYo;
        int litrosBarrenyoYo;
        int litrosPerdidaYo;
        //variables para datos del vecino
        int litrosPiscinaVecino;
        int litrosBarrenyoVecino;
        int litrosPerdidaVecino;

        /*if (archivo.length() != 6) {
                break;
            si hay algún número de más
            }*/
        boolean piscina;
        piscina = true;

        //recorrer datos si hay una piscina
        while (piscina) {

            //datos de los primeros 3 números--> litros de la piscina, litros del barreño y litros de la perdida de la piscina de mi
            litrosPiscinaYo = entrada.nextInt();
            litrosBarrenyoYo = entrada.nextInt();
            litrosPerdidaYo = entrada.nextInt();

            //datos de los 3 siguientes números--> litros de la piscina, litros del barreño y la perdida de la piscina del vecino
            litrosPiscinaVecino = entrada.nextInt();
            litrosBarrenyoVecino = entrada.nextInt();
            litrosPerdidaVecino = entrada.nextInt();

            //si hay algún cero rompe(para) la piscina de cualquiera está a 0
            if (litrosPiscinaYo == 0 || litrosPiscinaVecino == 0) {
                break;
            }

            //llamada al metodo en ambos casos (1º yo y luego vecino)
            yo = obtenerViajes(litrosPiscinaYo, litrosBarrenyoYo, litrosPerdidaYo);
            vecino = obtenerViajes(litrosPiscinaVecino, litrosBarrenyoVecino, litrosPerdidaVecino);

            //mostrar resultados competicion
            //el que mas viajes hace gana 
            if (yo == vecino) {
                // System.out.println("EMPATE con " + yo + " viajes y otros " + vecino + " viajes");
                System.out.println("EMPATE con " + vecino + " viajes ambos");
            } else if (yo < vecino) {
                System.out.println("GANO YO con " + yo + " viajes");
                //System.out.println("y PIERDE el VECINO");
            } else {
                System.out.println("GANA EL VECINO con " + vecino + " viajes");
                //System.out.println("y PIERDO YO");
            }

        }//fin del while

    }//fin del main

}//fin de Llenando Piscinas(clase)
