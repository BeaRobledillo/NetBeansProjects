package imprimirmayorymenor;

import java.util.Scanner;

public class ImprimirMayorYMenor {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int cifraIntroducida = 0;
        int indice = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduciremos cinco cifras");
        menor = 10;
        mayor = 0;
        for (int i = 1; i < 6; i++) {
            //VALIDACIÓN DE ENTRADA
            do {
                System.out.print("Introduzca la cifra " + (i) + ": ");
                cifraIntroducida = entrada.nextInt();
            } while ((cifraIntroducida < 0) || (cifraIntroducida > 10));

            if (cifraIntroducida > mayor) {
                mayor = cifraIntroducida;

            }
            if (cifraIntroducida < menor) {
                menor = cifraIntroducida;

            }

        }
        //DETECTAR SI SE HA INTRODUCIDO LAS CINCO VECES LA MISMA CIFRA...
        if (mayor == menor) {
            System.out.println("Has introducido cinco veces el mismo número??");
        }
        System.out.println("El mayor de los números introducidos es: " + mayor);
        System.out.println("El menor de los números introducidos es: " + menor);
    }

}
