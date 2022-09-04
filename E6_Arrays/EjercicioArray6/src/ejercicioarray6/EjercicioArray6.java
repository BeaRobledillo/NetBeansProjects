package ejercicioarray6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArray6 {

    /* 6) Escribir un programa que lea una matriz de números enteros y que devuelva la suma de los 
elementos positivos de la matriz y la suma de los elementos negativos. */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejercicioarray6/datos");
        Scanner entrada = new Scanner(archivo);
        int acumuladorPositivos = 0;
        int acumuladorNegativos = 0;

        //Las dimensiones de la matriz que leeremos son 3x5, no lo preguntamos, pero podría 
        //hacerse si se leen los datos desde consola
        int[][] arrayNumeros = new int[3][5];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
                if (arrayNumeros[i][j] >= 0) {
                    acumuladorPositivos += arrayNumeros[i][j];
                } else {
                    acumuladorNegativos += arrayNumeros[i][j];
                }
            }
        }
        System.out.println("El total de las cantidades de los números positivos de la matriz es: " + acumuladorPositivos);
        System.out.println("El total de las cantidades de los números negativos de la matriz es: " + acumuladorNegativos);
    }

}
