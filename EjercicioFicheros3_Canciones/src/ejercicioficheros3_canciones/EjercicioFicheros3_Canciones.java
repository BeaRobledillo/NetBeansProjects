package ejercicioficheros3_canciones;

/*
Dado un archivo de texto, escribiremos un archivo salida.txt, donde en cada línea del archivo 
diga la cantidad de palabras y la palabra palabras.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioFicheros3_Canciones {

    public static int cuentaPalabras(String salida) {
        int conteoPalabras = 0;
        boolean palabra = false;
        int finDeLinea = salida.length() - 1;

        for (int i = 0; i < salida.length(); i++) {
            // Si el char is una letra, word = true.
            if (Character.isLetter(salida.charAt(i)) && i != finDeLinea) {
                palabra = true;
                // Si el char no es una letra y aún hay más letras,
                // el contador continua.
            } else if (!Character.isLetter(salida.charAt(i)) && palabra) {
                conteoPalabras++;
                palabra = false;
                // última palabra de la cadena; si no termina con una no letra ,
            } else if (Character.isLetter(salida.charAt(i)) && i == finDeLinea) {
                conteoPalabras++;
            }
        }
        return conteoPalabras; //devuelve el numero de palabras
    }

    /* public void escribeArchivo(File archivo) throws FileNotFoundException {
        PrintWriter salida = new PrintWriter(archivo);
    }*/
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/ejercicioficheros3_canciones/datos");
        Scanner entrada = new Scanner(file);
        File salida = new File("src/ejercicioficheros3_canciones/salidacancion.txt");
        PrintWriter imprimir = new PrintWriter(salida);
        try {
            // Leemos el contenido del fichero
            entrada = new Scanner(file);

            // Leemos linea a linea el fichero
            while (entrada.hasNextLine()) {
                String linea = entrada.nextLine(); // Guardamos la linea en un String
                System.out.println(linea + " " + cuentaPalabras(linea) + " Palabras");  // Mostramos la linea y el total de palabras de cada linea

                imprimir.println((linea) + " " + cuentaPalabras(linea) + " Palabras");

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        imprimir.close();
    }

}
