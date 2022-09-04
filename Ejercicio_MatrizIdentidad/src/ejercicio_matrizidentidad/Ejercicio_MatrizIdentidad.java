package ejercicio_matrizidentidad;
//importaciones de java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio_MatrizIdentidad {

    public static void main(String[] args) throws FileNotFoundException {

        //declaracion de variables
        File archivo = new File("src/ejercicio_matrizidentidad/datos");
        Scanner entrada = new Scanner(archivo);

        int[][] matrizIdentidad;
        int numero;
        boolean identidad;

        numero = entrada.nextInt();

        //leer matriz
        while (numero != 0) {

            matrizIdentidad = new int[numero][numero];
            identidad = true;

            System.out.println(" Matriz: ");
            System.out.println(" Número de ﬁlas de la Matriz: " + matrizIdentidad.length);
            for (int i = 0; i < numero; i++) {

                for (int j = 0; j < numero; j++) {

                    matrizIdentidad[i][j] = entrada.nextInt();

                    System.out.print(" [ " + matrizIdentidad[i][j] + " ]");
                    System.out.print(" ");

                }

            }

            // comprobar diagonal de 1
            for (int i = 0; i < numero; i++) {
                for (int j = 0; j < numero; j++) {

                    if (matrizIdentidad[i][i] != 1) {
                        identidad = false;
                        break;
                    }

                }
            }

            // comprobar lado izquierdo de 0
            if (identidad) {
                for (int i = 0; i < numero; i++) {
                    for (int j = 0; j < i; j++) {

                        if (matrizIdentidad[i][j] != 0) {
                            identidad = false;
                            System.out.println(matrizIdentidad[i][j]);
                            break;
                        }

                    }
                }

            }

            //comprobar lado derecho de 1
            if (identidad) {
                for (int i = 0; i < numero; i++) {
                    for (int j = numero - 1; j > i; j--) {

                        if (matrizIdentidad[i][j] != 0) {
                            identidad = false;
                            break;

                        }

                    }

                }

            }

            //muestra si la matrizIdentidad es identidad o no
            if (identidad) {
                System.out.println(" SI");
            } else {
                System.out.println(" NO");
            }

            numero = entrada.nextInt();
            System.out.println(" ");
        }

        entrada.close();
    }

}
