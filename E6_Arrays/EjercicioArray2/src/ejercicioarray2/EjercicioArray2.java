package ejercicioarray2;

import java.util.Scanner;
public class EjercicioArray2 {

    /**
     * 2) Escribir un programa que lea un vector de 10 elementos. Deberá
     * imprimir el mismo vector por pantalla pero invertido. Ejemplo: dado el
     * vector 1 2 3 4 5 6 7 8 9 10 el programa debería imprimir 10 9 8 7 6 5 4 3
     * 2 1.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //como debemos pedir 10 números los guardamos en un array
        int[] arrayNumeros = new int[10];
        //Pedimos los 10 números:
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Introduzca el valor " + (i + 1) + ": ");
            arrayNumeros[i] = entrada.nextInt();
        }
        //para recorrer el array en orden inverso nos situamos al final del mismo y nos vamos acercando al comienzo
        for (int i = (arrayNumeros.length-1); i >= 0; i--) {//OJO!! el índice i debe decrementar su valor para acercarse al inicio del array!!!
            System.out.print(arrayNumeros[i] + " ");
        }
    }

}
