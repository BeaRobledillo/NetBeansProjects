package jerarquia_instrumentos;

public class InstrumentoCuerda {

    private int numeroCuerdas;
    private float decibelios;
    private String descripcion;

    public InstrumentoCuerda() {
    }

    public InstrumentoCuerda(int numeroCuerdas, float decibelios, String descripcion) {
        this.numeroCuerdas = numeroCuerdas;
        this.decibelios = decibelios;
        this.descripcion = descripcion;
    }

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }

    public float getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(float decibelios) {
        this.decibelios = decibelios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "InstrumentoCuerda{" + "numeroCuerdas=" + numeroCuerdas + ", decibelios=" + decibelios + ", descripcion=" + descripcion + '}';
    }

    public String tocarInstrumentoCuerda() {
        return "Estamos tocando un instrumento de cuerda";
    }

}
