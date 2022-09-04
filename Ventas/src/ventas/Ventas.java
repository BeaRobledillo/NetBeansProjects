package ventas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ventas {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/ventas/datos");
        Scanner entrada = new Scanner(archivo);
        double numero;
        double minimo;
        double maximo;
        double suma;
        int minindex;
        int maxindex;
        //int auxiliar;

        numero = entrada.nextDouble();
        String nextLine;
        nextLine = entrada.nextLine();

        while (numero > 0) {
            System.out.printf("%.2f \n", numero);
            if (numero == -1) {
                //return 0;
            }
            minimo = numero;
            minindex = 0;
            maximo = numero;
            maxindex = 0;
            suma = numero;
            for (int i = 1; i < 6; i++) {
                System.out.printf("%.2f \n", numero);
                if (numero < minimo) {
                    minimo = numero;
                    minindex = i;
                    System.out.println("");
                } else if (numero > maximo) {
                    maximo = numero;
                    maxindex = i;
                }
                suma = suma + numero;
            }
            switch (maxindex) {
                case 0:
                    System.out.println("MARTES ");
                    break;
                case 1:
                    System.out.println("MIERCOLES ");
                    break;
                case 2:
                    System.out.println("JUEVES ");
                    break;
                case 3:
                    System.out.println("VIERNES ");
                    break;
                case 4:
                    System.out.println("SABADO ");
                    break;
                default:
                    System.out.println("DOMINGO ");
                    break;
            }
            switch (minindex) {
                case 0:
                    System.out.println("MARTES ");
                    break;
                case 1:
                    System.out.println("MIERCOLES ");
                    break;
                case 2:
                    System.out.println("JUEVES ");
                    break;
                case 3:
                    System.out.println("VIERNES ");
                    break;
                case 4:
                    System.out.println("SABADO ");
                    break;
                default:
                    System.out.println("DOMINGO ");
                    break;
            }
            if (numero > suma / 6) {
                System.out.println("SI\n");
            } else {
                System.out.println("NO\n");
            }

        }
        //return 0;
        return 0;

    }
}
