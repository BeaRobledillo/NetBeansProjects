package matriculas;

/*Las matrıculas de los automoviles en Espanya estan compuestas por dos partes. La primera consiste
en un numero decimal de 4 d´ıgitos que se va incrementando de uno en uno. Cuando se llega al ultimo
valor (9999), se reinicia la cuenta (en 0000) y se incrementa la segunda parte, que contiene arrayLetras.
Esta segunda parte consiste en tres arrayLetras consecutivas, excluyendo las vocales y la letra Ñ.
tras recorrer todos los numeros, se incrementa la letra, se pasa a la siguiente en el abecedario en la letra
situada mas a la derecha.Si para ella se acaba el abecedario, se vuelve al ˜
principio (B) y se incrementa la anterior con este mismo procedimiento
El ultimo caso de prueba, que no debera procesarse, contendra la ultima matrıcula posible, 9999 ZZZ.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Matriculas {

    //metodo para ir avanzando las letras
    public static char avanzarLetra(char letra) {

        char[] arrayLetras = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'}; //array con las 21 letras q se usan
        int posicion = 0;

        for (int i = 0; i < 21; i++) {

            if (letra == arrayLetras[i]) {
                posicion = i;
            }

        }

        if (arrayLetras[posicion] == 'Z') { //si llega a la Z vuelve a la posicion 0 (B)

            return arrayLetras[0];

        } else {

            return arrayLetras[posicion + 1];
        }

    }//fin metodo

    //main
    public static void main(String[] args) throws FileNotFoundException {

        //variables para leer datos
        File archivo = new File("src/matriculas/datos");
        Scanner entrada = new Scanner(archivo);

        //variables
        //4 numeros y 3 letras de matricula 
        String numerosMatricula;
        String letrasMatricula;
        int matriculaNumero;
        char[] matriculaChar = new char[3]; //array de 3 letras de la matricula

        //siguiente
        numerosMatricula = entrada.next();
        letrasMatricula = entrada.next();

        //recorrer matriculas
        while (!(numerosMatricula.equals("9999") && letrasMatricula.equals("ZZZ"))) { //este caso no hay que procesarlo

            matriculaNumero = Integer.parseInt(numerosMatricula);//parseos de tipos
            matriculaNumero++;
            numerosMatricula = String.valueOf(matriculaNumero);

            if (matriculaNumero > 9999) {

                numerosMatricula = "0000";

                for (int i = 0; i < letrasMatricula.length(); i++) {

                    matriculaChar[i] = letrasMatricula.charAt(i);

                }

                matriculaChar[2] = avanzarLetra(letrasMatricula.charAt(2)); //llamada al metodo para ir avanzando letras (3)

                if (matriculaChar[2] == 'B') {

                    matriculaChar[1] = avanzarLetra(letrasMatricula.charAt(1));

                    if (matriculaChar[1] == 'B') {

                        matriculaChar[0] = avanzarLetra(letrasMatricula.charAt(0));

                    }

                }

            }

            if (numerosMatricula.equals("0000")) {

                System.out.print(numerosMatricula + " ");

                for (int i = 0; i < 3; i++) {
                    System.out.print(matriculaChar[i]);
                }

                System.out.println("");

            } else {
                //mostrar matriculas completas
                System.out.printf("%04d %s", matriculaNumero, letrasMatricula + " ");
                System.out.println(" ");

            }

            //limpiar buffer
            numerosMatricula = entrada.next();
            letrasMatricula = entrada.next();

        }//fin bucle

    }//fin main

}//fin clase Matriculas
