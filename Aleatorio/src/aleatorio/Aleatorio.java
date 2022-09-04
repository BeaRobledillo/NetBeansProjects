package aleatorio;

import java.util.Random;

public class Aleatorio {

    public static void main(String[] args) {
        /*FORMA 1: Mediante el método random() de la clase Math*/
        double aleatorio;
        int aleatorioEntero;
        /*queremos un aleatorio entre 0 y 10*/
        aleatorio = Math.random() * 10;
        aleatorioEntero = (int) aleatorio;
        System.out.println("Aleatorio de tipo double creado: " + aleatorio);
        System.out.println("Redondeo a entero del aleatorio: " + aleatorioEntero);

        /*FORMA 2: Podemos invocar al constructor de la clase Random:*/
        int numeroAlteatorio = new Random().nextInt(11);
        System.out.println("Aleatorio generado mediante la clase Random: " + numeroAlteatorio);
        /*se genera un número aleatorio entre [0,parámetro) */
    }

}
