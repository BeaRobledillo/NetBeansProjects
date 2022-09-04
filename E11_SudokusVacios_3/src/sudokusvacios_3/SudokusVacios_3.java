package sudokusvacios_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokusVacios_3 {

    /*dados dos arrays comprobar si en cada una de las posiciones del array original y del nuevo rotado
    tenemos el mismo tipo de contenido: o bien cifra en los dos o bien guión en los dos*/
    public static boolean comprobarGemelos(String[][] sudoku, String[][] arrayRotado) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                //(sudoku[i][j].equals("-")) && arrayRotado[i][j].equals("-")
                //!((sudoku[i][j].equals("-")) || arrayRotado[i][j].equals("-"))
                if ((sudoku[i][j].equals("-")) && arrayRotado[i][j].equals("-")) {
                    //es bueno: son guiones simultáneamente
                    continue;
                } else {
                    if (!((sudoku[i][j].equals("-")) || arrayRotado[i][j].equals("-"))) {
                        //es bueno: son números simultáneamente
                        continue;
                    } else {
                        //es malo: o tenemos (-  número) o bien (número  -)
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /*dado un array, debemos rotarlo */
    public static boolean rotarArray(String[][] sudoku) {
        boolean result;
        String[] lineaArray;
        String[][] arrayRotado = new String[9][9];
        int indiceFilas = sudoku.length - 1;
        //lineaArrayNuevo = lineaArrayOriginal dada la vuelta
        for (int i = sudoku.length - 1; i >= 0; i--) {
            lineaArray = sudoku[i];
            for (int j = lineaArray.length - 1; j >= 0; j--) {
                arrayRotado[indiceFilas - i][indiceFilas - j] = lineaArray[j];
            }
        }
        result = comprobarGemelos(sudoku, arrayRotado);
        return result;
    }

    /*dado un array de cadenas de 9 filas y 9 columnas, comprobar si existen 32 o menos cifras en su interior */
    public static boolean comprobarCifras(String[][] sudoku) {
        int contadorCifras = 0;
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                //compruebo si casilla contiene un número mediante equals()
                if (sudoku[i][j].equals("1")
                        || sudoku[i][j].equals("2")
                        || sudoku[i][j].equals("3")
                        || sudoku[i][j].equals("4")
                        || sudoku[i][j].equals("5")
                        || sudoku[i][j].equals("6")
                        || sudoku[i][j].equals("7")
                        || sudoku[i][j].equals("8")
                        || sudoku[i][j].equals("9")) {
                    contadorCifras++;

                }
            }

        }
        if (contadorCifras <= 32) {
            return true;
        } else {
            return false;
        }
    }

    public static void leerFichero(String[][] sudoku, Scanner entrada) {
        for (int i = 0; i < sudoku.length; i++) {
            sudoku[i] = entrada.nextLine().split("");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        //1. leer datos del fichero y formar array
        //2. procesamos array:
        //  2.1 comprobar que números <= 32 ()
        //  2.2 comprobar simetria
        //3. Si 2.1 y 2.2 se cumplen escribo "SI"
        File archivo = new File("src/sudokusvacios_3/datos");
        Scanner entrada = new Scanner(archivo);

        String[][] sudoku = new String[9][9];
        int numerosCasos = entrada.nextInt();
        entrada.nextLine();//limpiar buffer!!!!
        for (int i = 0; i < numerosCasos; i++) {
            entrada.nextLine();
            //1. leer datos del fichero y formar array
            leerFichero(sudoku, entrada);

            //2. procesamos el array
            //  2.1 comprobar que números <= 32
            boolean cumpleCifras = comprobarCifras(sudoku);
            System.out.println("El array tiene 32 o menos cifras??: " + cumpleCifras);

            //2. procesamos array:
            //  2.2 comprobar simetria
            boolean cumpleRotacion = rotarArray(sudoku);
            System.out.println("El array rotado es simétrico??: " + cumpleRotacion);

            //3. Si 2.1 y 2.2 se cumplen escribo "SI"
            if ((cumpleCifras) && (cumpleRotacion)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }

    }
}
