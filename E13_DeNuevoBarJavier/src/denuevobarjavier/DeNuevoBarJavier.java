package denuevobarjavier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeNuevoBarJavier {

    public static void letraFalta(String[] resultado, String[] arrayLetras) {
        String todasComidas = "DAMIC";
        String letra;
        boolean seEncuentra = false;
        int posicionNull = 5;
        if ((resultado[0].equals("EMPATE")) || (resultado[1].equals("EMPATE"))) {
            return;
        }
        for (int i = 0; i < todasComidas.length(); i++) {
            //tenemos que recorrer el array y saber si cada una de las letras de la variable comida se encuentra en el array
            /*Si encontramos una que no esté la escribimos en la posición que sea null del array de letras*/
            letra = todasComidas.substring(i, i + 1);
            for (int j = 0; j < arrayLetras.length; j++) {
                if (arrayLetras[j] == null) {
                    posicionNull = j;
                }

                if (letra.equals(arrayLetras[j])) {
                    seEncuentra = true;
                    break;
                }
            }
            if ((!seEncuentra) && (posicionNull != 5)) {
                arrayLetras[posicionNull] = letra;
                return;
            }
        }
        
    }

    /*En función de la letra que pasemos sacamos una palabra*/
    public static String sacaPalabra(String letra) {
        String respuesta = "";

        switch (letra) {
            case "D":
                respuesta = "DESAYUNOS";
                break;
            case "A":
                respuesta = "COMIDAS";
                break;
            case "M":
                respuesta = "MERIENDAS";
                break;
            case "I":
                respuesta = "CENAS";
                break;
            case "C":
                respuesta = "COPAS";
                break;

        }
        return respuesta;
    }

    /*Este método recibe la estructura que almacena la letra de la comida que más recaudación tiene y la que menos 
    y recibe tb si la media de las comidas*/
    public static void sacaResultados(String[] arrayMaximoMinimoDia, boolean comidaSuperiorAMedia) {
        String cadenaRespuesta = "";
        cadenaRespuesta += sacaPalabra(arrayMaximoMinimoDia[0]);
        cadenaRespuesta += "#" + sacaPalabra(arrayMaximoMinimoDia[1]);
        if (comidaSuperiorAMedia) {
            cadenaRespuesta += "#SI";
        } else {
            cadenaRespuesta += "#NO";
        }
        System.out.println(cadenaRespuesta);

    }

    /*PONER COMENTARIO DE LO QUE HACE...*/
    public static boolean sacaMedia(String[][] arrayRecaudacion) {
        double recaudacionComida = 0.0;
        double media = 0.0;
        for (int i = 0; i < arrayRecaudacion[1].length; i++) {
            if (arrayRecaudacion[1][i] == null) {
                arrayRecaudacion[1][i] = "0";
            }
            if (arrayRecaudacion[0][i] != null) {

                if (arrayRecaudacion[0][i].equals("C")) {
                    recaudacionComida = Double.parseDouble(arrayRecaudacion[1][i]);
                }
            }
            media += Double.parseDouble(arrayRecaudacion[1][i]);
        }
        media = media / arrayRecaudacion[1].length;
        if (media > recaudacionComida) {
            return true;
        } else {
            return false;
        }
    }

    /*Este método rellena con "0.0" las posiciones que estarán a null en la segunda fila de la estrucutura que almacena comidas y cantidades*/
    public static void rellenarCeros(String[][] arrayRecaudacion) {
        for (int i = 0; i < arrayRecaudacion[1].length; i++) {
            if (arrayRecaudacion[1][i] == null) {
                arrayRecaudacion[1][i] = "0.0";
            }
        }
    }

    /*PONER COMENTARIO DE LO QUE HACE...*/
    public static String[] determinarMaximoMinimo(String[][] arrayRecaudacion) {
        String[] result = new String[2];
        double maximo = Double.parseDouble(arrayRecaudacion[1][0]);
        double minimo = Double.parseDouble(arrayRecaudacion[1][0]);
        int posicionMaximo = 0;
        int posicionMinimo = 0;
        int contadorMaximo = 0;
        int contadorMinimo = 0;
        /*Este recorrido determina el máximo y mínimo valor de todo el array y se queda con la posición donde aparecen esos valores*/
        for (int i = 0; i < arrayRecaudacion[1].length; i++) {

            if (Double.parseDouble(arrayRecaudacion[1][i]) > maximo) {
                maximo = Double.parseDouble(arrayRecaudacion[1][i]);
                posicionMaximo = i;
            }
            if (Double.parseDouble(arrayRecaudacion[1][i]) < minimo) {
                minimo = Double.parseDouble(arrayRecaudacion[1][i]);
                posicionMinimo = i;
            }

        }

        /*Este recorrido determina el número de ocurrencias del valor máximo y mínimo de cara a establecer empates*/
        for (int i = 0; i < arrayRecaudacion[1].length; i++) {

            if (Double.parseDouble(arrayRecaudacion[1][i]) == Double.parseDouble(arrayRecaudacion[1][posicionMaximo])) {
                contadorMaximo++;
            }
            if (Double.parseDouble(arrayRecaudacion[1][i]) == Double.parseDouble(arrayRecaudacion[1][posicionMinimo])) {
                contadorMinimo++;
            }

        }
        result[0] = arrayRecaudacion[0][posicionMaximo];
        result[1] = arrayRecaudacion[0][posicionMinimo];

        if (contadorMaximo > 1) {
            result[0] = "EMPATE";
        }
        if (contadorMinimo > 1) {
            result[1] = "EMPATE";
        }
        letraFalta(result, arrayRecaudacion[0]);
        /*TENEMOS QUE SER CAPACES DE DETERMINAR QUÉ COMIDA FALTA Y POR TANTO SERÁ MÍNIMO DE VENTAS EN EL CASO DE QUE SEA SÓLO UNA LA QUE FALTE*/
        return result;

    }

    public static void tratarLinea(String[][] arrayRecaudacion, String linea) {
        String[] arrayLinea = linea.split(" ");
        for (int i = 0; i < arrayRecaudacion[0].length; i++) {
            if (arrayRecaudacion[0][i] == null) {
                arrayRecaudacion[0][i] = arrayLinea[0];
                arrayRecaudacion[1][i] = arrayLinea[1];
                break;
            }
        }
        System.out.println("");
    }

    public static void leerFichero(Scanner entrada, String[][] arrayRecaudacion) {
        String linea;

        linea = entrada.nextLine();
        do {
            tratarLinea(arrayRecaudacion, linea);/*tratamiento de la línea leída e introducción de código de comida y recaudación*/
            linea = entrada.nextLine();
        } while (!(linea.equals("N 0")));

    }

    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("src/denuevobarjavier/datos");
        Scanner entrada = new Scanner(archivo);
        /*En la primera fila del array almacenamos las letras leídas del fichero y en la segunda fila las recaudaciones*/
        String[][] arrayRecaudacion = new String[2][5];
        String[] arrayMaximoMinimoDia = new String[2];
        boolean comidaSuperiorAMedia = false;
        while (entrada.hasNext()) {
            leerFichero(entrada, arrayRecaudacion);

            /*Llegados a este punto ya tenemos procesado un día y nos falta determinar mínimo, máximo y media...*/
            rellenarCeros(arrayRecaudacion);
            arrayMaximoMinimoDia = determinarMaximoMinimo(arrayRecaudacion);

            comidaSuperiorAMedia = sacaMedia(arrayRecaudacion);

            sacaResultados(arrayMaximoMinimoDia, comidaSuperiorAMedia);
            arrayRecaudacion = new String[2][5];//damos por finalizado el tratamiento de datos de un día y reseteamos la estructura que almacena comidas y recaudaciones

        }
    }
}
