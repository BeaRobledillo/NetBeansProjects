package ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ficheros {

    /**
     * 1.Crear un programa que lea el archivo “cancion.txt” y cuente cuántas
     * palabras hay en cada línea del archivo luego copie el archivo de entrada
     * en un archivo de salida cancionSalida.txt. Además, deberemos especificar
     * en cada línea del archivo la cantidad de palabras y la palabra “
     * palabras”. Por ejemplo, “Los pollitos dicen pio pio pio 6 palabras”.
     *
     */
    public static void ejercicio1() {

        File archivo = new File("src/ficheros/cancion.txt");//Si probamos a fallar en la ruta se genera NullPointerException en la sentencia de salida.close()
        Scanner entrada = null;
        PrintWriter salida = null;
        String linea;
        String[] lineaArray;
        try {
            entrada = new Scanner(archivo);
            salida = new PrintWriter("src/ficheros/cancionSalida.txt");
            while (entrada.hasNextLine()) {//MIENTRAS EXISTAN LINEAS QUE LEER
                linea = entrada.nextLine();//LEO LA LINEA
                salida.print(linea);//ESCRIBO TAL CUAL LA LINEA EN EL ARCHIVO
                lineaArray = linea.split(" ");
                salida.println(" " + lineaArray.length + " palabras");//AÑADO ESTO
            }
        } catch (Exception e) {//Podríamos particularizar a FileNotFoundException
            System.out.println("No se encuentra el archivo");
        } finally {
            /*Debido a que nos encontramos dentro de un bloque de claúsula finally, estamos seguros de que pase 
            lo que pase el archivo se cerrará y por tanto los cambios en él serán guardados*/
            if(salida != null)
                    //Resolvemos la posibilidad de que no se encuentre el archivo y pueda generar una 
                    //NullPointerException con un if, de esta forma evitamos abusar del uso de las excepciones
            salida.close();
        }

    }

    public static void main(String[] args)  {
        ejercicio1();
    }

}
