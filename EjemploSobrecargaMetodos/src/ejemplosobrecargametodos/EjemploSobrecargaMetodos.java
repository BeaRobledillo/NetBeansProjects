package ejemplosobrecargametodos;

public class EjemploSobrecargaMetodos {

    public static int max(int num1, int num2) {
        System.out.println("\tEstamos en el método que recibe enteros");
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        System.out.println("\tEstamos en el método que recibe doubles");
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    /* LIBERAR DEL COMENTARIO LOS DOS MÉTODOS DE ABAJO PARA VER UN EJEMPLO DE INVOCACIÓN AMBIGUA:*/
    public static double max(double num1, int num2) {
        System.out.println("\tEstamos en el método que recibe enteros");
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static double max(int num1, double num2) {
        System.out.println("\tEstamos en el método que recibe doubles");
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }


    public static void main(String[] args) {
        System.out.println("Llamada con enteros 8 y 9 devuelve: "
                + max(8, 9));
        System.out.println("Llamada con doubles 4,56 y 5,68 devuelve: "
                + max(4.56, 5.68));
        System.out.println("Llamada con un entero y un double: " + max(2, 3.5));
    }

}
