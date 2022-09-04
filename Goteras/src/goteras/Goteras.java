/*
Las gotas caen una vez por segundo desde el techo hasta un improvisado cubo que te ves obligado a vaciar periodicamente hasta que encuentres una solucion.
La entrada estara compuesta de un primer numero indicando cuantos casos de prueba vendran a continuacion. 
Cada caso de prueba sera un numero mayor que cero con el numero de gotas que entran en el cubo.
Para cada caso de prueba, el programa escribira en una lınea el tiempo maximo que puedes estar sin cambiar el cubo en el formato HH:MM:SS,
donde HH indica el numero de horas, MM el numero de minutos y SS el numero de segundos. 
Ningun cubo es tan grande como para poder estar mas de un dıa completo sin cambiarse.
 */
package goteras;

//importaciones de java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//clase goteras
public class Goteras {

    //main
    public static void main(String[] args) throws FileNotFoundException {

        //variables para leer datos
        File archivo = new File("src/goteras/datos");
        Scanner entrada = new Scanner(archivo);
        //variables declaradas e inicializadas
        int casos = 0;
        int gotas = 0;
        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        //leer cada caso
        casos = entrada.nextInt();

        //bucle para recorrer el tiempo en cada caso
        for (int i = 0; i < casos; i++) {

            gotas = entrada.nextInt();

            //dividimos para sacar el total
            horas = gotas / 3600;
            // 1 hora tiene 3600 segundos
            minutos = (gotas / 60) - (horas * 60);
            // 1 hora tiene 60 minutos
            segundos = gotas - (minutos * 60) - (horas * 3600);

            /*horas = entrada.nextInt();
            minutos = entrada.nextInt();
            segundos = entrada.nextInt();*/
            //mostrar resultado
            System.out.println(" ");
            /* como lo hizo txema:
            System.out.printf("%02d",horas);
            System.out.print(":");
            System.out.printf("%02d",minutos);
            System.out.print(":");
            System.out.printf("%02d",segundos);
            System.out.println("");*/

            /*como lo hizo el profe:
            System.out.printf("0%1$d : 0%2$d : 0%3$d \n", horas ,minutos,segundos);
            int horas=1;int minutos=1;int segundos=3;
            System.out.printf("%1$02d : %2$02d : %3$02d \n", horas ,minutos,segundos);
             */
            System.out.printf("0" + horas + ":0" + minutos + ":0" + segundos);
            System.out.println(" ");
        }

    }
}
