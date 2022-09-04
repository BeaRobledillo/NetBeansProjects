package pistasaterrizaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Estrategia: leemos la línea Para el número: si es menor desde 0 hasta menor o
 * igual a 18 le sumamos 18 si no le restamos 18 Para la letra: Si existe y si
 * la letra es L devolvemos R y viceversa
 *
 */
public class PistasAterrizaje {

    public static void sacaResultado(String pista, String letra) {
        int pistaNumero = Integer.parseInt(pista);
        if ((pistaNumero >= 0) && (pistaNumero <= 18)) {
            pistaNumero += 18;
            System.out.print(pistaNumero);
        } else {
            if ((pistaNumero >= 19) && (pistaNumero <= 36)) {
                pistaNumero -= 18;
                if (pistaNumero <= 9) {
                    System.out.print("0" + pistaNumero);
                } else {
                    System.out.print(pistaNumero);
                }

            }
        }
        if (letra != null) {

            if (letra.equals("L")) {
                System.out.print("R");
            } else {
                if (letra.equals("R")) {
                    System.out.print("L");
                } else {
                    System.out.println(letra);
                }
            }
        }
        System.out.println("");
    }

    public static void parseaLinea(String lineaLeida) {
        String pista = "";
        String letra = "";
        //cogemos los dos primeros caracteres (debido a la codificación 01,02,...10, etc siempre los dos primeros serán cifras)
        //debemos comprobar si existe letra
        if (lineaLeida.length() > 2) {
            pista = lineaLeida.substring(0, 2);
            letra = lineaLeida.substring(2, 3);
        } else {
            pista = lineaLeida.substring(0, 2);
            letra = null;
        }
        sacaResultado(pista, letra);

    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/pistasaterrizaje/datos");
        Scanner entrada = new Scanner(archivo);
        String linea;

        while (entrada.hasNextLine()) {
            //leemos la linea
            linea = entrada.nextLine();
            parseaLinea(linea);

        }
    }

}
