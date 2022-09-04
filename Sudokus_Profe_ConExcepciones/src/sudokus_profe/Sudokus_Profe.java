package sudokus_profe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sudokus_Profe {

    /*Este método introduce los datos del fichero al array sudoku*/
    public static void leerSudoku(int[][] sudoku, Scanner entrada) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                sudoku[i][j] = entrada.nextInt();
            }

        }
    }

    /**
     * Este método comprueba la validez de un array de enteros
     */
    public static boolean compruebaArray(int[] arrayNumeros) {
        //La suma de los números entre 1 y 9 es 1+2+3+4+5+6+7+8+9 = 45
        //Por otro lado, si a medida que vamos sumando observamos que la diferencia entre los valores es de una unidad, vamos por buen camino
        //Por otro lado, si ordenamos los elementos del array recibido y el valor de la posición coincide con el índice que nos ayuda a recorrer el array, vamos por buen camino
        Arrays.sort(arrayNumeros);
        for (int i = 1; i < 10; i++) {
            if (arrayNumeros[i - 1] != i) {//El array comienza en 0!!!
                return false;
            }
        }
        return true;
    }

    /**
     * Este método crea un array unidimensional a partir de las columnas del
     * array original
     */
    public static int[] creaArrayDeColumna(int[][] sudoku, int columna) {
        //La variable columna nos indica mediante un valor 0-8 la columna del suddoku a partir de la cual ebemos crear un array unidimensional
        int[] result = new int[9];
        for (int i = 0; i < sudoku.length; i++) {
            result[i] = sudoku[i][columna];
        }
        return result;
    }

    /**
     * Este método crea un array unidimensional a partir de una región del array
     * original
     */
    public static int[] creaArrayDeRegion(int[][] sudoku, int fila, int columna) {
        int[] result = new int[9];
        int contador = 0;//Esta variable nos ayuda a introducir el valor del array bidimensional en el array unidimensional
        for (int i = fila; i <= fila + 2; i++) {
            for (int j = columna; j <= columna + 2; j++) {
                result[contador] = sudoku[i][j];
                //System.out.print(result[contador] + " ");//para que muestre las regiones que selecciona
                contador++;

            }
            //System.out.println("");//para que muestre las regiones que selecciona
        }
        return result;
    }

    public static void main(String[] args)  {
        try {
            File archivo = new File("src/sudokus_profe/datos");
            Scanner entrada = new Scanner(archivo);
            int[][] sudoku = new int[9][9];
            int numSudokus = entrada.nextInt();
            boolean regionMala = false;
            boolean filaMala = false;
            boolean columnaMala = false;
            //1. Leemos los datos del sudoku
            //2. comprobaciones: filas, columnas, region
            //3. mostramos resultados
            leerSudoku(sudoku, entrada);
            /*2.1 comprobación de filas y columnas*/
            for (int i = 0; i < sudoku.length; i++) {
                if (!(compruebaArray(sudoku[i].clone()))) {
                    filaMala = true;
                    System.out.println("El sudoku tiene una fila mal formada");
                    //return;//descomentar si no queremos seguir tratando el resto de casos y poner sout("NO")
                }
                if (!(compruebaArray(creaArrayDeColumna(sudoku, i)))) {
                    columnaMala = true;
                    System.out.println("El sudoku tiene una columna mal formada");
                    //return;//descomentar si no queremos seguir tratando el resto de casos y poner sout("NO")
                }
            }
            /*FIN comprobación de filas y columnas*/
            /*2.2 comprobación de regiones*/
            for (int i = 0; i < sudoku.length; i += 3) {
                for (int j = 0; j < sudoku.length; j += 3) {
                    if (!(compruebaArray(creaArrayDeRegion(sudoku, i, j)))) {
                        regionMala = true;
                        System.out.println("El sudoku tiene una región mal formada");
                        //return;//descomentar si no queremos seguir tratando el resto de casos y poner sout("NO")
                    }
                }
            }
            /*FIN comprobación de regiones*/
            if ((!filaMala) && (!columnaMala) && (!regionMala)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sudokus_Profe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
