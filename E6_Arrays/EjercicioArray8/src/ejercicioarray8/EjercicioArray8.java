package ejercicioarray8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArray8 {

    /*8) Escribir un programa que lea una matriz de 4 filas y 3 columnas, la visualice por pantalla y a
continuación encuentre el mayor y el menor elemento de la matriz y sus posiciones.  */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejercicioarray8/datos");
        Scanner entrada = new Scanner(archivo);
        Scanner entradaFila = new Scanner(System.in);
        int[] posicionMayor = new int[2];
        int[] posicionMenor = new int[2];

        int[][] arrayNumeros = new int[4][3];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
            }
        }
        int mayor = arrayNumeros[0][0];
        int menor = arrayNumeros[0][0];

        //Buscamos ahora el menor y el mayor actualizando en su caso el valor de las variables que lo recojen:
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                if (arrayNumeros[i][j] > mayor) {
                    mayor = arrayNumeros[i][j];
                    posicionMayor[0] = i + 1;
                    posicionMayor[1] = j + 1;

                }
                if (arrayNumeros[i][j] < menor) {
                    menor = arrayNumeros[i][j];
                    posicionMenor[0] = i + 1;
                    posicionMenor[1] = j + 1;
                }
            }
        }
        System.out.println("La mayor cantidad de toda la matriz es: " + mayor);
        System.out.println("Y se encuentra en la fila: " + posicionMayor[0] + " columna: " + posicionMayor[1]);
        System.out.println("La menor cantidad de toda la matriz es: " + menor);
        System.out.println("Y se encuentra en la fila: " + posicionMenor[0] + " columna: " + posicionMenor[1]);
    }

}
