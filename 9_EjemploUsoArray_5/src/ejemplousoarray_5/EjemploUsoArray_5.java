package ejemplousoarray_5;

public class EjemploUsoArray_5 {

    public static void main(String[] args) {
        /**
         * Este ejemplo ilustra la copia de arrays y las diferentes alternativas
         * que tenemos
         */
        // COPIA DE ARRAY POSICIÓN POR POSICIÓN
        int[] arrayNumeros = {1, 2, 3, 4, 5};
        int[] arrayCopia = new int[5];
        int[] arrayCopiaConMetodo = new int[5];
        int[] arrayClonado = new int[5];

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayCopia[i] = arrayNumeros[i];
            System.out.println("POSICIÓN DE ARRAY ORIGINAL:" + arrayNumeros[i]);
            System.out.println("POSICIÓN DE ARRAY COPIA:" + arrayCopia[i]);
            System.out.println("");
        }

        System.out.println("La copia del array utilizando el método arraycopy se realizará ahora: ");
        System.arraycopy(arrayNumeros, 0, arrayCopiaConMetodo, 0, arrayNumeros.length);

        System.out.println("La copia del array utilizando el método clone() se realizará ahora: ");
        arrayClonado = arrayNumeros.clone();
        
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]);
            System.out.print(" -- ");
            System.out.print(arrayCopia[i]);
            System.out.print(" -- ");
            System.out.print(arrayCopiaConMetodo[i]);
            System.out.print(" -- ");
            System.out.print(arrayClonado[i]);
            System.out.println(" ");
        }

    }

}
