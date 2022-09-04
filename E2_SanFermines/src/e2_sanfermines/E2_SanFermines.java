package e2_sanfermines;

import java.util.Scanner;

public class E2_SanFermines {

    public static void main(String[] args) {
        /*Dada una línea
            1. leemos la cifra que marca la cantidad de toros que aparecen (será mayor o igual a 1)
            2. dada la cantidad del paso 1. realizaremos las siguientes acciones:
                -leemos la velocidad de un toro
                - comprobamos si es la mayor velocidad que ha aparecido hasta ahora EN ESE ENCIERRO
                - actualizamos si es necesario el valor de la mayor velocidad
            3. una vez procesadas todas las velocidades, escribimos por pantalla la mayor velocidad hayada
            7 1 9 8 7 10 3 12
            1 10
         */
        int numeroToros = 0;
        int velocidad = 0;
        int mayorVelocidad;
        Scanner entrada = new Scanner(System.in);
        //INICIO DEL TRATAMIENTO DE MÚLTIPLES ENCIERROS
        do {
            System.out.print("Introduzca la línea que representa el encierro: ");
            //1. leemos la cifra que marca la cantidad de toros que aparecen (será mayor o igual a 1)
            numeroToros = entrada.nextInt();
            //2. dada la cantidad del paso 1. realizaremos las siguientes acciones:
            mayorVelocidad = 0;//Antes de netrar a leer velocidades suponemos que la myor será 0 a la espera de que cambie...
            for (int i = 0; i < numeroToros; i++) {
                /*   -leemos la velocidad de un toro
                - comprobamos si es la mayor velocidad que ha aparecido hasta ahora EN ESE ENCIERRO
                - actualizamos si es necesario el valor de la mayor velocidad*/
                velocidad = entrada.nextInt();
                if (velocidad > mayorVelocidad) {
                    mayorVelocidad = velocidad;
                }
            }
            //3. una vez procesadas todas las velocidades, escribimos por pantalla la mayor velocidad hayada
            System.out.println("La mayor velocidad hayada es: " + mayorVelocidad);
        } while (numeroToros != 0);

        //FIN DEL TRATAMIENTO DE MÚTIPLES ENCIERROS
        //NOTA: PARA PARAR LA EJECUCIÓN, EL USUARIO INTRODUCE UN 0 
        //-SE MOSTRARÁ UN 0 COMO LA MAYOR VELOCIDAD HAYADA CUANDO ACABE...-
    }

}
