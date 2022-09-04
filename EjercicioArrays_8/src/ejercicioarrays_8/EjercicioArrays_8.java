/*
  Escribir un programa que lea una matriz de 4 filas y 3 columnas, 
la visualice por pantalla y a continuación 
encuentre el mayor y el menor elemento de la matriz y sus posiciones. 
 */
package ejercicioarrays_8;

import java.util.Scanner;

public class EjercicioArrays_8 {

    public static void main(String[] args) {
        int filas = 5;
        int columnas = 4;
        Scanner entrada = new Scanner(System.in);
        int mayor;
        int menor;
        int filaMayor;
        int filaMenor;
        int columnaMayor;
        int columnaMenor;

        //Se crea una matriz de 4 filas y 3 columnas
        int[][] array = new int[filas][columnas];

        //por teclado los valores de la matriz
        System.out.println("Lectura de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Array [" + i + "][" + j + "]= ");
                array[i][j] = entrada.nextInt();
            }
        }

        //Mostrar la matriz
        System.out.println("Introducidos:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Calcular el mayor valor de la matriz y el menor.
        //Obtener las posiciones que ocupan el mayor y el menor dentro de la matriz 
        mayor = menor = array[0][0]; //se toma el primer elemento de la matriz como mayor y menor
        filaMayor = filaMenor = columnaMayor = columnaMenor = 0;

        //recorremos la matriz
        //buscamos el mayor, el menor y sus posiciones
        for (int i = 0; i < array.length; i++) {  //para cada fila de la matriz
            for (int j = 0; j < array[i].length; j++) { //para cada columna de la matriz
                if (array[i][j] > mayor) {
                    mayor = array[i][j];
                    filaMayor = i;
                    columnaMayor = j;
                } else if (array[i][j] < menor) {
                    menor = array[i][j];
                    filaMenor = i;
                    columnaMenor = j;
                }
            }
        }

        //Mostrar mayor elemento de la matriz,el menor y sus posiciones   
        System.out.print("Elemento mayor: " + mayor);
        System.out.println(" Fila: " + filaMayor + " Columna: " + columnaMayor);
        System.out.print("Elemento menor: " + menor);
        System.out.println(" Fila: " + filaMenor + " Columna: " + columnaMenor);
    }

}
