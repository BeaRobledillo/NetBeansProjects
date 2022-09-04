package espionajeennavidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EspionajeEnNavidad {

    //metodo para encriptar el alfabeto y pasarlo a la letra siguiente
    public static void encriptar(String linea) {
        //array con el alfabeto (la A tiene index 0 )
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        //recorremos la línea carácter a carácter
        //dado un carácter, devolvemos el siguiente según la posición que ocupa el carácter leído en el paso anterior en el array alfabeto
        //al finalizar la línea el método acaba

        //System.out.println("");
        //necesitamos la posicion de la letra en la linea
        int posicion = 0;
        String lineaEncriptada = "";

        //  1.1 leer carácter a carácter
        //recorremos la longitud de la linea 
        for (int i = 0; i < linea.length(); i++) {

            // posicion = 0;
            for (int j = 0; j < alfabeto.length; j++) {

                if (linea.charAt(i) == alfabeto[j]) {
                    posicion = j;
                }

            }
            //2. transformar cada letra a la que aparece como siguiente en el alfabeto definido
            //si la letra es la Zeta pasa a la A (posicion 0)
            if (alfabeto[posicion] == 'Z') {
                lineaEncriptada += ("" + alfabeto[0]);
            } else if (linea.charAt(i) == ' ') {// si hay un espacio dejar el espacio tb
                lineaEncriptada += " ";
            } else {
                lineaEncriptada += ("" + alfabeto[posicion + 1]);
            }

        }

        //System.out.println(linea); muestra la linea (sin encriptar)
        //mostrar la linea encriptada
        System.out.println(lineaEncriptada);
    }

//1. leer fichero
    public static void leerFichero(Scanner entrada, String linea) {
        do {
            //  1.2 leer línea a línea

            //llamada al metodo encriptar 
            //no hace falta ponerle en el main porque se hace desde aquí
            encriptar(linea);
            linea = entrada.nextLine();
        } while (!(linea.equals("FIN")));

    }

    //metodo main(principal)
    public static void main(String[] args) throws FileNotFoundException {

        //variables 
        File archivo = new File("src/espionajeennavidad/datos");
        Scanner entrada = new Scanner(archivo);
        String linea = "";

        //lamada al metodo leerFichero
        leerFichero(entrada, linea);
        // encriptar(linea); no es necesario llamarlo aqui porque 
        //ser hace en el metodo encriptar dentro del bucle

    }

}
