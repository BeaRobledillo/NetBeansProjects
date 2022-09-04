/*
 B. Introducir dos números por teclado. 
Imprimir los números naturales que hay entre ambos números empezando por el más pequeño, contar cuántos hay y
cuántos de ellos son pares. 
Calcular la suma de los impares.
	--Debemos ser capaces de detectar si en la suma de los impares interviene el número 9.--
	ECHAD UN VISTAZO AL EJEMPLO DE ROTACIÓN...
 */
package test_b;

import java.util.Scanner;

public class Test_B {

    public static void main(String[] args) {

        int numero1 = 0;
        int numero2 = 0;
        int contadorNumeros = 0;
        int contadorPares = 0;
        int sumaImpares = 0;
        int indice = 0;
        int rotador = 0;
        boolean esNumeroNueve = false;
        Scanner entrada = new Scanner(System.in);

        //la validación e iteración para introducir dos cifras podría ser la misma que en el ejercicio anterior
        System.out.println("Introduzca la primera cifra: ");
        numero1 = entrada.nextInt();
        System.out.println("La cifra introducida es: " + numero1);
        System.out.println("Introduzca la segunda cifra: ");
        numero2 = entrada.nextInt();
        System.out.println("La cifra introducida es: " + numero2);

        //calculamos el valor absoluto de la diferencia 
        if (Math.abs(numero1 - numero2) >= 2) {

            if (numero1 > numero2) {
                rotador = numero1;
                numero1 = numero2;
                numero2 = rotador;

            }

            for (indice =(numero1+1); indice < numero2; indice++) {
                System.out.println("Tenemos el número natural " + indice);
                contadorNumeros++;
                if (indice % 2 == 0) {
                    contadorPares++;

                } else {
                    sumaImpares += indice;
                    if (indice == 9) {
                        esNumeroNueve = true;
                    }
                }
            }
            System.out.println("La cantidad de números entre " + numero1 + " y " + numero2 + " es de " + contadorNumeros);
            System.out.println("La cantidad de números pares " + contadorPares);
            System.out.println("La suma de números impares " + sumaImpares);
            System.out.println("¿Ha aparecido el número 9?: " + esNumeroNueve);
        }
        else{
            System.out.println("Las cifras introducidas no cumplen los criterios");
        }
    }

}
