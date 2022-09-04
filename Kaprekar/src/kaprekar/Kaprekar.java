package kaprekar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kaprekar {

    // metodo que devuelve un numero ordenado ascendente
    public static int ordenAscendente(int numero) {

        int digitos = 0;
        int auxiliar = 0;
        int ordenado = 0;

        for (int i = 0; i <= 9; i++) {

            auxiliar = numero;

            while (auxiliar > 0) {

                // el ultimo valor del numero
                digitos = auxiliar % 10;

                // comparar para ordenar
                if (digitos == i) {
                    ordenado = (ordenado * 10) + digitos;
                }

                auxiliar /= 10;

            }

        }

        //devuelve el numero ordenado ascendente
        return ordenado;

    }

    // metodo que devuelve un numero ordenado en descendente
    public static int ordenDescendente(int numero) {

        int digitos = 0;
        int auxiliar = 0;
        int ordenado = 0;

        for (int i = 9; i >= 0; i--) {

            auxiliar = numero;

            while (auxiliar > 0) {

                digitos = auxiliar % 10;

                if (digitos == i) {
                    ordenado = (ordenado * 10) + digitos;
                }

                auxiliar /= 10;

            }

        }

        //devuelve el numero ordenado descendente
        return ordenado;

    }

    //main
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        File archivo = new File("src/kaprekar/datos");
        try (Scanner entrada = new Scanner(archivo)) {
            int casos;
            int numero;
            int iteraciones;
            int KAPREKAR = 6174;
            int desc;
            int asc;

            casos = entrada.nextInt();

            //bucle for para recorrer los casos de entrada
            for (int i = 0; i < casos; i++) {

                iteraciones = 1;

                //limpiamos buffer
                numero = entrada.nextInt();

                /*si el numero ya es la constante KAPREKAR mostramos 0, ya que es 6174 y Para la propia constante
               de Kaprekar debera indicar 0.*/
                switch (numero) {
                    case 6174:
                        iteraciones = 0;
                        break;
                    case 0:
                        /* si el numero es 0, Los unicos dıgitos de cuatro cifras para los que la rutina de Kaprekar no alcanza el numero 6174 
                        son los repdigits, es decir aquellos cuyas cuatro cifras son iguales, devolvemos 8 porque Para los numeros repdigits debera escribir 8.*/
                        iteraciones = 8;
                        break;
                    default:
                        //mientras el numero no sea ni 0 ni 6174
                        while (numero < 1000) {
                            numero *= 10;
                        }
                        //llamada a metodos para ordenar numero
                        desc = ordenDescendente(numero);
                        asc = ordenAscendente(numero);
                        KAPREKAR = desc - asc;

                        //si el numero es 0 
                        if (KAPREKAR == 0) {

                            iteraciones = 8;

                        } else {

                            //son como mucho 7 iteraciones
                            while (KAPREKAR != 6174 && iteraciones < 8) {

                                iteraciones++;

                                //llamada al metodo para ordenar numero
                                desc = ordenDescendente(KAPREKAR);

                                while (desc < 1000) {
                                    desc *= 10;
                                }

                                //llamada al metodo para ordenar numero
                                asc = ordenAscendente(KAPREKAR);

                                KAPREKAR = desc - asc;

                            }

                        }
                        break;
                }

                /*mostrar numero de vueltas que se debe dar a la rutina de
                Kaprekar para alcanzar el 6174*/
                System.out.println(iteraciones);

            }
        }

    }

}
