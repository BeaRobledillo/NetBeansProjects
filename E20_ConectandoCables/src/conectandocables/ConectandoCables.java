package conectandocables;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConectandoCables {
    public static void procesaCaso(int cables, String linea){
        int contadorH = 0;
        int contadorM = 0;
        String[] letras;
        linea = linea.replace(" ", "");     //quitamos espacios de la línea
        letras = linea.split("");           //cortamos cada letra y la almacenamos en un array
        for(String letra : letras){
            if(letra.equals("H")){
                contadorH++;
            }
            if(letra.equals("M")){
                contadorM++;
            }
        }
       if(contadorH == contadorM){
           System.out.println("POSIBLE");
       }else{
           System.out.println("IMPOSIBLE");
       }
    }
    public static void leerCaso(Scanner entrada) {
        int numeroCables = entrada.nextInt();
        //limpiar buffer!!!
        entrada.nextLine();
        String lineaCables = entrada.nextLine();
        procesaCaso(numeroCables,lineaCables);
    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/conectandocables/datos");
        Scanner entrada = new Scanner(archivo);
        int numeroCasos = entrada.nextInt();

        for (int i = 0; i < numeroCasos; i++) {
            leerCaso(entrada);
        }

    }

}
