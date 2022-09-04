package televisionplasma;

public class TelevisionPlasma {

    int canal;
    int volumen;
    boolean isEncendida;

    /**
     * Un constructor por defecto no es necesario que esté implementado en la
     * clase cuyos objetos inicializa No obstante, si tenemos definido un
     * constructor personalizado, es de obligado cumplimiento tener implementado
     * un constructor por defecto
     */
    TelevisionPlasma() {
    }

    TelevisionPlasma(int nuevoCanal, int nuevoVolumen, boolean nuevoIsEncendida) {
        canal = nuevoCanal;
        volumen = nuevoVolumen;
        isEncendida = nuevoIsEncendida;
    }

    @Override
    public String toString() {
        return "TelevisionPlasma{" + "canal=" + canal + ", volumen=" + volumen + ", isEncendida=" + isEncendida + '}';
    }

}
