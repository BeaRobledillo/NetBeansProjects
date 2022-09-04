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
    public static void ejercicio1() throws FileNotFoundException {

        File archivo = new File("src/ficheros/cancion.txt");
        Scanner entrada = new Scanner(archivo);
        PrintWriter salida = new PrintWriter("src/ficheros/cancionSalida.txt");
        String linea;
        String[] lineaArray;
        while (entrada.hasNextLine()) {//MIENTRAS EXISTAN LINEAS QUE LEER
            linea = entrada.nextLine();//LEO LA LINEA
            salida.print(linea);//ESCRIBO TAL CUAL LA LINEA EN EL ARCHIVO
            lineaArray = linea.split(" ");
            salida.println(" " + lineaArray.length + " palabras");//AÑADO ESTO
        }
        salida.close();//CIERRO EL ARCHIVO!!!SI NO NO SE VE NADA!!
    }

    /**
     * 2.Dado el archivo de texto “datos.txt”, que contiene dni nombre y
     * apellido de personas escribiremos un archivo nuevo.txt, donde solo
     * aparecerán los nombres de aquellas personas con DNI terminado en número
     * par.
     *
     */
    public static void ejercicio2() throws FileNotFoundException {

        File archivo = new File("src/ficheros/datos.txt");
        Scanner entrada = new Scanner(archivo);
        Scanner leerLinea;
        PrintWriter salida = new PrintWriter("src/ficheros/nuevo.txt");
        String linea;
        int dni;
        while (entrada.hasNextLine()) {//mientras haya lineas que leer
            linea = entrada.nextLine();//leemos linea
            leerLinea = new Scanner(linea);//asignamos la linea leida a otro scanner
            dni = leerLinea.nextInt();//leemos el dni: primer elemento de la linea
            if (dni % 2 == 0) {//Si es par..
                salida.println(linea);
            }
        }
        salida.close();//cerramos el fichero!!!!!!!!!!!!!!!!!!
    }

    /**
     * 3.Dado el archivo de texto “notas.txt”, con carnet nombre, apellido y 3
     * notas parciales escribiremos un archivo promedios.txt, donde solo
     * aparecerán los datos de aquellos estudiantes cuyo promedio es mayor a
     * catorce puntos.
     *
     */
    public static void ejercicio3() throws FileNotFoundException {

        File archivo = new File("src/ficheros/notas.txt");
        Scanner entrada = new Scanner(archivo);
        PrintWriter salida = new PrintWriter("src/ficheros/promedios.txt");
        String linea;
        String[] alumno;
        int promedio;
        while (entrada.hasNextLine()) {
            linea = entrada.nextLine();//leemos una línea
            alumno = linea.split(" ");//creamos un array a partir del método split
            //las notas están en las tres últimas posiciones del array!!
            promedio = (Integer.parseInt(alumno[alumno.length - 1])
                    + Integer.parseInt(alumno[alumno.length - 2])
                    + Integer.parseInt(alumno[alumno.length - 3])) / 3;

            if (promedio > 14) {
                salida.println(linea);//escribimos la línea en el fichero
            }
        }
        salida.close();//Cerramos el archivo!!!!!!!!!
    }

    public static void main(String[] args) throws FileNotFoundException {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

}


