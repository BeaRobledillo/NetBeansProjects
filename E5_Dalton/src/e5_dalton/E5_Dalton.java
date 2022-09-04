package e5_dalton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E5_Dalton {

    public static void main(String[] args) throws FileNotFoundException {
       File archivo = new File("src/e5_dalton/datos");
        Scanner entrada = new Scanner(archivo);
        int numeroGente;
        int[] arrayDalton;
        boolean alturaDesigual;

        numeroGente = entrada.nextInt();
        while (numeroGente != 0) {
            arrayDalton = new int[numeroGente];
            //llenamos el array con los datos que tenemos en el archivo
            /*aquí podríamos llenar el array con una sola línea utilizando el enfoque del ejemplo '10_LeerArrayEnLinea'
            arrayDalton = entrada.nextLine().split(" ");-->OJO QUE NOS DEVUELVE ARRAY DE CADENAS!!!
            */
            for (int i = 0; i < arrayDalton.length; i++) {
                arrayDalton[i] = entrada.nextInt();
            }
            
            alturaDesigual = false;
            for (int i = 0; i < arrayDalton.length - 1; i++) {
                if ((arrayDalton[i + 1] - arrayDalton[i] != arrayDalton[1] - arrayDalton[0]) || (arrayDalton[i + 1] - arrayDalton[i] == 0)) {
                    //Si la diferencia de alturas no se mantiene o bien es igual a cero
                    alturaDesigual = true;
                    break;
                }

            }
            if (!(alturaDesigual)) {
                System.out.println("DALTON");
            } else {
                System.out.println("DESCONOCIDOS");
            }
            numeroGente = entrada.nextInt();
        }
    }

}
