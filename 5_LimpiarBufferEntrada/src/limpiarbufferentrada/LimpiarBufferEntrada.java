package limpiarbufferentrada;

import java.util.Scanner;

public class LimpiarBufferEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        int calzado;
        
        System.out.println("Introduzca su edad, por favor");
        edad = entrada.nextInt();
        /*Si introducimos 22 por ejemplo, 
        a nivel interno estamo introduciendo 
        la cifra seguida del retorno de carro 22\n
        Después de la ejecución del método nextInt(), el valor de edad introducido (22) se almacena en la variable
        pero el Scanner se queda delante de la cadena "\n" que supone un cambio de línea.
        Al decir al scanner que lo próximo que tiene que leer en de tipo cadena, en la variable nombre se almacena 
        automáticamente la cadena de salto de línea y eso provoca que no nos pregunte el nombre.
         */
        ///////////////////////////////////LIMPIAMOS BUFFER////////////////////////////////////////////
        entrada.nextLine();//con esto conseguims que "\n" se deseche
        ///////////////////////////////////LIMPIAMOS BUFFER////////////////////////////////////////////
        System.out.println("Introduzca su nombre: ");
        nombre = entrada.nextLine();
        
        //después de la introducción de un dato numércio no es necesario limpiar el buffer:
        System.out.println("Introduzca el número de calzado: ");
        calzado = entrada.nextInt();
        
        System.out.println("Su edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su número de calzado es: " + calzado);

    }
}
