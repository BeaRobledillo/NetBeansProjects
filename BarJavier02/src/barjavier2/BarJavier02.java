package barjavier2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BarJavier02 {

    /**
     * Activar/Desactivar el log de depuración
     */
    public static final boolean isLog = false;

    /**
     * Lista de días sobre los que iremos guardando los beneficios
     */
    private final List<Dia> dias;

    public BarJavier02() {
        dias = new ArrayList<>();
    }

    public static void main(String[] args) {
        new BarJavier02().doMain(args);
    }

    public void doMain(String[] args) {
        log("BEGIN");

        Dia dia = new Dia();
        String input = "";
        boolean isContinuamos = true;
        do {
            try {
                log("Introduce el codigo y los benefícios:");
                //Leemos la linea
                //input = Utils.BR.readLine();
                input = U.BR.readLine();
                //obtenemos las entradas
                String[] inputs = input.split(" ");
                log("Introduce el codigo y los benefícios:");
                //Leemos la linea
                input = U.BR.readLine();
                //obtenemos las entradas
                // String[] inputs = input.split(" ");

                Codigo codigo = Codigo.getCodigoById(inputs[0]);
                float ganancia = Float.parseFloat(inputs[1]);
                //Si introducimos 'N 0' cerramos el día y preparamos el siguiente
                if (codigo.equals(Codigo.INEXISTENTE) && ganancia == 0) {
                    dias.add(dia);
                    dia = new Dia();
                } //De lo contrario, comprobamos que el código esté entre
                // los códigos posibles a añadir y añadimos un nuevo 
                // codigo/ganancia al día
                else if (codigo.in()) {
                    dia.setCategoria(codigo, ganancia);
                }
            } catch (CodigoNotFoundException ex) {
                log(ex.getMessage());
                log("EXIT");
                //Sólo si dimos un intro vacío le diremos que salga
                if (input.length() <= 0) {
                    isContinuamos = false;
                }
            } catch (IOException | NumberFormatException ex) {
            }

            log("DIA ->" + dia);
            log("DIAS->" + dias);
        } while (isContinuamos);

        //Terminado
        try {
            Resultado[] resultados;
            resultados = getResultados();
            printResultados(resultados);
        } catch (Exception e) {
            log("Exception to try render to results ");
        }

        log("END");
    }

    /**
     * Obtener todos los resultados de los días
     *
     * @return
     * @throws Exception
     */
    private Resultado[] getResultados() throws Exception {
        Resultado[] resultados = new Resultado[dias.size()];
        for (int i = 0; i < dias.size(); i++) {
            Dia dia = dias.get(i);
            resultados[i] = new Resultado(
                    dia.getMax(),
                    dia.getMin(),
                    dia.isComidas()
            );
        }

        return resultados;
    }

    /**
     * Pintar todos los resultados
     *
     * @param resultados Resultado[]
     * @throws Exception
     */
    private void printResultados(Resultado[] resultados) throws Exception {
        for (Resultado r : resultados) {
            String s = r.max + "#" + r.min + "#" + r.isComidas;
            System.out.println(s);
        }
    }

    /**
     * Out
     *
     * @param s Object
     */
    private void log(Object s) {
        if (isLog) {
            System.out.println(s);
        }
    }
}
