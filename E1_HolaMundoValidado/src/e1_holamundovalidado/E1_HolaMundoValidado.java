package e1_holamundovalidado;

import java.util.Scanner;

public class E1_HolaMundoValidado {

    /*
    Realizar un algoritmo que a partir de una cifra introducida (comprendida entre 0 y 5) por teclado muestre en pantalla
    la frase "Hola Mundo" tantas veces como establezca la cifra
     */
    public static void main(String[] args) {
        int cifra = 0;
        Scanner entrada = new Scanner(System.in);
        //1. Introducimos y validamos una cifra entre 0 y 5
        System.out.print("Introduzca una cifra entre 0 y 5: ");
        cifra = entrada.nextInt();
        
        while ((cifra < 0) || (cifra > 5)) {
            System.out.print("Te he dicho que es entre 0 y 5...: ");
            cifra = entrada.nextInt();
        }
        
        //2. Mostramos la frase "Hola Mundo" tantas veces como establece la cifra con un bucle for
        for (int i = 0; i < cifra; i++) {
            System.out.println("Hola Mundo con for.");
        }

        //2. Mostramos la frase "Hola Mundo" tantas veces como establece la cifra con un bucle while
        int i = 0;
        while (i < cifra) {
            System.out.println("Hola Mundo con while.");
            i++;
        }

        //2. Mostramos la frase "Hola Mundo" tantas veces como establece la cifra con un bucle do-while
        int indice = 0;
        do {
            System.out.println("Hola Mundo con do-while.");
            indice++;
        } while (indice < cifra);

    }
}