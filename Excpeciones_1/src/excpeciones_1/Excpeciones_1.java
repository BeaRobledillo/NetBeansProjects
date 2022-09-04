package excpeciones_1;

import java.util.Scanner;

public class Excpeciones_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            int valor = entrada.nextInt();
            if (valor < 40) {
                /*en este punto creamos y lanzamos un objeto de tipo ArithmeticException */
                throw new ArithmeticException("El tipo de error creado es de tipo Arithmetico....!!!!");
            }
            /*En el bloque catch debemos capturar una excepción del tipo de error recogido, O BIEN DE TIPO COMPATIBLE*/
             /*es decir, recogemos un objeto error de tipo Exception o de una de las clases que derivan de Exception*/
            /*Gracias a la aplicación del polimorfismo, podemos esperar un error de tipo Exception y que se nos de un error de tipo ArithmeticException*/
        } catch (Exception ex) {
            //Mediante el método getMessage() devolvemos el valor del atributo String
            //pasado al constructor para la creación del objeto de tipo excepción
            System.out.println(ex.getMessage());
        }
        System.out.println("Continuamos después del catch");
    }

}
