package sanferminesarrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SanFerminesArrays {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/sanferminesarrays/datos");
        Scanner entrada = new Scanner(archivo);
        int[] arrayToros;
        int cantidadToros;
        while (entrada.hasNext()) {

            int mayorVelocidad = 0;
            //1. leo la cantidad de toros
            cantidadToros = entrada.nextInt();
            //2. defino un array con las velocidades de los toros, tantas como canitdad haya leído anteriormente
            arrayToros = new int[cantidadToros];
            //3. leo cada velocidad y la introduzco en cada posición del array
            for (int i = 0; i < arrayToros.length; i++) {
                arrayToros[i] = entrada.nextInt();
            }//A la salida de este bucle tenemos el array con cada velocidad de cada toro

            for (int i = 0; i < arrayToros.length; i++) {
                if (arrayToros[i] > mayorVelocidad) {
                    mayorVelocidad = arrayToros[i];
                }
            }//A la salida de este bucle tenemos almacenada la mayor de las velocidades en la variable mayorVelocidad

            System.out.println("Mayor velocidad hallada con recorrido: " + mayorVelocidad);
            
            /*
            Haciendo uso de los métodos ya implementados para arrays en el JDK de JAVA, 
            podemos resolver el problema de la siguiente forma: 
            Ordenamos los elementos del array de forma creciente o decreciente y después:
                - Sacamos la primera posición del array si ordenamos de forma decreciente
                - Sacamos la última posición del array si ordenamos de forma creciente
            */
            //Ordenamos en orden ascendente el array:
            Arrays.sort(arrayToros);
            //mostramos la última posición
            System.out.println("Mayor velocidad hallada ordenando el array: " + arrayToros[arrayToros.length-1] + "\n");
            
            
        }
    }

}
