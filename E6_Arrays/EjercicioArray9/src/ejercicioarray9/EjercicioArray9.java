package ejercicioarray9;

import java.util.Scanner;

public class EjercicioArray9 {

    /*9) Escribir un programa que lea una frase y determine la frecuencia de aparición de cada vocal
        con respecto al total de caracteres de la frase.  
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String frase = new String();
        String[] arrayFrase;
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        System.out.println("Introduzca una frase:");
        arrayFrase = entrada.nextLine().split("");
        //Recorremos el array buscando cada una de las vocales
        for (int i = 0; i < arrayFrase.length; i++) {
            if (arrayFrase[i].equals("a") || arrayFrase[i].equals("A")) {
                contadorA++;
            }
            if (arrayFrase[i].equals("e") || arrayFrase[i].equals("E")) {
                contadorE++;
            }
            if (arrayFrase[i].equals("i") || arrayFrase[i].equals("I")) {
                contadorI++;
            }
            if (arrayFrase[i].equals("o") || arrayFrase[i].equals("O")) {
                contadorO++;
            }
            if (arrayFrase[i].equals("u") || arrayFrase[i].equals("U")) {
                contadorU++;
            }
        }
        System.out.print("La frecuencia de aparacíón de la vocal a con respecto al total de caracteres de la frase es:");
        System.out.println((float)contadorA/arrayFrase.length);

        System.out.print("La frecuencia de aparacíón de la vocal e con respecto al total de caracteres de la frase es:");
        System.out.println((float)contadorE/arrayFrase.length);

        System.out.print("La frecuencia de aparacíón de la vocal i con respecto al total de caracteres de la frase es:");
        System.out.println((float)contadorI/arrayFrase.length);

        System.out.print("La frecuencia de aparacíón de la vocal o con respecto al total de caracteres de la frase es:");
        System.out.println((float)contadorO/arrayFrase.length);

        System.out.print("La frecuencia de aparacíón de la vocal u con respecto al total de caracteres de la frase es:");
        System.out.println((float)contadorU/arrayFrase.length);
        
    }

}
