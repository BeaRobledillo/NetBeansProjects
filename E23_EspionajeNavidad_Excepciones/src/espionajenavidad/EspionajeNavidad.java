package espionajenavidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EspionajeNavidad {

    public static void encriptar(String linea) {
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] lineaChar = linea.toCharArray();
        for (int i = 0; i < lineaChar.length; i++) {

            if (lineaChar[i] == ' ') {
                System.out.print(lineaChar[i]);
                continue;
            }
            for (int j = 0; j < alfabeto.length; j++) {
                try {
                    /*DETECCIÓN DE UN NÚMERO EN EL FICHERO*/
                    int posibleNumero;
                    posibleNumero = Integer.parseInt(String.valueOf(lineaChar[i]));//Tratamos de pasar a entero el carácter que me encuentro...
                    if (posibleNumero == (int) posibleNumero) {
                        System.out.println("\nTenemos un número...");//Esta sentencia la dejamos para que se vea que detectamos la presencia de números
                        break;//Con esta sentencia pasamos al siguiente carácter a traducir de las frase, palabra o lo que sea...
                    }

                } catch (NumberFormatException e) {
                    //AQUI NO HACEMOS NADA
                }
                /*DETECCIÓN DE UN NÚMERO EN EL FICHERO*/
                if (lineaChar[i] == alfabeto[j]) {
                    if (lineaChar[i] == 'Z') {
                        System.out.print("A");
                    } else {
                        System.out.print(alfabeto[j + 1]);
                    }
                }

            }
        }

        System.out.println("");
    }

    public static void leerFichero(Scanner entrada, String linea) {
        linea = entrada.nextLine();
        do {

            encriptar(linea);
            /*DETECCIÓN Y TRATAMIENTO DEL CASO EN EL QUE TENEMOS UNA ÚLTIMA LÍNEA DEL FICHERO PERO SIN CONTENIDO*/

            try {
                linea = entrada.nextLine();
            } catch (NoSuchElementException e) {
                //Si imponemos como restricción el que la última línea del fichero sea la que puede estar sin contenido, 
                //podemos en el bloque catch forzar la parada de la aplicación.
                System.out.println("Tenemos una línea en el fichero sin contenido??");
                return;//Salimos del método aquí para evitar un bucle infinito
            }
            /*DETECCIÓN Y TRATAMIENTO DEL CASO EN EL QUE TENEMOS UNA ÚLTIMA LÍNEA DEL FICHERO PERO SIN CONTENIDO*/
        } while (!(linea.equals("FIN")));

    }

    public static void main(String[] args) {

        File archivo = new File("src/espionajenavidad/dats");
        /*TRATAMIENTO DE EXCEPCIÓN POR NO ENCONTRAR EL FICHERO*/

        Scanner entrada = null;
        String linea = "";
        try {
            entrada = new Scanner(archivo);

            leerFichero(entrada, linea);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo especificado");
        }

        /*TRATAMIENTO DE EXCEPCIÓN POR NO ENCONTRAR EL FICHERO*/
    }

}
