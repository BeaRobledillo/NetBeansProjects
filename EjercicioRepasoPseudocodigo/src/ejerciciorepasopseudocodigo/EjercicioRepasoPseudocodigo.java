package ejerciciorepasopseudocodigo;

import java.util.Scanner;

/*
Pediremos una cifra seis veces:
    - 1.Contaremos cuántos números son pares e impares
    - 2.Deberemos detectar si alguno es superior a 10 (además mostraremos la cifra que lo cumple)
    - 3.Mostraremos la suma de todas las cifras introducidas
 */
public class EjercicioRepasoPseudocodigo {

    public static void main(String[] args) {
        //declaracion e inicializacion de variables
        int cifra = 0, contadorPares = 0, contadorImpares = 0, sumador = 0, indice = 0;
        boolean esSuperiorDiez = false;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.print("Introduzca una cifra: ");
            cifra = entrada.nextInt();

            //1.COMPROBACIÓN DE SI ES PAR O IMPAR
            if (cifra % 2 == 0) {
                //  contadorPares = contadorPares + 1;
                //  contadorPares += 1; Estos 3 contadores equivalen a lo mismo
                contadorPares++;
            } else {
                contadorImpares++;
            }
            //2.COMPROBACIÓN DE SI ES SUPERIOR A 10
            if (cifra > 10) {
                esSuperiorDiez = true;
                System.out.println("Número introducido superior a 10:  " + cifra);

            }
            //3.ACUMULACIÓN DE VALORES 
            sumador += cifra; //sumador=sumador+cifra
        }
        if (esSuperiorDiez) {
            System.err.println("Se han introducido cifras superiores a 10.");
        }

        System.out.println("La suma total de los valores introducidos es: " + sumador);

    }

}
