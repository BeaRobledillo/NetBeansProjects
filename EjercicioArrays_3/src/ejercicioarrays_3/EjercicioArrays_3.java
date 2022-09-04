package ejercicioarrays_3;

import java.util.Scanner;

/* 3) Escribir un programa que lea 10 números por teclado.
    Luego lea dos más e indique si éstos están entre los anteriores.  
 */
public class EjercicioArrays_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //como debemos pedir 10 números los guardamos en un array
        int[] arrayNumeros = new int[10];
        int numeroBuscado1, numeroBuscado2;
        //Pedimos los 10 números:
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Introduzca el valor " + (i + 1) + ": ");
            arrayNumeros[i] = entrada.nextInt();
        }

        //Ya tenemos el array lleno con 10 números, ahora pediremos dos más y los buscaremos:
        System.out.print("Introduzca dos números para buscarlos en el array: ");
        numeroBuscado1 = entrada.nextInt();
        numeroBuscado2 = entrada.nextInt();
        for (int j = 0; j < arrayNumeros.length; j++) {
            if (numeroBuscado1 == arrayNumeros[j]) {
                System.out.println("El primer número buscado está incluido en el array");
            } else {
                if (numeroBuscado2 == arrayNumeros[j]) {
                    System.out.println("El segundo número buscado está incluido en el array");
                }
            }

        }

    }

}
