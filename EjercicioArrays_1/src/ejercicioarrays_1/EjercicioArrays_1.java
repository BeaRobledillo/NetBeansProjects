package ejercicioarrays_1;

import java.util.Scanner;

/*1) Escribir un programa que pida 10 números enteros por teclado y que imprima por pantalla:  
i. Cuántos de esos números son pares.  
ii. Cuál es el valor del número máximo.  
iii. Cuál es el valor del número mínimo.  
 */
public class EjercicioArrays_1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int minimoValor, maximoValor, cuantosPares = 0;
        //como debemos pedir 10 números los guardamos en un array
        int[] arrayNumeros = new int[10];
        //Pedimos los 10 números:
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print("Introduzca el valor " + (i + 1) + ": ");
            arrayNumeros[i] = entrada.nextInt();
        }
        //Una vez que los números están metidos en el array contamos
        //pares, comprobamos el mínimo y el máximo:
        minimoValor = arrayNumeros[0];//Suponemos el que el valor mínimo está en la primera posición del array
        maximoValor = arrayNumeros[0];//Suponemos el que el valor máximo está en la primera posición del array
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] % 2 == 0) {//-->el contenido de la celda es par!!
                cuantosPares++;
            }
            if (arrayNumeros[i] < minimoValor) {//-->El contenido de la celda es el nuevo mínimo
                minimoValor = arrayNumeros[i];
            }
            if (arrayNumeros[i] > maximoValor) {//-->El contenido de la celda es el nuevo máximo
                maximoValor = arrayNumeros[i];
            }
        }//salimos del for
        System.out.println("El número de pares es: " + cuantosPares);
        System.out.println("El valor mínimo es: " + minimoValor);
        System.out.println("El valor máximo es: " + maximoValor);
    }

}
