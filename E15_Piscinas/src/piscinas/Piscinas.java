package piscinas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Piscinas {

    public static void leerArchivo(Scanner entrada, int[] piscina) {


        do {

            for (int i = 0; i < piscina.length; i++) {
                piscina[i] = entrada.nextInt();
            }
            if ((piscina[0] != 0) || (piscina[3] != 0)) {

                comprobarViajes(piscina);
            }
        } while ((piscina[0] != 0) && (piscina[3] != 0));

    }

    public static void comprobarViajes(int piscina[]) {

        int viajesYo = 0;
        int viajesVecino = 0;
        int litros = 0;
        boolean miPiscinaLlena = false;
        boolean piscinaVecinoLlena = false;

        if (piscina[2] < piscina[1]) {
            while (litros < piscina[0]) {
                litros += piscina[1];
                litros -= piscina[2];
                viajesYo++;

            }
            miPiscinaLlena = true;
        }
        litros = 0;
        if (piscina[5] < piscina[4]) {
            while (litros < piscina[3]) {
                litros += piscina[4];
                litros -= piscina[5];
                viajesVecino++;

            }
            piscinaVecinoLlena = true;
        }
        comprobarGanador(viajesVecino, viajesYo, miPiscinaLlena, piscinaVecinoLlena);
    }

    public static void comprobarGanador(int viajesVecino, int viajesYo,
            boolean miPiscinaLlena, boolean piscinaVecinoLlena) {
        String ganador = "";
        int viajes = 0;
        if (miPiscinaLlena == true && piscinaVecinoLlena == true) {
            if (viajesYo > viajesVecino) {
                ganador = "Vecino";
                viajes = (int) viajesVecino;
            } else if (viajesYo < viajesVecino) {
                ganador = "Yo";
                viajes = (int) viajesYo;
            } else {
                ganador = "Empate";
                viajes = (int) viajesYo;
            }
        } else if (miPiscinaLlena == true && piscinaVecinoLlena == false) {
            ganador = "Yo";
            viajes = (int) viajesYo;
        } else if (miPiscinaLlena == true && piscinaVecinoLlena == false) {
            ganador = "Vecino";
            viajes = (int) viajesVecino;
        } else {
            ganador = "Nadie ha logrado llenar la piscina";
            viajes = (int) viajesYo;
        }

        System.out.println(ganador + " " + viajes);

    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/piscinas/datos");
        Scanner entrada = new Scanner(archivo);

        int[] piscina = new int[6];
        // while (entrada.hasNext()) {

        leerArchivo(entrada, piscina);

        //}
    }

}
