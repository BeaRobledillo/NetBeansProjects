package cambiadelimitadorbuffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CambiaDelimitadorBuffer {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/cambiadelimitadorbuffer/datos");
        Scanner entrada = new Scanner(archivo);
        String fragmento = "";
        entrada.useDelimiter(":");//CAMBIAMOS EL DELIMITADOR DE FORMA MANUAL...

        while (entrada.hasNext()) {
            fragmento = entrada.next();
            /*Al ejecutar el método next() del scanner, el delimitador por defecto es el carácter espacio
            Si cambiamos el carácter delimitador a otro (por ejemplo "@") los fragmentos se determinan a partir de que nos 
            encontremos el carácter "@"*/
            System.out.println(fragmento);
        }

    }
}
