/*
 
 */
package sanfermines;

import java.util.Scanner;

public class SanFermines {
    
    public static void main(String[] args) {
        
        int numeroToros = 0;
        int velocidad = 0;
        int mayorVelocidad = 0;
        Scanner entrada = new Scanner(System.in);
        do {            
            System.out.print("Introduzca la línea que representa el encierro: ");
        numeroToros = entrada.nextInt();
        for (int i = 0; i < numeroToros; i++) {
            velocidad = entrada.nextInt();
            if (velocidad > mayorVelocidad) {
                mayorVelocidad = velocidad;
            }
        }
        System.out.println("La mayor velocidad hayada es: " + mayorVelocidad);
        } while (numeroToros!=0);
        
    }
    
}
