package e2_sanferminesfichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E2_SanFerminesFichero {

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/e2_sanferminesfichero/datos");
        Scanner entrada = new Scanner(archivo);

        int numeroToros = 0;
        int velocidad = 0;
        int mayorVelocidad;

        while (entrada.hasNext()) { //se va susutituyendo x true o false
            numeroToros = entrada.nextInt();

            mayorVelocidad = 0;
            for (int i = 0; i < numeroToros; i++) {

                velocidad = entrada.nextInt();
                if (velocidad > mayorVelocidad) {
                    mayorVelocidad = velocidad;
                }
            }

            System.out.println(mayorVelocidad);
        }
    }

}
