package piscina;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Piscina {

    public static void main(String[] args) throws FileNotFoundException {

        float litrosPiscinaV1, litrosBarrenoV1, litrosPierdeV1;
        float litrosPiscinaV2, litrosBarrenoV2, litrosPierdeV2;
        boolean repetir = true;
        String cadena = " ";
        String[] datos;
        float[] datosFloat;

        //variables para leer datos
        File archivo = new File("src/piscina/datos");
        Scanner sca = new Scanner(archivo);
        cadena = sca.nextLine();
        datos = cadena.split(" ");
        if (datos.length != 6) {

        }
        datosFloat = new float[datos.length];
        for (int i = 0; i < datos.length; i++) {
            datosFloat[i] = Float.parseFloat(datos[i]);
        }
        litrosPiscinaV1 = datosFloat[0];
        litrosBarrenoV1 = datosFloat[1];
        litrosPierdeV1 = datosFloat[2];
        litrosPiscinaV2 = datosFloat[3];
        litrosBarrenoV2 = datosFloat[4];
        litrosPierdeV2 = datosFloat[5];

        do {
            litrosPiscinaV1 = litrosPiscinaV1 + (litrosBarrenoV1 - litrosPierdeV1);
            litrosPiscinaV2 = litrosPiscinaV2 + (litrosBarrenoV2 - litrosPierdeV2);

            if (litrosPiscinaV1 < 0 | litrosPiscinaV2 < 0) {//se repetirá hasta que al menos uno sea menor a cero
                repetir = false;
            }
        } while (repetir);

        if (litrosPiscinaV1 == litrosPiscinaV2) {
            System.out.println("Empate");
        } else if (litrosPiscinaV1 > litrosPiscinaV2) {
            System.out.println("Vecino 1");
        } else if (litrosPiscinaV1 < litrosPiscinaV2) {
            System.out.println("Vecino 2");
        }

    }

}
