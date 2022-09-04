package barjavier2;

import java.util.HashMap;
import java.util.Map;

public class Dia {

    private final Map<Codigo, Float> categorias;

    /**
     * Inicializamos las categorías con los códigos permitidos
     */
    public Dia() {
        categorias = new HashMap<>();
        //inicializamos todos nuestros códigos con una ganancia de 0.0f
        for (Codigo c : Codigo.getCodigos()) {
            categorias.put(c, 0.0f);
        }
    }

    /**
     * Añadir una nueva categoría al día
     *
     * @param categoria Categoria
     */
    public void setCategoria(Codigo c, Float g) {
        categorias.put(c, g);
    }

    /**
     * Obtener la categoría del día con ganancia máxima
     *
     * @return Codigo con mayor beneficio
     */
    public String getMax() {
        Codigo codigoMax = Codigo.INEXISTENTE, codigo;
        float gananciaMax = 0f, ganancia;
        for (Map.Entry pairs : categorias.entrySet()) {
            codigo = (Codigo) pairs.getKey();
            ganancia = (Float) pairs.getValue();
            if (gananciaMax < ganancia) {
                gananciaMax = ganancia;
                //Reasignamos el nuevo código con mayor ganancia
                codigoMax = codigo;
            } else if (gananciaMax == ganancia) {
                codigoMax = Codigo.EMPATE;
            }
        }
        return codigoMax.valor;
    }

    /**
     * Obtener la media de las ganancias menos la de comidas
     *
     * @return float Media de las ganancias menos comidas
     */
    public float getMediaMenosComidas() {
        Codigo codigo;
        float gananciaTotal = 0f;
        for (Map.Entry pairs : categorias.entrySet()) {
            codigo = (Codigo) pairs.getKey();
            if (codigo.equals(Codigo.COMIDAS)) {
                continue;
            }
            gananciaTotal += (Float) pairs.getValue();

        }
        // La media se hace con las ganancias / número total de categorías
        // Si una categoría no está tiene como ganancias 0, y cuenta.
        return gananciaTotal / categorias.size();
    }

    /**
     * Comprobar si la media de las comidas es mayor que la media de todas las
     * demás ganancias
     *
     * @return SI o NO
     */
    public String isComidas() {

        if (categorias.containsKey(Codigo.COMIDAS)) {
            float gananciaComida = categorias.get(Codigo.COMIDAS);
            float gananciasMedia = getMediaMenosComidas();
            return (gananciaComida > gananciasMedia) ? "SI" : "NO";
        } else {
            return "NO";
        }
    }

    /**
     * Obtener la categoría del día con ganancia mínima
     *
     * @return Codigo con menor beneficio
     */
    public String getMin() {
        Codigo codigoMin = Codigo.INEXISTENTE, codigo;
        //No puede haber ganancia -1, por eso es para el primer código
        float gananciaMin = -1f, ganancia;
        for (Map.Entry pairs : categorias.entrySet()) {
            codigo = (Codigo) pairs.getKey();
            ganancia = (Float) pairs.getValue();
            if (ganancia < gananciaMin || gananciaMin == -1) {
                gananciaMin = ganancia;
                //Reasignamos el nuevo código con mayor ganancia
                codigoMin = codigo;
            } else if (gananciaMin == ganancia) {
                codigoMin = Codigo.EMPATE;
            }
        }
        return codigoMin.valor;
    }

    @Override
    public String toString() {
        return "Dia{" + "categorias=" + categorias + '}';
    }
}
