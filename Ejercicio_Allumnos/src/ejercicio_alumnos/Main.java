package ejercicio_alumnos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejercicio_alumnos/datosEntrada");
        Scanner entrada = new Scanner(archivo);
        PrintWriter salida = new PrintWriter("src/ejercicio_alumnos/datosSalida.txt");
        String linea;
        String[] lineaArray;
        while (entrada.hasNextLine()) {//MIENTRAS EXISTAN LINEAS QUE LEER
            linea = entrada.nextLine();//LEO LA LINEA
            salida.print(linea);//ESCRIBO TAL CUAL LA LINEA EN EL ARCHIVO
            lineaArray = linea.split(" ");

        }
        salida.close();//CIERRO EL ARCHIVO!!!SI NO NO SE VE NADA!!
    }
}
