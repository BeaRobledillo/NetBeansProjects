package ejemplosusoscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemplosUsoScanner {

    public static void main(String[] args) throws FileNotFoundException {
        //1.Un Scanner es capaz de recorrer una serie de datos,
        //estén donde estén (consola, fichero, cadena...)
        //2.Posibilidades de recorrido con el Scanner
        //3.Posibilidad de tener más de un Scanner
        //4.Algunos métodos y sus acciones por defecto
        File archivo = new File("src/ejemplosusoscanner/datos");
        Scanner entrada = new Scanner(archivo);

        String linea = entrada.nextLine();
        //la variable linea contiene una linea del fichero SIN el caracter salto de linea (\n)
        Scanner leeLinea = new Scanner(linea);
        System.out.println(linea);
        //cambiamos el delimitador
        entrada.useDelimiter(":");
        int numero = entrada.nextInt();

        System.out.println(numero);
        //resetear Scanner
        entrada.reset();
        //en la variable restoLinea nos quedamos el contenido de la linea
        //desde el punto donde se encuente el Scanner hastan el final
        String restoLinea = entrada.nextLine();
        System.out.println(restoLinea);
        /*en este momento el Scanner está al final del archivo,
        si cerramos el sacanner y los volvemos a crear pasando el
        mismo fichero, es scanner vuelve al principio del mismo 
         */
        entrada.close();
        entrada = new Scanner(archivo);
        //mostramos la que en teoria es la primera linea:
        System.out.println("Mostramos la primera línea; " + entrada.nextLine());

    }

}
