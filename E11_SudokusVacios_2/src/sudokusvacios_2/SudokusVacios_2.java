/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusvacios_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class SudokusVacios_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/sudokusvacios_2/datos");
        Scanner entrada = new Scanner(archivo);
        int numeroSudokus = 0;
        int posicionesSudoku = 0;//Restaremos 1 cada vez que nos encontremos con un "-" para ver si existen 32 cifras
        boolean rotacionalTotal = false;
        boolean rotacionalParcial = false;

        //leemos el número de sudokus y nos colocamos al principio de la primera línea del primer sudoku
        numeroSudokus = entrada.nextInt();
        entrada.nextLine();
        entrada.nextLine();

        String[][] sudoku = new String[9][9];
        

        for (int i = 1; i <= numeroSudokus; i++) {
            posicionesSudoku = 81;
            //Leemos el sudoku por filas!!
            for (int k = 0; k < sudoku.length; k++) {
                //leemos una línea cada vez y mediante el método split() cortamos el String leído (la línea) 
                //devolviendo un array de String que se asigna a cada fila del array que es nuestro sudoku:
                sudoku[k] = entrada.nextLine().split("");
                //Recorremos la fila introducida en busca de guiones para saber cuántos números posee:
                for (int j = 0; j < sudoku[k].length; j++) {
                    if (sudoku[k][j].equals("-")) {
                        posicionesSudoku--;
                    }
                }
                //--------------------------------------------------------------------------------------
            }
            //Procesamos y comprobamos si el sudoku en rotacional, suponemos en principio que SI
            /*
            Deberíamos comparar sólo la primera mitad de filas con la segunda mitad, ya que si no 
            se cruzan las comparaciones. Además en la fila de enmedio desde el principio hasta la mitad y 
            desde el final hasta la mitad.
            
            Si tenemos esta matriz:
            *****
            *****
            *****
            *****
            *****
            Deberíamos comparar con esta estructura en mente, teniendo en cuenta que no importa el valor de
            la tercera fila tercera columna:
            *****
            *****
            **
            sudoku[j][k] 
            se comparara con 
            sudoku[(sudoku.length - 1) - j][(sudoku[j].length - 1) - k]
            
             */
            
            
            rotacionalTotal = true;
            rotacionalParcial = true;
            for (int j = 0; j < sudoku.length; j++) {//HASTA MITAD!!
                for (int k = 0; k < sudoku[j].length; k++) {//HASTA MITAD DE LA FILA MITAD!!
                    if ((sudoku[j][k].equals("-")) && (sudoku[(sudoku.length - 1) - j][(sudoku[j].length - 1) - k].equals("-"))) {
                        rotacionalParcial = true;
                    } else {
                        if ((!(sudoku[j][k].equals("-"))) && (!(sudoku[(sudoku.length - 1) - j][(sudoku[j].length - 1) - k].equals("-")))) {
                            rotacionalParcial = true;
                        } else {
                            rotacionalParcial = false;
                        }

                    }
                    rotacionalTotal = rotacionalParcial && rotacionalTotal;
                }

            }
            if (rotacionalTotal) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            if (i < numeroSudokus) {
                entrada.nextLine();
            }
        }

    }

}
