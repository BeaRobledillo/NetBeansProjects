package ejemplosusoarray3;

import javax.xml.transform.Source;

public class EjemplosUsoArray3 {

    public static void main(String[] args) {
        /*creamos un array bidiemnsional para recorrerlo*/
        int[][] arrayBidemensionalNumeros;
        //la dimensión primera es obligatoria declararla
        arrayBidemensionalNumeros = new int[4][];
        //se queremos q sea regular la misma cantidad de 
        //columnas y de filas
        arrayBidemensionalNumeros = new int[4][4];
        int arrayBidemensional[][] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {3, 5, 7, 9}, {10, 20, 30, 40}};
        //el recorrido de este tipo de arrays se realiza anidando
        //un bucle de recorridoo interno
        for (int i = 0; i < arrayBidemensional.length; i++) { //este bcle recorre filas
            for (int j = 0; j < arrayBidemensional[i].length; j++) { //este bucle recorre columnas
                System.out.print(arrayBidemensional[i][j] + " ");
            }//llegar aki implica la finalizacion de cada fila

            System.out.println("");
        }

    }

}
