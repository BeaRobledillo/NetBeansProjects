/*para ser considerado un buen sudoku, este no debe proporcionar mas de 32 celdas rellenas,
y debe tener simetr´ıa rotacional. Esto signiﬁca que si la distribucion inicial del sudoku se rota 180 grados,
las celdas ocupadas son las mismas, aunque no necesariamente con los mismos digitos. 
Cada sudoku se proporciona con 9 lıneas. Cada una esta compuesta a su vez de 9 caracteres contiguos, 
cada uno representando el valor de una de las celdas de esa ﬁla. 
El sımbolo - se utiliza para indicar una celda vacıa.
Dos casos de prueba consecutivos se separan por una lınea en blanco. 
Tambien hay una lınea en blanco antes del primer sudoku.
Para cada caso de prueba se escribira SI si el sudoku es valido,
es decir si no supera los 32 d´ıgitos rellenos y tiene simetrıa rotacional. 
En otro caso, se escribira NO. 
Ten en cuenta que no hay que preocuparse de si, con la conﬁguraci´on de partida,
el sudoku es o no resoluble, por lo que los nu´meros leıdos son indiferentes 
y el programa debe unicamente preocuparse de que casillas es´an llenas y cuales no.

 */
package sudokusvacios;

//importaciones de java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokusVacios {

    /*Este método introduce los datos del fichero al array sudoku*/
    public static void leerSudoku(String[][] sudoku, Scanner entrada) {
        for (String[] sudoku1 : sudoku) {
            for (int j = 0; j < sudoku1.length; j++) {
                sudoku1[j] = entrada.nextLine();
                
                
                
            }
        }
    }

    //Este metodo es para 
    public static void rotarArray(int[][] matriz, int[][] transpuesta) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                transpuesta[8 - i][8 - j] = matriz[i][j];
            }
        }
    }

    /*Este método*/
    public static boolean prueba(int[][] m, int[][] ref) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (m[i][j] != ref[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    /*Este método*/
    public static void mostrar(int[][] m) {
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    //principal
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        File archivo = new File("src/sudokusvacios/datos");
        Scanner entrada = new Scanner(archivo);
        String[][] sudoku = new String[9][9];
        int numeroSudokus = 0;
        int[][] array1;
        int[][] array2;
        entrada.nextLine();
       
        // String[][] arrayNumeros = new String[9][9];
        String[][] cadenaNueva = new String[9][9];

        int posicion = 0;
        // String cadenaNueva = new String(arrayNumeros);

        int casos = entrada.nextInt();

        //cadenaNueva = entrada.nextLine();
        //numeroSudokus[posicion] = cadenaNueva.split("");
        posicion++;
        System.out.println("");
        for (int k = 0; k < casos; k++) {

            array1 = new int[9][9];
            array2 = new int[9][9];
            entrada.nextLine();
            entrada.nextLine();
            numeroSudokus = 0;
            for (int i = 0; i < 9; i++) {
                 entrada.nextLine();
                //cadenaNueva = entrada.nextLine();
                for (int j = 0; j < 9; j++) {
                    
                    if (sudoku.split(j) >= 48 && sudoku.split(j) <= 57) {
                        array1[i][j] = 1;
                        numeroSudokus++;
                        
                      
                    }
                }
            }

            if (numeroSudokus <= 32) {
                rotarArray(array1, array2);

                System.out.println((prueba(array1, array2) ? "SI" : "NO"));
            } else {
                System.out.println("NO");
            }

        }

    }

}
