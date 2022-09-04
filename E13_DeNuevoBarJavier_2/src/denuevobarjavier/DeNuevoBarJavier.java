package denuevobarjavier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DeNuevoBarJavier {

    public static String sacaNombreComida(int posicionComida) {
        String respuesta = "";

        switch (posicionComida) {
            case 0:
                respuesta = "DESAYUNOS";
                break;
            case 1:
                respuesta = "COMIDAS";
                break;
            case 2:
                respuesta = "MERIENDAS";
                break;
            case 3:
                respuesta = "CENAS";
                break;
            case 4:
                respuesta = "COPAS";
                break;

        }
        return respuesta;
    }

    public static void compruebaEmpatesSacaResultados(float[] arrayCajaComida, float menor, float mayor, int posicionMenor, int posicionMayor) {
        int contadorEmpatePorAbajo = 0;//Contabiliza si hay empate de recaudación entre comidas por abajo
        int contadorEmpatePorArriba = 0;//Contabiliza si hay empate de recaudación entre comidas por arriba

        for (int i = 0; i < arrayCajaComida.length; i++) {
            if (arrayCajaComida[i] == menor) {
                contadorEmpatePorAbajo++;
            }
            if (arrayCajaComida[i] == mayor) {
                contadorEmpatePorArriba++;
            }
        }

        if (contadorEmpatePorArriba > 1) {
            System.out.print("EMPATE#");
        } else {
            System.out.print(sacaNombreComida(posicionMayor) + "#");
        }
        if (contadorEmpatePorAbajo > 1) {
            System.out.print("EMPATE#");
        } else {
            System.out.print(sacaNombreComida(posicionMenor) + "#");
        }
    }

    public static void masyMenosBeneficios(float[] arrayCajaComida, String[] arrayLetrasComida) {
        //comprobar empate por abajo
        //comprobar empate por arriba
        float menor = arrayCajaComida[0];//Suponemos la primera posicion como la menor de todas
        float mayor = arrayCajaComida[0];//Suponemos la primera posicion como la mayor de todas

        int posicionMenor = 0;
        int posicionMayor = 0;
        float totalTodoComidas = 0;
        //hacemos una pasada para ver el menor y el mayor e ir acumulando el precio de cada cosa para la media
        for (int i = 0; i < arrayCajaComida.length; i++) {

            if (arrayCajaComida[i] < menor) {
                menor = arrayCajaComida[i];
                posicionMenor = i;
            }
            if (arrayCajaComida[i] > mayor) {
                mayor = arrayCajaComida[i];
                posicionMayor = i;
            }

            totalTodoComidas += arrayCajaComida[i];
        }
        compruebaEmpatesSacaResultados(arrayCajaComida, menor, mayor, posicionMenor, posicionMayor);

        totalTodoComidas /= 5;//Sacamos la media dividiendo entre 5 
        if (totalTodoComidas < arrayCajaComida[1]) {//Si la media es menor que el importe de las comidas...
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }

    public static void leerDatosArchivo() throws FileNotFoundException {
        File archivo = new File("src/denuevobarjavier/datos");
        Scanner entrada = new Scanner(archivo);
        String[] arrayLetrasComida = {"D", "A", "M", "I", "C"};
        float[] arrayCajaComida;
        boolean entradaNula = false;
        String letraLeida;
        int posicionEnArrayLetraLeida;
        while (entrada.hasNext()) {
            arrayCajaComida = new float[5];
            do {
                for (int i = 0; i < arrayLetrasComida.length; i++) {
                    letraLeida = entrada.next();
                    if (letraLeida.equals("N")) {
                        entradaNula = true;
                        entrada.nextLine();
                        break;
                    } else {
                        for (int j = 0; j < arrayLetrasComida.length; j++) {
                            if (letraLeida.equals(arrayLetrasComida[j])) {
                                arrayCajaComida[j] = entrada.nextFloat();
                                break;
                            }
                        }
                    }

                    entrada.nextLine();
                }

            } while (!entradaNula);
            masyMenosBeneficios(arrayCajaComida, arrayLetrasComida);

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        leerDatosArchivo();
    }

}