package barjavier2;

/**
 * Exception que controla que el código exista
 *
 * @author chemaclass
 */
public class CodigoNotFoundException extends Exception {

    public CodigoNotFoundException() {
        super("Código no existente");
    }
}
