/* cuadrıcula de 9×9 casillas dividida en nueve regiones 3×3 
(las separadas con lıneas mas gruesas en la imagen) 
con los numeros del 1 al 9 de tal forma que 
no se repitan numeros en ninguna ﬁla, columna o region. 
construir un programa que comprobara si es correcto 
(es decir, cada ﬁla, columna o region contiene los numeros del 1 al 9 
exactamente una vez)
La entrada comienza con un numero que representa el numero de casos de prueba 
que vendran a continuacion. 
Cada caso de prueba esta formado por 9 lıneas, 
cada una con 9 numeros entre el 1 y el 9 separados por espacios, 
que representan un sudoku completamente relleno.

 */
package sudokus2;
//importaciones java

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//clase Sudokus
public class Sudokus2 {

    private static Object entrada;

    public static int leerSudoku(int[][] sudoku) throws FileNotFoundException {
        //leer sudoku
        File archivo = new File("src/sudokus2/datos");
        Scanner entrada = new Scanner(archivo);
        sudoku = new int[9][9];
        int casos = entrada.nextInt();
        for (int l = 0; l < casos; l++) {

            sudoku = new int[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = entrada.nextInt();
                }
            }

            // comprobación de filas y columnas
            boolean correcto = true;
            for (int i = 0; i < 9; i++) {
                if (!comprobarFila(sudoku, i)) { //filas
                    correcto = false;
                }
                if (correcto && !comprobarColumna(sudoku, i)) { //columnas
                    correcto = false;
                }
                if (!correcto) {
                    break;
                }
            }

            if (correcto) {
                correcto = comprobarRegiones(sudoku); //region
            }

            //mostrar resultados
            System.out.println((correcto) ? "SI" : "NO");
        }
        return 0;
    }

    //metodo para comprobar las filas
    public static boolean comprobarFila(int[][] m, int f) {
        int[] test = new int[9];
        for (int c = 0; c < m.length; c++) {
            if (test[m[f][c] - 1] == 1) {
                return false;
            }
            test[m[f][c] - 1] = 1;
        }
        return true;
    }

    //metodo para comprobar las columnas
    public static boolean comprobarColumna(int[][] m, int c) {
        int[] prueba = new int[9];
        for (int[] m1 : m) {
            if (prueba[m1[c] - 1] == 1) {
                return false;
            }
            prueba[m1[c] - 1] = 1;
        }
        return true;
    }

    //metodo para comprobar region
    public static boolean comprobarRegiones(int[][] m) {
        int maximo, x, y;
        int[] valores = {0, 3, 6, 0, 3, 6, 0, 3, 6};
        for (int l = 0; l < 9; l++) {
            x = y = valores[l];
            maximo = x + 3;
            int[] test = new int[9];
            for (int i = x; i < maximo; i++) {
                for (int j = y; j < maximo; j++) {
                    if (test[m[i][j] - 1] == 1) {
                        return false;
                    }
                    test[m[i][j] - 1] = 1;
                }
            }
        }
        return true;
    }

    //principal main
    public static void main(String[] args) throws FileNotFoundException {

        //variables
        File archivo = new File("src/sudokus2/datos");
        Scanner entrada = new Scanner(archivo);
        int[][] sudoku = new int[9][9];

        boolean correcto;
        leerSudoku(sudoku);

        //1. Leemos los datos del sudoku
        //2. comprobaciones: filas, columnas, region
        //3. mostramos resultados
    }

}
