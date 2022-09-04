package imprimenaturalesintervalo;

import java.util.Scanner;

public class ImprimeNaturalesIntervalo {

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

        System.out.print("Introduzca una cifra: ");
        numero1 = entrada.nextInt();

        System.out.print("Introduzca la segunda: ");
        numero2 = entrada.nextInt();
//calculamos el valor absoluto de la diferencia 
        if (Math.abs(numero1 - numero2) >= 2) {
            //vamos a plantear un bucle desde incremental desde el menor de los introducidos hasta el mayor
            //para ello debemos saber cuál es el menor de los dos y cuál el mayor
            if (numero1 > numero2) {
                rotador = numero1;
                numero1 = numero2;
                numero2 = rotador;

            }
            for (indice = (numero1 + 1); indice < numero2; indice++) {
                System.out.println("Tenemos el número natural " + indice);
                contadorNumeros++;
                if (indice % 2 == 0) {
                    contadorPares++;
                } else {//esto implica que la cifra es impar!!!
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

        } else {
            System.out.println("Las cifras introducidas no cumplen los criterios...");
        }

    }
}
