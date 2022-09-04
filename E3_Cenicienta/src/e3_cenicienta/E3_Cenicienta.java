package e3_cenicienta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E3_Cenicienta {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/e3_cenicienta/datos");
        Scanner entrada = new Scanner(archivo);
        Scanner leeLinea;

        int numeroBailes = 0;
        int segundosHastaBaile = 0;
        int segundosTodasTareas = 0;
        int diasBaile, horasBaile, minutosBaile, segundosBaile;
        int horasTarea, minutosTarea, segundosTarea = 0;
        String lineaArchivo = "";

        numeroBailes = entrada.nextInt();
        //Limpiamos buffer para situarnos al principio de la segunda línea
        entrada.nextLine();

        for (int i = 0; i < numeroBailes; i++) {

            //ZONA DE LECTURA DE CUENTA ATRAS HASTA EL BAILE
            lineaArchivo = entrada.nextLine();
            leeLinea = new Scanner(lineaArchivo);
            leeLinea.useDelimiter(":");
            segundosHastaBaile=0; //reseteamos para evitar acumulacion 
            //dek tiempo del baile anterior
            segundosTodasTareas=0;
            //recogemos por separado cada cifra del tiempo que resta hasta el baile
            diasBaile = leeLinea.nextInt();
            horasBaile = leeLinea.nextInt();
            minutosBaile = leeLinea.nextInt();
            segundosBaile = leeLinea.nextInt();
            //reducimos todo a segundos y sumamos el total
            segundosHastaBaile += segundosBaile + (diasBaile * 24 * 3600) + (horasBaile * 3600) + (minutosBaile * 60);

            System.out.print(segundosHastaBaile + " ");
            //ZONA DE LECTURA DE CUENTA ATRAS HASTA EL BAILE
            //ZONA DE LECTURA DE TAREA
            lineaArchivo = entrada.nextLine();
            leeLinea = new Scanner(lineaArchivo);
            /*En el caso de que queramos definir un patrón con más de una posibilidad, lo definiremos entre corchetes:
            [:\\s] es el patron que define el espacio en blanco
            Este patrón detecta : o espacio en blanco como delimitador de tokens o fragmentos*/
            leeLinea.useDelimiter("[:\\s]");
            while (leeLinea.hasNext()) {

                horasTarea = leeLinea.nextInt();
                minutosTarea = leeLinea.nextInt();
                segundosTarea = leeLinea.nextInt();
                segundosTodasTareas += segundosTarea + (horasTarea * 3600) + (minutosTarea * 60);
            }
            System.out.println(segundosTodasTareas);
            //ZONA DE LECTURA DE TAREA
            if (segundosTodasTareas >= segundosHastaBaile) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
        }
    }

}
