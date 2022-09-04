package ejemplousoarray_3;

public class EjemploUsoArray_3 {

    public static void main(String[] args) {
        /*En este ejemplo creamos un array bidimensional para recorrerlo*/
        int[][] arrayBidimensionalNumeros;
        //La única dimensión que es obligatoria declarar en la incialización es la primera, lde las filas
        arrayBidimensionalNumeros = new int[4][];
        //Si queremos que el array sea regular especificamos la misma cantidad de columnas que de filas
        arrayBidimensionalNumeros = new int[4][4];

        //Vamos a declarar un array bidimensional de forma estática para recorrerlo
        int arrayBidimensional[][] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 5, 7, 9}, {10, 20, 30, 40}};
        System.out.println("Recorrifo de un array bidimensional REGULAR");
        //El recorrido de este tipo de arrays se realiza anidando un bucle de recorrido interno
        for (int i = 0; i < arrayBidimensional.length; i++) {//este for recorre filas
            for (int j = 0; j < arrayBidimensional[i].length; j++) {//este for recorre columnas
                System.out.print(arrayBidimensional[i][j] + " ");
            }//llegar aquí implica la finalización del recorrido de cada fila
            System.out.println("");
        }

        int arrayBidimensionalIrregular[][] = {{1, 2, 3, 4}, {2, 4}, {3, 5, 7}, {10}};
        System.out.println("Recorrifo de un array bidimensional IRREGULAR con bucle 'for' anidado");
        //El recorrido de este tipo de arrays se realiza anidando un bucle de recorrido interno
        for (int i = 0; i < arrayBidimensionalIrregular.length; i++) {//este for recorre filas
            for (int j = 0; j < arrayBidimensionalIrregular[i].length; j++) {//este for recorre columnas
                System.out.print(arrayBidimensionalIrregular[i][j] + " ");
            }//llegar aquí implica la finalización del recorrido de cada fila
            System.out.println("");
        }

        System.out.println("Recorrido de un array bidimensional IRREGULAR con bucle 'foreach' anidado");
        for (int i = 0; i < arrayBidimensionalIrregular.length; i++) {
            for (int filas : arrayBidimensionalIrregular[i]) {
                System.out.print(filas + " ");
            }
            System.out.println("");
        }

    }

}
