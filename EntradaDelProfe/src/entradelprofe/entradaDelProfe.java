package entradelprofe;

import java.util.Scanner;

public class entradaDelProfe {

    public static void main(String[] args) {

        Scanner entrada;//Declaramos una variable de tipo Scanner para poder leer datos del usuario
        entrada = new Scanner(System.in);//Inicializamos la variable entrada y leemos del teclado

        int numero = 0;
        int segundoNumero = 0;

        System.out.print("Intro una cifra, por favor: ");
        /*le decimos al Scanner que lea un entero*/
        numero = entrada.nextInt();
        System.out.println("La cifra introducida es: " + numero);
        //vamos a leer un fragmento(token)pero  no vamos a especificar al Scanner que se trata de un entero
        //por lo que necesitaremos realizar una transfromación de tipos
        System.out.println("Escriba otra cifra: ");
        segundoNumero = Integer.parseInt(entrada.next());
        System.out.println("El segundo número obtenido con transformación de tipos es: " + segundoNumero);
    }

}
