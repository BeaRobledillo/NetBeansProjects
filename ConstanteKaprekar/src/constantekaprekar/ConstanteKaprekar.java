package constantekaprekar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConstanteKaprekar {

    static final int KAPREKAR = 6174;

    //metodo para recorrer los pasos
    public static int kaprekarPasos(int numero) {
        int pasos;

        if (numero % 1111 == 0) { //Para los numeros repdigits debera escribir 8
            pasos = 8;
        } else if (numero == KAPREKAR) { //sie el numero es 6174 es el kaprekar
            pasos = 0;
        } else {
            //array de 4 numeros
            int[] digitos = new int[4];
            int maximo = 0;
            int minimo = 0;

            for (int i = 0; i < 4; i++) {
                digitos[i] = numero / ((int) Math.pow(10, 3 - i));
                numero %= (int) Math.pow(10, 3 - i);
            }

            //llamada a metodo q ordena los numeros 
            ordenarNumeros(digitos);

            for (int i = 0; i < 4; i++) {
                maximo += (digitos[i] * (int) Math.pow(10, 3 - i));
            }

            while (maximo < 1000) {
                maximo *= 10;
            }

            //llamada al metodo q pone los numeros a la inversa
            inversaNumeros(digitos);

            for (int i = 0; i < 4; i++) {
                minimo += (digitos[i] * Math.pow(10, 3 - i));
            }

            int resultado = maximo - minimo;

            if (resultado == KAPREKAR) {
                pasos = 1;
            } else {
                pasos = 1 + kaprekarPasos(resultado);
            }
        }

        return pasos;
    }

    //metodo que ordena los numeros normal
    public static void ordenarNumeros(int[] digitos) {
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (digitos[j] > digitos[i]) {
                    digitos[i] = digitos[i] + digitos[j];
                    digitos[j] = digitos[i] - digitos[j];
                    digitos[i] = digitos[i] - digitos[j];
                }
            }
        }
    }

    //metodo que ordena los numeros a la inversa
    public static void inversaNumeros(int[] digitos) {
        //array auxiliar de 4 numeros
        int[] arrayAuxiliar = new int[4];

        System.arraycopy(digitos, 0, arrayAuxiliar, 0, 4);

        for (int i = 0; i < 4; i++) {
            digitos[i] = arrayAuxiliar[3 - i];
        }
    }

    //main
    public static void main(String[] args) throws FileNotFoundException {
        //variables
        File archivo = new File("src/constantekaprekar/datos");
        Scanner entrada = new Scanner(archivo);
        int casos;
        int numero;
        //limpiamos buffer
        casos = entrada.nextInt();

        //bucle for para recorrer datos de entrada (casos)
        for (int i = 0; i < casos; i++) {
            numero = entrada.nextInt();
            System.out.println(kaprekarPasos(numero));
        }
    }

}
