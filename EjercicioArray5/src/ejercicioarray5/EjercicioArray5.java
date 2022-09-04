package ejercicioarray5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArray5 {

    /*
     *5) Escribir un programa que lea un matriz de enteros de 2 filas y 4 columnas y muestre por
     * pantalla la traspuesta a dicha matriz. 
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejercicioarray5/datos");
        Scanner entrada = new Scanner(archivo);
        Scanner entradaFila = new Scanner(System.in);

        int[][] arrayNumeros = new int[2][4];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
            }
        }
        //1.: mostramos la matriz que tenemos
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j] + " ");
            }
            System.out.println("");
        }
        //2.: Ahora trasponemos la matriz
        int[][] arrayTraspuesto = new int[arrayNumeros[0].length][arrayNumeros.length];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayTraspuesto[j][i] = arrayNumeros[i][j];
            }
        }
        //3.: mostramos la traspuesta
        for (int i = 0; i < arrayTraspuesto.length; i++) {
            for (int j = 0; j < arrayTraspuesto[i].length; j++) {
                System.out.print(arrayTraspuesto[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
