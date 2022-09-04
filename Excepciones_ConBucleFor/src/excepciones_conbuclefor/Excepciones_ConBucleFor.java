package excepciones_conbuclefor;

public class Excepciones_ConBucleFor {

    public static void metodo1() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Mostramos el valor del índice del bucle: " + i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception e) {
                System.out.println("Se produjo un error y estamos en el bloque catch");
            }
            /*tras la ejecución de las sentencias del bloque catch, la aplicación sigue su curso. Al tratarse de un bucle
            se produce la ejecución de la siguiente iteración, si es que existe*/
        }
    }

    public static void metodo2() {
        /*En este ejemplo al producirse el error dentro del cuerpo del bucle, y al estar el bucle incluído en el cuerpo del bloque try,
        debemos tener en cuenta que el resto de sentencias de las iteraciones que resten por ejecutarse no se ejecutan:
        
        EN EL MOMENTO EN EL QUE SE PRODUCE UNA EXCEPCIÓN, TODO LO DEMÁS DEL BLOQUE try NO SE EJECUTA*/
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Mostramos el valor del índice del bucle: " + i + " ");
                System.out.println(1 / 0);
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error y estamos en el bloque catch");
        }
    }

    public static void main(String[] args) {
        metodo2();
    }

}
