package utilizaciondemetodos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UtilizacionDeMetodos {
    /*Vamos a realizar la lectura de los datos de un fichero en el que tenemos números enteros para alimentar una matriz
    Posteriormente deberemos realizar una búsqueda de un determinado número que el usuario introduce por teclado dentro de esa
    matriz y sacar el número de veces que aparece y el mensaje "te pillé!!" cada vez que nos lo encontremos
     */
    public static void rellenaMatrizConDatos(int[][] arrayNumeros, Scanner entrada) {//parámetro formal arrayNumeros
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
            }
        }
    }

    public static int procesaMatriz(int[][] matrizBidimensional, int numero) {
        int result = 0;
        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                if (matrizBidimensional[i][j] == numero) {
                    System.out.println("te pillé!!");
                    result++;
                }
            }
        }
        return result;//Salimos del método devolviendo la variable local al método result que recoge el número de apariciones
    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/utilizaciondemetodos/datos");
        Scanner entrada = new Scanner(archivo);

        int dimension = 0;
        int numeroBuscado = 0;
        int contadorApariciones = 0;
        int[][] matrizEnteros;

        dimension = entrada.nextInt();
        matrizEnteros = new int[dimension][dimension];
        //INTRODUCIMOS LOS DATOS DEL FICHERO DENTRO DE LA MATRIZ INVOCANDO A UN MÉTODO
        rellenaMatrizConDatos(matrizEnteros, entrada);//parámetro real matrizEnteros

        System.out.print("Una vez leída la matriz, introduzca el número que desea buscar: ");
        entrada = new Scanner(System.in);
        numeroBuscado = entrada.nextInt();
        //CONTABILIZAMOS LAS APARICIONES MEDIANTE LA INVOCACIÓN A UN MÉTODO
        contadorApariciones = procesaMatriz(matrizEnteros, numeroBuscado);//llamada
                                        

        System.out.println("El número de veces que el número ha aparecido ha sido: " + contadorApariciones + " veces");
    }

}
