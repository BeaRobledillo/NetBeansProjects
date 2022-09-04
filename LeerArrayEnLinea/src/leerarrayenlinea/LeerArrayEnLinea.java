package leerarrayenlinea;

import java.util.Scanner;

public class LeerArrayEnLinea {

    /*Este ejemplo ilustra cómo podemos leer los elementos de una array
     en una sola línea*/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] arrayCosas;
        System.out.print("Introduzca los elementos del array en una sola línea: ");
        //El método split() busca el patrón pasado como parámetro en el
        //String sobre el que se ejecuta y corta el String en partes:
        arrayCosas = entrada.nextLine().split(" ");
        //el metodo split tiene en cuenta lo que se le indica
        //corta los espacios en blanco, en este caso
        
        for (int i = 0; i < arrayCosas.length; i++) {
            System.out.println(arrayCosas[i]);

        }
    }

}
