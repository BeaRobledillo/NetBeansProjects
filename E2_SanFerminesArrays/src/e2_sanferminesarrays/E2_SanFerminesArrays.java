package e2_sanferminesarrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class E2_SanFerminesArrays {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/e2_sanferminesarrays/datos");
        Scanner entrada = new Scanner(archivo);
        int[] arrayToros;
        int cantidadToros;

        while (entrada.hasNext()) {
            int mayorVelocidad = 0;
            //1.leo la cantidad de toros
            cantidadToros = entrada.nextInt();
            //2.defino un array con las velocidades de los toros,
            //tantas como cantidad haya leido anteriormente
            arrayToros = new int[cantidadToros];
            //3.leo cada velocidad y la introduzco en cada posicion del array
            for (int i = 0; i < arrayToros.length; i++) {
                arrayToros[i] = entrada.nextInt();

            }
            //en este momento tenemos el array con cada velocidad de cada toro
            System.out.println("Punto de control");

            //a la salida de este bucle tenemos el array con cada velocidad de dada toro
            for (int i = 0; i < arrayToros.length; i++) {
                if (arrayToros[i] > mayorVelocidad) {
                    mayorVelocidad = arrayToros[i];
                }//a la salida tenemos almacenada la mayor de las velocidades
                System.out.println("La mayor velocidad con recorrido es: " + mayorVelocidad);

            }

            /*haciendo uso de los metodos ya implementados para arrays en el
            JDK de JAVA, podemos resolver el problema asi:
            ordenamos elementos del array de forma creciente o decreciente y
            -sacamos la 1ª posicion del array si ordenamos de forma decrteciente
             -sacamos la ultima posicion del array si ordenamos de forma creciente
             */
            //ordenamos x orden ascendente el array:
            Arrays.sort(arrayToros);
            //mostramos la ultima posicion
            System.out.println("Mayor velocidad hayada ordenanado el array: " + arrayToros[arrayToros.length - 1] + "\n");

        }

    }

}
