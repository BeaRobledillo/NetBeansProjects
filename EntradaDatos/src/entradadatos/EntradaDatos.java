package entradadatos;

//importamos clase Scanner de java
import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {
        //Declaramos una variable de tipo Scanner para poder leer  datos del usuario
        Scanner entrada;
        java.util.Scanner salida;

        //inicialización de clase Scanner
        entrada = new Scanner(System.in); //leer lo que el usuario introduzca

        //declaracion e inicializacion de la variable numero
        int numero = 0;
        /*vamos a leer una cifra del usuario por teclado*/
        System.out.print("Ingrese una cifra por favor: ");
        numero = entrada.nextInt();

        //mostrar la cifra por pantalla
        System.out.println("La cifra introducida es: " + numero);

        numero = entrada.nextInt();
        System.out.println("La cifra introducida es: " + numero);

    }

}
