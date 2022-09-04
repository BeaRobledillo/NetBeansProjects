package losdalton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LosDalton {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/losdalton/datos");
        Scanner entrada = new Scanner(archivo);
        String token = "";
        int numeroDalton = 0;
        int ordenDalton;

        while (entrada.hasNext()) {
            token = entrada.next();
            System.out.println(token);
        }

        // if (true) {
        System.out.println("DALTON");

        // } else {
        System.out.println("DESCONOCIDOS");
        // }

    }

}
