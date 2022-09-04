package conectandocables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConectandoCables {

    public static void procesaCaso(int cables, String linea) {
        int contadorH = 0;
        int contadorM = 0;
        String[] letras;
        linea = linea.replace(" ", "");     //quitamos espacios de la línea
        letras = linea.split("");           //cortamos cada letra y la almacenamos en un array
        for (String letra : letras) {
            if (letra.equals("H")) {
                contadorH++;
            } else {
                if (letra.equals("M")) {
                    contadorM++;
                }else{
                    System.out.println("Cable Incorrecto: no se encontró una especificación válida(HH,HM,MH,MM): revise su archivo de datos");
                    //En este punto podríamos crear un objeto de tipo excepción (de una clase existente o de un tipo personalizado) y completar
                    //la información que ofrecemos sobre la imposibilidad o posibilidad de formar un círculo con los cables debido a una malformación de al menos uno de los
                    //cables del caso de prueba
                }
            }
        }
        if (contadorH == contadorM) {
            System.out.println("POSIBLE");
        } else {
            System.out.println("IMPOSIBLE");
        }
    }

    public static void leerCaso(Scanner entrada) {
        int numeroCables = entrada.nextInt();
        //limpiar buffer!!!
        entrada.nextLine();
        String lineaCables = entrada.nextLine();
        procesaCaso(numeroCables, lineaCables);
    }

    public static void main(String[] args) {
        File archivo = new File("src/conectandocables/datos");
        Scanner entrada = null;
        int numeroCasos = 0;
        try {
            entrada = new Scanner(archivo);
            numeroCasos = entrada.nextInt();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo especificado...");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inesperada: se esperaba un entero revise su archivo de datos...");
        }
        for (int i = 0; i < numeroCasos; i++) {
            try {
                leerCaso(entrada);
            } catch (InputMismatchException e) {
                System.out.println("Se produjo un error en el número de cables, revise su archivo de datos");
                entrada.nextLine();//tratamos de pasar al siguiente caso de prueba, nos saltamos la linea en la que se esperaba entero
                entrada.nextLine();//tratamos de pasar al siguiente caso de prueba, nos saltamos la línea donde se especificaba combinaciones Macho-Hembra
            }
        }

    }
}
