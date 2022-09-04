package ejemplousoarray_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploUsoArray_6 {

    public static void main(String[] args) throws FileNotFoundException {
        /*Este ejemplo ilustra la lectura de datos de un archivo hacia una matriz definida*/
        File archivo = new File("src/ejemplousoarray_6/datos");
        Scanner entrada = new Scanner(archivo);
        int[][] matrizLeida = new int [3][3];
        int fila = 0;
        int mayor=0;
        
        for (int i = 0; i < matrizLeida.length; i++) {
            for (int j = 0; j < matrizLeida[i].length; j++) {
                matrizLeida[i][j] = entrada.nextInt();
            }
        }
        
        System.out.print("Especifique una fila (1-3), buscaremos el máximo valor de esa fila:");
        entrada = new Scanner(System.in);//el scanner lee de teclado ahora...
        fila = entrada.nextInt();
        while ((fila < 1) || (fila > 3)){
            System.out.print("Debe especificar una fila entre 1 y 3 por favor:");
            fila = entrada.nextInt();
        }
        for (int i = 0; i < matrizLeida[fila-1].length; i++) {
            if(matrizLeida[fila-1][i] > mayor){
                mayor = matrizLeida[fila-1][i];
            }
           
        }
         System.out.println("El mayor valor encontrado en la fila " + (fila) + " fue: " + mayor);
        
        
    }

}
