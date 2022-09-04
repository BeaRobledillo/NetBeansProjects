package ejemplousoarray2;


public class EjemploUsoArray2 {

    /**
     vamos a plantear una forma alternativa de recorrer un array
     */
    public static void main(String[] args) {
        /**
         * Vamos a plantear una forma alternativa de recorrer un array
         */
        int[] numerosEnteros = {1, 2, 23, 4, 3, 2, 34, 5, 765};
        //1. forma 1 de recorrido-->con bucle for
        for (int i = 0; i < numerosEnteros.length; i++) {
            System.out.print(numerosEnteros[i] + " ");
        }
        System.out.println("");
        //2. forma 2 de recorrido--> con bucle "foreach"
        /*lo que en el anterior enfoque era 'numerosEnteros[i]' aquí será 'numero'*/
        for (int numero : numerosEnteros) {
            System.out.print(numero + " ");
        }
    }
    
}
