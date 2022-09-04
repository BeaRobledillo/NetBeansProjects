package ejemplousoarray;

public class EjemploUsoArray {

    public static void main(String[] args) {
        /*vamos a definir un array(una estructura de tipo objeto capaz de
        contener multiples valors todos del mismo tipo) mediante el uso de 
        una sola variable, un sólo identificador
         */

        //definimos el array q contiene valores decimales
        double arrayNumeros[];
        double horasSemana[];
        int[] numerosEnteros;
        boolean[] arrayDeLaVerdad;

        //inicializamos los arrays(instanciamos)especificando una longitud
        arrayNumeros = new double[9]; //array de 9 posiciones con valores por defecto 0.0
        horasSemana = new double[5]; //array de 5 posiciones con valores por defecto 0.0
        numerosEnteros = new int[8]; //array de 8 posiciones con valores por defecto 0.0
        arrayDeLaVerdad = new boolean[4]; //array de  posiciones con valores por defecto false

        //podemos realizar la inicializacion del array en un sola linea
        //y con valores personalizados
        int[] enteros = {2, 3, 45, 21};

        //para acceder a cada una de las posiciones del array tendremos
        //que especificar un indice cuyo valoor oscila entre 0 y (longitud del array -1)
        horasSemana[0] = 4.5;
        horasSemana[1] = 8.0;
        System.out.println("Contenido de la 1ª posición del array horasSemana: " + horasSemana[0]);

        /* si intentamos ir a una posicion inexistente nos da un error
        java.lang.ArrayIndexOutOfBoundsException
        System.out.println("Contenido de una posición del array inexistente" + horasSemana[17]);
        Existe una manera de saber la longitud del array, q nos será util para recorrerlo iteranodo:
         */
        System.out.println("la longitude del array de las horas de la semana es: " + horasSemana.length);
        for (int i = 0; i < horasSemana.length; i++) {
            System.out.println("Valor de la posición del array horasSemana" + i + ": " + horasSemana[i]);
        }

        //una vez hemos accedido a una posicion del array, las acciones a llevar a cabo
        //son las mismas q con cualquier variable de tipo primitivo
        horasSemana[0] += 1.5;
        System.out.println("Las horas de la primera posición de la semana se incrementa en 1.5: " + horasSemana[0]);

        System.out.println("hola");

    }
}
