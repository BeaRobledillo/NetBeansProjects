/*
San Fermines

 */
package e2_sanfermin;

import java.util.Scanner;

public class E2_SanFermin {

    public static void main(String[] args) {

        /*Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int mayor;
        int total;

        System.out.print("Introduzca una cifra: ");
        while (entrada.hasNext()) {

            mayor = 0;
            total = entrada.nextInt();

            if (total >= 1) {

                for (int i = 0; i < total; i++) {

                    numero = entrada.nextInt();

                    if (numero > mayor) {
                        mayor = numero;
                    }

                }

                System.out.println(mayor);

            }

        }*/
        Scanner sc = new Scanner(System.in);
        int toros;
        int velocidad;
        int velocidadCorredor = 0;

        System.out.println("Inserte el número de toros participantes y la velocidad de cada uno de los mismos, separados por un espacio: ");
        toros = sc.nextInt();

        for (int i = 0; i < toros; i++) {
            velocidad = sc.nextInt();
            if (velocidad > velocidadCorredor) {
                velocidadCorredor = velocidad;

            }
        }
        System.out.println(" La velocidad de los corredores debe ser: " + velocidadCorredor);

    }

}
