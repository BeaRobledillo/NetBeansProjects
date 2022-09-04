package ejemplousoarray6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploUsoArray6 {

    public static void main(String[] args) throws FileNotFoundException {
        /*este ejempplo ilustra a lectura de datos de un archivo hacia una matriz definida*/
        File archivo = new File("src/ejemplousoarray6/datos");
        Scanner entrada = new Scanner(archivo);
        int[][] matrizLeida = new int[3][3];

        for (int i = 0; i < matrizLeida.length; i++) {
            for (int j = 0; j < matrizLeida[i].length; j++) {
                matrizLeida[i][j] = entrada.nextInt();
            }
        }
        System.out.println("La matriz fue leida");
    }

}
