package introduccionexcepciones;

import java.util.Scanner;

public class IntroduccionExcepciones {

    /**
     * Este método se encarga de "controlar" la división por cero y en el caso
     * de darse tal situación, finaliza la ejecución
     *
     * @param numero1
     * @param numero2
     * @return
     */
    public static int cociente(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("El divisor no puede ser 0...");
        }
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Pedimos al usuario que introduzca dos entero
        System.out.println("Introduzca dos enteros");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        try {
            int result = cociente(numero1, numero2);
            System.out.println(numero1 + " / " + numero2 + " = "
                    + (numero1 / numero2));
        }catch(ArithmeticException ex){
            System.out.println("Se ha producido una excepción, pero el programa sigue...");
        }
        System.out.println("El programa sigue en esta línea");

    }

}
