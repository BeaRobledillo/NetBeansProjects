package matrizidentidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrizIdentidad {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/matrizidentidad/datos");
        Scanner entrada = new Scanner(archivo);
        int[][] matrizIdentidad;
        int dimension;
        boolean esUno = true;
        boolean esCero = true;
        //1. Lectura de los datos del fichero para crear la matriz
        dimension = entrada.nextInt();
        while (dimension > 0) {

            matrizIdentidad = new int[dimension][dimension];
            for (int i = 0; i < matrizIdentidad.length; i++) {
                for (int j = 0; j < matrizIdentidad[i].length; j++) {
                    matrizIdentidad[i][j] = entrada.nextInt();
                }
            }
            //2. recorrido para comprobar si la matriz es identidad(lo podríamos optimizar a medida que leemos datos...
            /*Si los índices i y j son iguales estamos en la diagonal principal y podemos comprobar si el valor es 1*/
 /*Si los índices i y j son distintos NO estamos en la diagonal principal y podemos comprobar si el valor es 0*/
            for (int i = 0; i < matrizIdentidad.length; i++) {
                for (int j = 0; j < matrizIdentidad[i].length; j++) {
                    if (i == j) {//indices iguales -->comprobamos valor = 1 aquí
                        if (matrizIdentidad[i][j] == 1) {
                            esUno &= true;//esUno = esUno && true;
                        } else {
                            esUno &= false;
                        }
                    } else {//indices distintos --> comprobamos valor = 0 aquí
                        if (matrizIdentidad[i][j] == 0) {
                            esCero &= true;
                        } else {
                            esCero &= false;
                        }
                    }
                    //En este punto acabaríamos de procesar una fila y podríamos "romper" la comprobación de la matriz en caso de necesitarlo
                    // De la siguiente forma: if(!(esUno && esCero)){ break;...}
                }
                ///
            }
            if (!(esUno && esCero)) {
                System.out.println("NO");
            } else {
                System.out.println("SI");
            }
            //debemos inicializar las variables para evitar que una vez aparezca una matriz no identidad se consideren no identidad las restantes
            esUno = true;
            esCero = true;
            dimension = entrada.nextInt();
        }
    }
}
