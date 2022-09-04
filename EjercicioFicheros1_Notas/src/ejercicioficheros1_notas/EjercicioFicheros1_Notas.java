package ejercicioficheros1_notas;

/*Dado un archivo llamado notas.txt con carnet, nombre, apellido y 3 notas parciales para un grupo de alumnos, 
procesar estos datos y construir una nuevo archivo salida.txt que contenga 
solamente los carnets y el promedio de notas de aquellos alumnos cuyo promedio está por  encima de 14 ptos.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EjercicioFicheros1_Notas {

    public static void escribeAlumno(Scanner entrada1, PrintWriter salidaAlumnos) {
        String dni;
        int promedio;
        while (entrada1.hasNext()) {
            dni = entrada1.next();
            entrada1.next();
            entrada1.next();
            promedio = (entrada1.nextInt() + entrada1.nextInt() + entrada1.nextInt()) / 3;

            entrada1.nextLine();

            if (promedio > 14) {
                salidaAlumnos.println(dni + " " + promedio);

            }
        }
        salidaAlumnos.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Fichero del que queremos leer
        File file = new File("src/ejercicioficheros1_notas/datos");
        Scanner entrada = new Scanner(file);

        File salida = new File("src/ejercicioficheros1_notas/salidaalumnos.txt");
        PrintWriter imprimir = new PrintWriter(salida);
        //escribeAlumno(new Scanner(file), new PrintWriter(salida));
        //int carnet;
        //String nombre;
        // String apellido;
        int notasParciales;
        //int promedioNotas;
        //promedio(salida);
        //escribeArchivo(file);
        notasParciales = entrada.nextInt();

        // Leemos el contenido del fichero
        entrada = new Scanner(file);

        // Leemos linea a linea el fichero
        while (entrada.hasNextLine()) {
            // String linea = entrada.nextLine();// Guardamos la linea en un String
            
            escribeAlumno(entrada, imprimir);
            //System.out.println(entrada); // Imprimimos la linea
            System.out.println(salida);
            imprimir.close();
        }

    }

}
