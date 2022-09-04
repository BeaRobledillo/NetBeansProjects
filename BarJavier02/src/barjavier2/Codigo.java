package barjavier2;

/**
 * Código de la comida
 *
 * @author chemaclass
 */
public enum Codigo {
    /* Códigos*/

    EMPATE("E", "EMPATE"),
    INEXISTENTE("N", "Inexistente"),
    DESAYUNOS("D", "Desayunos"),
    COMIDAS("A", "Comidas"),
    MERIENDAS("M", "Meriendas"),
    CENAS("I", "Cenas"),
    COPAS("C", "Copas");

    public final String id;
    public final String valor;

    private Codigo(String clave, String valor) {
        this.id = clave;
        this.valor = valor;
    }

    /**
     * Obtenemos todos los códigos de los distintos menus del bar
     *
     * @return
     */
    public static Codigo[] getCodigos() {
        Codigo[] codigos = {DESAYUNOS, COMIDAS, MERIENDAS, CENAS, COPAS};
        return codigos;
    }

    /**
     * Comprobamos que nuestro código tenga la id de uno de los códigos listados
     * en getCodigos()
     *
     * @return
     */
    public boolean in() {
        for (Codigo c : getCodigos()) {
            if (id.equals(c.id)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Obtenemos el Código mediante su ID
     *
     * @param id
     * @return Codigo
     * @throws barjavier2.CodigoNotFoundException
     */
    public static Codigo getCodigoById(final String id) throws CodigoNotFoundException {
        if (id.equals(DESAYUNOS.id)) {
            return DESAYUNOS;
        } else if (id.equals(COMIDAS.id)) {
            return COMIDAS;
        } else if (id.equals(MERIENDAS.id)) {
            return MERIENDAS;
        } else if (id.equals(CENAS.id)) {
            return CENAS;
        } else if (id.equals(COPAS.id)) {
            return COPAS;
        } else if (id.equals(INEXISTENTE.id)) {
            return INEXISTENTE;
        } else if (id.equals(EMPATE.id)) {
            return EMPATE;
        } else {
            throw new CodigoNotFoundException();
        }

    }
}
