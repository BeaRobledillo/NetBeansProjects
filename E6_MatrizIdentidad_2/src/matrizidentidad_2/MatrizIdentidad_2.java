package matrizidentidad_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrizIdentidad_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/matrizidentidad_2/datos");
        Scanner entrada = new Scanner(archivo);
        /*
        OJO!! Esta solución no se implementa con el uso de matrices
        */

        int tamanioMatriz;
        boolean esIdentidad;
        String posicion;

        do {//este bucle nos sirve para ver el funcionamiento de la sentencia break;
            //sería muuucho mejor implementar la solución con un while(tamanioMatriz !=0)
            //PASO 1: LEEMOS EL TAMAÑO DE LA MATRIZ
            tamanioMatriz = entrada.nextInt();
            if (tamanioMatriz == 0) {
                break;
            }
            entrada.nextLine();//LIMPIAMOS BUFFER!!!
            esIdentidad = true;//suponemos que la matriz es identidad, veremos si se demuestra lo contrario dentro de los bucles
            //Sabemos que las matrices son cuadradas (filas=columnas)
            //PASO 2: recorremos la matriz con dos for anidados
            for (int i = 1; i <= tamanioMatriz; i++) {//recorre FILAS
                for (int j = 1; j <= tamanioMatriz; j++) {//recorre COLUMNAS
                    //mostramos posición a posición
                    posicion = entrada.next();
                    if (i == j) {//para los elementos de la diagonal
                        if (!(posicion.equals("1"))) {
                            esIdentidad = false;
                        }
                    } else {//para los elementos que NO son de la diagonal
                        if (!(posicion.equals("0"))) {
                            esIdentidad = false;
                        }
                    }
                }

            }

            if (esIdentidad == true) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } while (tamanioMatriz != 0);

    }

}
