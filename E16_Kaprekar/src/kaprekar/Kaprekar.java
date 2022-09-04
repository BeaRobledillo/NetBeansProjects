package kaprekar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Kaprekar {

    /*Este método rellena con ceros de forma muy artesanal y perdiendo el debido tiempo...*/
    public static String completaCeros(int numero) {
        int contador = 0;
        String result = "";
        while (numero % 10 != 0) {
            numero /= 10;
            contador++;
        }
        for (int i = 0; i < contador; i++) {
            result += "0";
        }
        return result;
    }

    /*Este método comprueba si la cifra leída tiene al menos dos digitos diferentes*/
    public static boolean cifraValida(String[] cifraLeida) {
        String digito;
        for (int i = 0; i < cifraLeida.length; i++) {
            digito = cifraLeida[i];
            for (int j = i + 1; j < cifraLeida.length; j++) {
                if (cifraLeida[i].equals(cifraLeida[j]) == false) {//si se cumple esto tenemos dos dígitos diferentes
                    return true;
                }
            }
        }
        return false;
    }

    /*Invertimos las cifras de un número recibido*/
    public static int invertir(int numero) {
        int result = 0;
        int factorMultiplicación = 1000;
        while (numero % 10 != 0) {
            result += (numero % 10) * factorMultiplicación;
            numero /= 10;
            factorMultiplicación /= 10;
        }
        return result;
    }

    /*Este método extrae las cifras de un array de char y las convierte a un entero*/
    public static int convierteCifra(char[] arrayChar) {
        int factorMulti = 1000;
        int result = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            result += Integer.parseInt(String.valueOf(arrayChar[i])) * factorMulti;
            factorMulti /= 10;
        }
        return result;

    }

    public static char[] ordena(String[] arrayCadena, char sentido) {
        char[] arrayChar = new char[arrayCadena.length];
        for (int i = 0; i < arrayCadena.length; i++) {
            arrayChar[i] = arrayCadena[i].charAt(0);
        }
        Arrays.sort(arrayChar);

        return arrayChar;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/kaprekar/datos");
        Scanner entrada = new Scanner(archivo);
        int numeroCifras = entrada.nextInt();
        String[] cifraArray;
        int cifraMenor;
        int cifraMayor;
        int numero;
        int contador = 0;
        String cadenaPreviaArray;
        entrada.nextLine();//Limpiamos buffer
        for (int i = 0; i < numeroCifras; i++) {
            cadenaPreviaArray = entrada.nextLine();
            //Si leemos del archivo "6174" debemos ofrecer como salida un "0"
            if (!(cadenaPreviaArray.equals("6174"))) {

                cifraArray = cadenaPreviaArray.split("");
                numero = 0;
                contador = 0;

                do {
                    if (cifraValida(cifraArray)) {//evita procesar repdigits de obtenidos de cálculos o leídos de fichero
                        contador++;
                        cifraMenor = convierteCifra(ordena(cifraArray, 'a'));
                        cifraMayor = invertir(cifraMenor);
                        numero = cifraMayor - cifraMenor;
                        //ahora pasamos de número a cifraArray
                        //Si la cifra es menor a 1000 necesitamos completar con tantos ceros como necesitemos a la derecha
                        if (numero < 1000) {
                            cifraArray = (completaCeros(numero) + String.valueOf(numero)).split("");
                            //Esta alternativa para rellenar con ceros es mucho mejor:
                            //String letra =String.format("%04d",resta);
                        } else {
                            cifraArray = String.valueOf(numero).split("");
                        }
                    } else {
                        contador = 8;
                        break;
                    }
                } while (numero != 6174);
                System.out.println(contador);
            } else {
                System.out.println("0");
            }
        }
    }
}