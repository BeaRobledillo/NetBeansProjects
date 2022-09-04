/*
A. Imprimir el mayor y el menor de una serie de cinco números que vamos introduciendo por teclado.
RESTRICCIÓN: Los números deben estar comprendidos entre 0 y 10 INCLUSIVE AMBOS
Si el usuario introduce un número no permitido, se pedirá que vuelva a introducirlo
2 3 4 5 6
 */
package test_a;

import java.util.Scanner;

public class Test_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int mayor = 0, menor = 10, cifraIntroducida=0, indice = 0;
         Scanner entrada = new Scanner(System.in);
        //VALIDACIÓN DE ENTRADA
        for (int i = 0; i <= 5; i++) {
            while ((cifraIntroducida < 0) || (cifraIntroducida > 10));
            {
                System.out.println("Introduzca la cifra:  " + indice);
                cifraIntroducida = entrada.nextInt();
                System.out.println("La cifra introducida es: " + cifraIntroducida);

                if (cifraIntroducida > mayor) {
                    mayor = cifraIntroducida;
                }
                if (cifraIntroducida < menor) {
                    menor = cifraIntroducida;
                }
                indice = indice + 1;

            }
        }
        
        if (mayor==menor) {
            System.out.println("Has introducido cinco veces el mismo número??");
        }else{
            System.out.println("El mayor de los números introducidos ha sido: "+ mayor);
             System.out.println("El menor de los números introducidos ha sido: "+ menor);
        }

    }

}
