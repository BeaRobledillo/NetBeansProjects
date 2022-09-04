package ejercicioholamundo;

/*
Escribir un programa que escriba tantos “hola mundo” como nos pidan.
Entre 0 y 5
 */
import java.util.Scanner;

public class EjercicioHolaMundo {

    public static void main(String[] args) {
        //1.introducimos y validamos una cifra entre o y 5
        int numero = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Cúantas veces quieres que se repita? (entre 0 y 5 veces): ");
            numero = entrada.nextInt();

        } while ((numero < 0) || (numero > 5));
        //2.Mostramos la frase tantas veces como nos ha pedido el usuario
       
        for (int i = 0; i < numero; i++) {
            System.out.println("Hola Mundo! ");
        }
         
    }

}
