package esmatrizidentidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EsMatrizIdentidad {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/esmatrizidentidad/datos");
        Scanner entrada = new Scanner(archivo);
        int[][] matrizIdentidad;
        int dimension;
        //LEER matriz
        dimension = entrada.nextInt();
        if (dimension != 0) {
            matrizIdentidad = new int[dimension][dimension];
            for (int i = 0; i < matrizIdentidad.length; i++) {
                for (int j = 0; j < matrizIdentidad[i].length; j++) {
                    matrizIdentidad[i][j] = entrada.nextInt();
                }
            }
            //recorrido matriz
        }

        if (true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

}
