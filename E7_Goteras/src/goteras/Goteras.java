package goteras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Goteras {

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/goteras/datos");
        Scanner entrada = new Scanner(archivo);
        int casos;
        int gotas;
        int horas, minutos, segundos;
    
        casos = entrada.nextInt();
        for (int i = 0; i < casos; i++) {
            gotas = entrada.nextInt();
           
            horas = gotas / 3600;
            minutos = (gotas % 3600) / 60;
            segundos = ((gotas % 3600) / 60) % 60;
            System.out.printf("0%1$d : 0%2$d : 0%3$d \n", horas ,minutos,segundos);
        }
    }

}
