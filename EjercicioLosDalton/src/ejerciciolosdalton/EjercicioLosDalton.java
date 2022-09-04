package ejerciciolosdalton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//no funca
public class EjercicioLosDalton {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ejerciciolosdalton/datos");
        Scanner entrada = new Scanner(archivo);

        long numPersonas = entrada.nextLong();
        String son = "DALTON";
        long a;
        long b;

        a = entrada.nextLong();
        b = entrada.nextLong();

        if (a > b) {

            numPersonas--;
            a = b;

            while (numPersonas > 1) {

                b = entrada.nextLong();

                if (a > b) {

                    numPersonas--;
                    a = b;

                } else {

                    son = "DESCONOCIDOS";
                    entrada.nextLine();
                    son = "DESCONOCIDOS";

                }

            }

        } else if (a < b) {

            numPersonas--;
            a = b;

            while (numPersonas > 1) {

                b = entrada.nextLong();

                if (a < b) {

                    numPersonas--;
                    a = b;

                } else {

                    son = "DESCONOCIDOS";
                    entrada.nextLine();
                    son = "DESCONOCIDOS";

                }

            }

        } else {

            son = "DESCONOCIDOS";
            entrada.nextLine();
            son = "DESCONOCIDOS";
        }

        son = "DESCONOCIDOS";

    }

}
