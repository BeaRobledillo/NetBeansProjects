package ejercicioficheros2_dni;

/*Dado un archivo de texto DNI.txt, que contiene dni, nombre y apellido de personas 
escribiremos un archivo llamado nuevo.txt, 
donde sólo aparecerán los nombres de aquellas personas con DNI terminado en número par.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioFicheros2_DNI {

    public static void escribeNombre(Scanner entrada, PrintWriter salida) {
        while (entrada.hasNext()) {
            int dni = entrada.nextInt();
            String nombre = entrada.next();
            entrada.nextLine();
            if (dni % 2 == 0) {
                salida.println(nombre);
            }

        }
        salida.close();
    }

    public void escribeArchivo(File archivo) throws FileNotFoundException {
        PrintWriter salida = new PrintWriter(archivo);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/ejercicioficheros2_dni/datos");
        Scanner entrada = new Scanner(file);
        File salida = new File("src/ejercicioficheros2_dni/salidadni.txt");
        try (PrintWriter imprimir = new PrintWriter(salida)) {
            int dni;
            String nombre;
            String apellido;
            try {
                // Leemos el contenido del fichero
                entrada = new Scanner(file);
                
                // Leemos linea a linea el fichero
                while (entrada.hasNextLine()) {
                   // String linea = entrada.nextLine();// Guardamos la linea en un String
                    //System.out.println(linea);  // Imprimimos la linea
                    escribeNombre(entrada, imprimir);
                }
            } catch (Exception ex) {
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
        }
    }

}
