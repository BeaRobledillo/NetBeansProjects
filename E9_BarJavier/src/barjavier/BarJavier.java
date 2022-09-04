package barjavier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BarJavier {

    public static String sacaDiaSemana(int diaSemana) {
        String respuesta = "";

        switch (diaSemana) {
            case 0:
                respuesta = "MARTES";
                break;
            case 1:
                respuesta = "MIÉRCOLES";
                break;
            case 2:
                respuesta = "JUEVES";
                break;
            case 3:
                respuesta = "VIERNES";
                break;
            case 4:
                respuesta = "SÁBADO";
                break;
            case 5:
                respuesta = "DOMINGO";
                break;

        }
        return respuesta;
    }

    public static void compruebaSemana(float[] arrayGanancias) {
        float menor = arrayGanancias[0];
        float mayor = arrayGanancias[0];
        int posicionMenor = 0;
        int posicionMayor = 0;
        for (int i = 1; i < arrayGanancias.length; i++) {
            if (arrayGanancias[i] < menor) {
                menor = arrayGanancias[i];
                posicionMenor = i;
            }
            if (arrayGanancias[i] > mayor) {
                mayor = arrayGanancias[i];
                posicionMayor = i;
            }
        }
        if (menor != mayor) {
            System.out.print(sacaDiaSemana(posicionMayor) + " " + sacaDiaSemana(posicionMenor) + " ");
        } else {
            System.out.print("EMPATE ");
        }

    }

    public static void compruebaDomingo(float[] arrayPasta) {
        float mediaSemana = 0;
        for (int i = 0; i < arrayPasta.length; i++) {
            mediaSemana += arrayPasta[i];
        }
        mediaSemana /= arrayPasta.length;//mediaSemana = mediaSemana / arrayPasta.length-->media / 6
        if (mediaSemana < arrayPasta[arrayPasta.length - 1]) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/barjavier/datos");
        Scanner entrada = new Scanner(archivo);
        boolean entradaIncorrecta = false;
        float[] arrayGanancias = new float[6];
        do {
            for (int i = 0; i < arrayGanancias.length; i++) {
                arrayGanancias[i] = entrada.nextFloat();
                if (arrayGanancias[i] == -1) {
                    entradaIncorrecta = true;
                    break;
                }
            }
            if (!entradaIncorrecta) {
                compruebaSemana(arrayGanancias);
                compruebaDomingo(arrayGanancias);
            }

        } while (!entradaIncorrecta);

    }
}
