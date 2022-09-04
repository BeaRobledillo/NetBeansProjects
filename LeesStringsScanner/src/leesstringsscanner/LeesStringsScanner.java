package leesstringsscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeesStringsScanner {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/leesstringsscanner/datos");
        Scanner entrada = new Scanner(archivo);
        entrada.useDelimiter("");
        String cadenaLeida;
        String[][]arrayCaracteresLinea = new String[2][];
        int posicion = 0;
        while (entrada.hasNext()) {
            cadenaLeida = entrada.nextLine();
            arrayCaracteresLinea[posicion] = cadenaLeida.split("");
            posicion++;
            System.out.println("");
            

        }
    }

}
