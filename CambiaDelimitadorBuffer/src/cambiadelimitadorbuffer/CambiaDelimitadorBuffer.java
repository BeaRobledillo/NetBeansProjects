package cambiadelimitadorbuffer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CambiaDelimitadorBuffer {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/cambiadelimitadorbuffer/datos");
        Scanner entrada = new Scanner(archivo);
        String fragmento = "";
        entrada.useDelimiter(":");

        //String lineaConsola = "";
        //System.out.print("Introduzca una línea a tratar, cada elemento seperado por espacios");
        //lineaConsola = entrada.nextLine();
        while (entrada.hasNext()) {

            fragmento = entrada.next();
            System.out.println(fragmento);
        }
    }

}
