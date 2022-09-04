package barjavier2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author chemaclass
 */
public class U {

    public static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

    private static final boolean flag = true, debug = flag, debugError = flag;

    /**
     * Lee una línea y retorna un Str[] con el Str cortado por espacios
     *
     * @return String[]
     * @throws IOException
     */
    public static String[] leer() throws IOException {
        return leer("src/barjavier2/datos");
    }

    /**
     * Lee una línea y retorna un Str[] con el Str cortado por lo que se le pase
     * por parámetro
     *
     * @param cut Str por dónde cortar
     * @return String[]
     * @throws IOException
     */
    public static String[] leer(String cut) throws IOException {
        return BR.readLine().split(cut);
    }

    /**
     * Imprime por pantalla un mensaje si estamos en modo debug
     *
     * @param o Object a imprimir
     */
    public static void d(Object o) {
        if (debug) {
            System.out.println(o);
        }
    }

    /**
     * Imprime por pantalla un mensaje si estamos en modo debugError
     *
     * @param o Object a imprimir
     */
    public static void de(Object o) {
        if (debugError) {
            System.err.println(o);
        }
    }

    /**
     * Comprobar si un Str es un número
     *
     * @param str
     * @return boolean
     */
    public static boolean isNumeric(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    /**
     * Transformar un array en un Str
     *
     * @param a Object[] array a convertir
     * @return Str Resultado final
     */
    public static String toStr(Object... a) {
        String str = "";
        if (debug) {
            str = "{";
            for (Object o : a) {
                str += o + ", ";
            }
            str = "}";
        }
        return str;
    }

    /**
     *
     * @param str
     * @param leng
     * @return
     */
    public static String lpad(String str, int leng) {
        if (leng < str.length() && leng > 0) {
            return str.substring(0, leng);
        }
        for (int i = 0; i < (leng - str.length()); i++) {
            str = " " + str;
        }
        return str;
    }

    /**
     *
     * @param str
     * @param leng
     * @return
     */
    public static String rpad(String str, int leng) {
        if (leng < str.length() && leng > 0) {
            return str.substring(0, leng);
        }
        for (int i = str.length(); i < leng; i++) {
            str += " ";
        }
        return str;
        
        
    }
}
