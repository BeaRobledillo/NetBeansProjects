package cenicienta;
/*
La entrada comienza con un entero que indica el numero de casos de prueba que vendran a continuacion. 
Cada caso comienza con una lınea con el tiempo que queda hasta el momento de salir de casa para ir al baile expresado como DD:HH:MM:SS (dıas, horas, minutos y segundos).
La lınea siguiente contiene una lista con las duraciones de las entre 0 y 100 tareas que Cenicienta debe realizar. 
Los tiempos vienen expresados en el formato HH:MM:SS. 
La lista ﬁnaliza con una tarea de duracion nula (00:00:00). 
Puede suponerse que los tiempos son correctos: 0 ≤ horas < 24, 0 ≤ minutos < 60 y 0 ≤ segundos < 60.
Ademas 0 ≤ dıas < 100. 
Salida:
Para cada caso de prueba se indicara “SI” si Cenicienta puede realizar todas las tareas estrictamente antes de que termine el tiempo que queda para salir 
y “NO” en caso contrario.

Entrada de ejemplo:
2 
00:05:40:00 
01:30:00 00:45:20 03:20:50 00:00:00 
01:02:00:00 08:05:40 05:00:10 07:55:00 05:10:06 00:00:00

Salida de ejemplo:
SI 
NO

*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cenicienta {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/cenicienta/datos");
        Scanner entrada = new Scanner(archivo);

        int casos = entrada.nextInt();
        int tiempoMaximo = 0;
        int tiempoTareas;
        String linea;
        String delimitador;
        boolean puede;

        for (int i = 0; i < casos; i++) {

            linea = entrada.nextLine();
            entrada.useDelimiter(":");

           
            tiempoTareas = 0;
            while (true) {

                linea = entrada.next();
                entrada.useDelimiter(":");
                puede = (tiempoTareas < tiempoMaximo);
                System.out.println(linea);
                //if () {

                //}
            }
             linea = entrada.nextLine();
            System.out.println(linea);
            // System.out.println((puede) ? "SI" : "NO");
        }

    }

}
