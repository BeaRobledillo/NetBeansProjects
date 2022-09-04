package tablamultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

    public static void main(String[] args) {
        int numero;
        int indice;
        Scanner entrada = new Scanner(System.in);

        //vamos a validar la entrada del número introducido
       /* do {
            System.out.print("Introduce un número: ");
            //leemos el número
            numero = entrada.nextInt();

        } while ((numero < 0) || (numero > 10));

       /* for (indice = 0; indice <= 10; indice++) {
            System.out.println(numero + " x " + indice + " = " + (numero * indice));
        }*/
        
        
        //ejemplos de ambito de variables: dos variables llamadas igual pero cada una en su ambito
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la variable es:  "+ i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la variable es:  "+ (i+20));
        }
    }

}
