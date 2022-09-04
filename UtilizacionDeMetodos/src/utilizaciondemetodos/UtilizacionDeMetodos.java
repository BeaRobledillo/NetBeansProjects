package utilizaciondemetodos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UtilizacionDeMetodos {

    /*Vamos a realizar la lectura de los datos de un fichero en el que tenemos números enteros para alimentar una matriz
 Posteriormente deberemos realizar una búsqueda de un determinado número que el usuario introduce por teclado dentro de esa
 matriz y sacar el número de veces que aparece y el mensaje "te pillé!!" cada vez que nos lo encontremos
     */
    public static void rellenaMatrizConDatos(int[][] arrayNumeros, Scanner entrada) { //parametro formal arrayNumeros

        //lectura de datos
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
            }
        }
    }

    public static int procesaMatriz(int[][] matrizEnteros, int numeroBuscado) {
        int result = 0;
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                //matrizEnteros[i][j] = entrada.nextInt();
                if (matrizEnteros[i][j] == numeroBuscado) {
                    System.out.println("te pille!!");
                    result++;
                }
            }
        }
        return result; //salimos del metodo devolviendo la variable local result
    }

    public static void main(String[] args) throws FileNotFoundException {
        //variables
        File archivo = new File("src/utilizaciondemetodos/datos");
        Scanner entrada = new Scanner(archivo);

        int dimension = 0;
        int numeroBuscado = 0;
        int contadorApariciones = 0;
        int[][] matrizEnteros;

        dimension = entrada.nextInt();
        matrizEnteros = new int[dimension][dimension];

        //introducimos los datos del fichero dentro de la matriz
        rellenaMatrizConDatos(matrizEnteros, entrada);//parametro real(actual)matrizEnteros
        System.out.println("Una vez leida la matriz, introduzca el número a buscar: ");
        entrada = new Scanner(System.in);
        numeroBuscado = entrada.nextInt();

        //invocacion del metodo
        contadorApariciones = procesaMatriz(matrizEnteros, numeroBuscado);

        System.out.println("El número de veces que el número ha aparecido ha sido: " + contadorApariciones + " veces");

    }

}
