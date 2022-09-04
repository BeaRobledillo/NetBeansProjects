package barjavier2;

/**
 *
 * @author chemaclass
 */
public class Resultado {

    public final String max;
    public final String min;
    public final String isComidas;

    public Resultado(String max, String min, String isComidas) {
        this.max = max.toUpperCase();
        this.min = min.toUpperCase();
        this.isComidas = isComidas.toUpperCase();
    }

}
