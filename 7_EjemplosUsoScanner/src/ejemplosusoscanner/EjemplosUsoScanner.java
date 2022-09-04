package ejemplosusoscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemplosUsoScanner {

    public static void main(String[] args) throws FileNotFoundException {
        //1. Un Scanner es capaz de recorrer una serie de datos, "estén donde estén" (consola, fichero, cadena,...)
        //2. Posibilidades de recorrido con el Scanner
        //3. Posibilidad de tener más de un Scanner
        //4. Algunos métodos y sus acciones por defecto
        File archivo = new File("src/ejemplosusoscanner/datos");
        Scanner entrada = new Scanner(archivo);

        String linea = entrada.nextLine();//La variable línea contiene una linea del fichero SIN EL CARÁCTER SALTO (\n)
        Scanner leeLinea = new Scanner(linea);
        System.out.println(linea);
        //CAMBIAMOS EL DELIMITADOR
        entrada.useDelimiter(":");
        int numero = entrada.nextInt();
        System.out.println(numero);

        //RESETEAR SCANNER
        entrada.reset();
        //En la variable restoLinea nos quedamos el contenido de la llínea desde el punto donde se encuntre el Scanner
        //hasta el final
        String restoLinea = entrada.nextLine();

        System.out.println(restoLinea);
        /*En este momento el Scanner entrada está al final del archivo, si cerramos el scanner y los volvemos acrear pasando
        el mismo fichero, el scanner vuelve al principio del mismo*/
        entrada.close();
        entrada = new Scanner(archivo);
        //mostramos la que en teoría es la primera línea:
        System.out.println("Mostramos la primera línea: " + entrada.nextLine());

    }

}
