package ejemplousoarray5;

import javax.xml.transform.Source;

public class EjemploUsoArray5 {

    public static void main(String[] args) {
        /*este ejemplo ilustra la copia de arrays y las diferncias alternativas
        que tenemos
         */

        int[] arrayNumeros = {1, 2, 3, 4, 5};
        int[] arrayCopia = new int[5];
        int[] arrayCopiaConMetodo = new int[5];
        int[] arrayClonado = new int[5];

        for (int i = 0; i < arrayNumeros.length; i++) {
            arrayCopia[i] = arrayNumeros[i];
            System.out.println("posicion de array original: " + arrayNumeros[i]);
            System.out.println("posicion de array copia: " + arrayCopia[i]);
            System.out.println("");

        }

        //
        System.out.println("La copia del array utilizando metodo arraycopy se realiza ahora: ");
        System.arraycopy(arrayNumeros, 0, arrayCopiaConMetodo, 0, arrayNumeros.length);

        System.out.println("la copia del array utilizadno el metodo clone() se realizara ahora: ");
        arrayClonado = arrayNumeros.clone();
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.print(arrayNumeros[i]);
            System.out.print("--");
            System.out.print(arrayCopia[i]);
            System.out.print("--");
            System.out.print(arrayClonado[i]);
            System.out.print("--");
        }

        System.out.println("");

    }

}
