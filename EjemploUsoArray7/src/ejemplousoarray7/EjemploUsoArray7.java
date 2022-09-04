package ejemplousoarray7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploUsoArray7 {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejemplousoarray7/datos");
        Scanner entrada = new Scanner(archivo);
        Scanner entradaFila;//Scanner que recorre cada fila leída
        /*En este ejemplo leeremos una matriz irregular de 3 filas, siendo el número de columnas desconocido para cada fila*/

        int[][] arrayNumeros = new int[4][];
        int longitud = 0;//Nos dirá la cantidad de números existentes en cada línea leída del archivo
        String cadena = "";//Nos servirá para almacenar cada línea del archivo que será cada fila de la matiz
        //Para realizar la lectura de una matriz bidimensional irregular debemos saber la longitud de cada una de las filas

        for (int i = 0; i < arrayNumeros.length; i++) {
            cadena = entrada.nextLine();//leemos cadena del fichero
            longitud = cadena.split(" ").length;//2 3 4-->234-->longitud=3
            entradaFila = new Scanner(cadena);
            arrayNumeros[i] = new int[longitud];
            for (int j = 0; j < longitud; j++) {
                arrayNumeros[i][j] = entradaFila.nextInt();
            }
        }

        //1.: mostramos la matriz que tenemos
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
