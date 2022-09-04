package tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        int numero;
        int indice;
        Scanner entrada = new Scanner(System.in);

        //vamos a validar la entrada de número introducido
        do {
            System.out.print("Intro un número: ");
            //leemos el número
            numero = entrada.nextInt();
        } while ((numero < 0) || (numero > 10));

        for (indice = 0; indice <= 10; indice++) {
            System.out.print(numero + " x " + indice);
            System.out.println(" = " + (numero * indice));
        }

    }

}
