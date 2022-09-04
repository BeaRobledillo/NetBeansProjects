/*
Escribir un programa que lea una matriz de enteros de 4 filas y 4 columnas
y a continuación intercambie la fila i con la fila j, 
siendo i y j dos valores introducidos por teclado
 */
package ejercicioarrays_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioArrays_7 {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/ejercicioarrays_7/datos");
        Scanner entrada = new Scanner(archivo);

        int primeraFilaCambiar = 0;
        int segundaFilaCambiar = 0;
        int[] matrizAuxiliar = new int[4];

        int[][] arrayNumeros = new int[4][4];

        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                arrayNumeros[i][j] = entrada.nextInt();
            }
        }
        //Enseñamos el contenido de la matriz mediante un for:
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j] + " ");
            }
            System.out.println("");
        }
        entrada = new Scanner(System.in);
        //Una vez la matriz contiene todos los números vamos a elegir qué filas intercambiamos
        System.out.println("Introduzca la primera fila a intercambiar: ");
        primeraFilaCambiar = entrada.nextInt() - 1;
        System.out.println("Introduzca la segunda fila a cambiar: ");
        segundaFilaCambiar = entrada.nextInt() - 1;

        //A continuación realizamos el intercambio, utilizando una matriz auxiliar:
        matrizAuxiliar = arrayNumeros[primeraFilaCambiar].clone();
        arrayNumeros[primeraFilaCambiar] = arrayNumeros[segundaFilaCambiar].clone();
        arrayNumeros[segundaFilaCambiar] = matrizAuxiliar.clone();

        //Enseñamos el contenido de la matriz mediante un foreach:
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros[i].length; j++) {
                System.out.print(arrayNumeros[i][j] + " ");

            }
            System.out.println("");
        }

        /* lo ke empeze a hacer:
        File archivo = new File("src/ejercicioarrays7/datos");
        Scanner entrada = new Scanner(archivo);

        int[][] matriz = new int[4][4];
        int columnas=0;
        int filas = 0;
        int[][] matrizAuxiliar = new int[4][4];

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                matriz[i][j];

            }
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                matrizAuxiliar[i][j];
            }
        }*/
    }

}
