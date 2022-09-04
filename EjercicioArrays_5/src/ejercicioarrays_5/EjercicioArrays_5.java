package ejercicioarrays_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Escribir un programa que lea un matriz de enteros de 2 filas y 4 columnas 
y muestre por pantalla la traspuesta a dicha matriz. Ejemplo: 
Entrada:
2 3 4 5
7 6 5 4
Salida:
2 7
3 6
4 5
5 4
 */
public class EjercicioArrays_5 {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/ejercicioarrays_5/datos");
        Scanner entrada = new Scanner(archivo);
        int matrizEnteros[][] = new int[2][4];

        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
                matrizEnteros[i][j] = entrada.nextInt();
                System.out.println("Matriz Entrada: " + matrizEnteros);
            }
        }

        int[][] arrayTraspuesto = new int[matrizEnteros[0].length][matrizEnteros.length];
        for (int i = 0; i < matrizEnteros.length; i++) {
            for (int j = 0; j < matrizEnteros[i].length; j++) {
               arrayTraspuesto[j][i] = matrizEnteros[i][j];
                System.out.println("Matriz Traspuesta: " + arrayTraspuesto);

            }
        }
        System.out.println("Matriz Entrada: " + matrizEnteros);
        System.out.println("Matriz Traspuesta: " + arrayTraspuesto);
    }

}
