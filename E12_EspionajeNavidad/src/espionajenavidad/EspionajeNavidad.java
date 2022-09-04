package espionajenavidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EspionajeNavidad {

    /*Tenemos un método que realiza búsquedas entre dos cadenas*/
    public static void encriptarConCadenas(String linea) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < linea.length(); i++) {
            if (linea.charAt(i) == ' ') {
                System.out.print(linea.charAt(i));
                continue;
            }
            for (int j = 0; j < alfabeto.length(); j++) {//buscamos en todo el alfabeto

                if (linea.charAt(i) == alfabeto.charAt(j)) {
                    if (linea.charAt(i) == 'Z') {
                        System.out.print("A");
                    } else {
                        System.out.print(alfabeto.charAt(j+1));
                    }
                }

            }            
        }
        System.out.println("");
    }


    /*Tenemos un método que realiza búsquedas en un array de char*/
    public static void encriptar(String linea) {
        char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        /*ejecutamos el método toCharArray para pasar de una cadena*/
 /*"Esto es una cadena"-->pasamos a un array de char:{'E','s','t','o','','e','s'}*/
        char[] lineaChar = linea.toCharArray();
        for (int i = 0; i < lineaChar.length; i++) {//recorremos la línea carácter a carácter

            if (lineaChar[i] == ' ') {
                System.out.print(lineaChar[i]);
                continue;
            }
            for (int j = 0; j < alfabeto.length; j++) {//buscamos en todo el alfabeto

                if (lineaChar[i] == alfabeto[j]) {
                    if (lineaChar[i] == 'Z') {
                        System.out.print("A");
                    } else {
                        System.out.print(alfabeto[j + 1]);
                    }
                }

            }
        }

        //dado un carácter, devolvemos el siguiente según la posición que ocupa el carácter leído en el paso anterior en el array alfabeto
        //al finalizar la línea el método acaba
        System.out.println("");
    }

    //1. leer fichero
    public static void leerFichero(Scanner entrada, String linea) {
        linea = entrada.nextLine();
        do {
            //  1.2 leer línea a línea
            encriptar(linea);
            encriptarConCadenas(linea);//Si no queremos que la salida se duplique, comentar una de estas dos llamadas
            linea = entrada.nextLine();
        } while (!(linea.equals("FIN")));

    }

    public static void main(String[] args) throws FileNotFoundException {

        //  1.1 leer carácter a carácter
        //  1.2 leer línea a línea
        //2. transformar cada letra a la que aparece como siguiente en el alfabeto definido
        File archivo = new File("src/espionajenavidad/datos");
        Scanner entrada = new Scanner(archivo);
        String linea = "";

        leerFichero(entrada, linea);

    }

}
