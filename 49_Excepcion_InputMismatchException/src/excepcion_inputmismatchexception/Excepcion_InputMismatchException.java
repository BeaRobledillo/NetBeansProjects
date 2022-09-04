package excepcion_inputmismatchexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepcion_InputMismatchException {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        do {
            try{
                System.out.println("Introduzca un entero: ");
                int numero = entrada.nextInt();
                
                //Mostramos el resultado
                System.out.println("El número introducido es: " + numero);
                
                continuar = false;
            }catch (InputMismatchException ex){
                System.out.println("Inténtelo de nuevo. (Introduzca un entero)");
                entrada.nextLine();
            }
        } while (continuar);
        
    }

}
