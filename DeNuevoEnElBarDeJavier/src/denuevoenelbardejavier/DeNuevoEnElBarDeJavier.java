/*El programa recibira una lista de ventas realizadas. 
Cada una constara de una categorıa (D, A, M, I o C) y un valor (real). 
Cuando el dıa termina, Javier introduce una categorıa inexistente (N) con valor
cero (es decir, N 0).
Salida
Para cada dıa, el programa generara una lınea que contendra tres valores separados por la almohadilla
(“#”). Los dos primeros indicaran el nombre de las categorıas que han supuesto mas y menos beneficios
respectivamente (ten en cuenta que si de una categor´ıa no se ha vendido nada, su beneficio es cero);
las categor´ıas se indicar´an con sus nombres, DESAYUNOS, COMIDAS, MERIENDAS, CENAS o COPAS. El tercer
valor de la lınea indicar´a “SI” si la media gastada por los clientes en las comidas supero a la media de
ventas del dıa, y “NO” en caso contrario.
En caso de que existan varias categorıas que hayan conseguido el maximo o mınimo de ventas, se
especificara “EMPATE”.
 */
package denuevoenelbardejavier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeNuevoEnElBarDeJavier {

    public static String sacaCategorias(String categorias) {
        String respuesta = "";

        switch (categorias) {
            case "D":
                respuesta = "DESAYUNOS#";
                break;
            case "A":
                respuesta = "COMIDAS#";
                break;
            case "M":
                respuesta = "MERIENDAS#";
                break;
            case "I":
                respuesta = "CENAS#";
                break;
            case "C":
                respuesta = "COPAS#";
                break;
            default:
                respuesta = "EMPATE";
        }
        return respuesta;
    }

    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("src/denuevoenelbardejavier/datos");
        Scanner entrada = new Scanner(archivo);

        String codigo = " ";
        String[] categorias = {"DESAYUNOS#", "COMIDAS#", "MERIENDAS#", "CENAS#", "COPAS#"};
        //double[] valores = null;
        double minimo = 0;
        double maximo = 0;
        double[] valors = {0, 0, 0, 0, 0};
        double suma = 0;
        double CntMax;
        double CntMin;
        double Importe = 0;
        double TotImporte = 0;
        double[] ImpCat = {0, 0, 0, 0, 0, 0};
        int NumVentas = 0;
        int NumComidas = 0;
        int indexMax;
        int indexMin = 0;
        int numC = 0;
        int numT = 0;
        int i;

        while (entrada.hasNext()) {
            String cadenaLeida = entrada.next();
            double dato = entrada.nextDouble();
            System.out.print(cadenaLeida);
            System.out.println(" " + dato);
            TotImporte += Importe;
            switch (codigo) {
                case "D":
                    /*valores[0] = valores[0] + valores;
                    suma = suma + valores;*/
                    ImpCat[1] += Importe;
                    NumVentas++;
                    System.out.println(sacaCategorias(codigo));
                    break;

                //break;
                case "A":
                    /* valores[1] = valores[1] + valores;
                    suma = suma + valores;*/
                    ImpCat[3] += Importe;
                    NumVentas++;
                    //System.out.println(sacaCategorias(indexMin));
                    break;

                case "M":
                    /* valores[2] = valores[2] + valores;
                    suma = suma + valores;*/
                    numT++;
                    System.out.println(sacaCategorias(codigo));
                    break;
                case "I":
                    /*  valores[3] = valores[3] + valores;
                    suma = suma + valores;*/
                    ImpCat[4] += Importe;
                    NumVentas++;
                    break;
                case "C":
                    ImpCat[5] += Importe;
                    NumVentas++;
                    break;
                default:
                    CntMax = 0;
                    CntMin = 0;
                    minimo = 1;
                    maximo = 1;
                    minimo = ImpCat[1];
                    maximo = ImpCat[1];

            }

        }

    }
}
