package leerstringsscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerStringsScanner {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/leerstringsscanner/datos");
        Scanner entrada = new Scanner(archivo);
        String cadenaLeida;
        String[][] arrayCaracteresLinea = new String[2][];
        int posicion = 0;
        while(entrada.hasNext()){
            /*Debido a que el método next() lee "tokens" o fragmentos debemos tener en cuenta que 
            el carácter separador por defecto es el espacio, al no haber espacios nos coge la línea entera*/
            cadenaLeida = entrada.nextLine();
            arrayCaracteresLinea[posicion] = cadenaLeida.split("");
            posicion++;
            System.out.println("");
        }
        
    }

}
