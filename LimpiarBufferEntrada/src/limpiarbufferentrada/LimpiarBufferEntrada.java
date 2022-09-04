package limpiarbufferentrada;

import java.util.Scanner;

public class LimpiarBufferEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        int calzado;
        System.out.println("Introduzca su edad, por favor:");
        edad = entrada.nextInt();

        //limpiamos Buffer//////////////////
        entrada.nextLine(); //conseguimos que "\n" se deseche
        //////////////////////////////////////////////////////

        System.out.println("Introduzca su nombre, por favor:");
        nombre = entrada.nextLine();

        System.out.println("Introduzca su número de calzado, por favor:");
        calzado = entrada.nextInt();

        System.out.println("Su edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su calzado es: " + calzado);

    }

}
