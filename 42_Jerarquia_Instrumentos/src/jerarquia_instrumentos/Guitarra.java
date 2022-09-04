package jerarquia_instrumentos;

public class Guitarra extends InstrumentoCuerda{

    private float longitudMastil;
    private int numeroTrastes;

    public Guitarra() {
    }

    public Guitarra(float longitudMastil, int numeroTrastes, int numeroCuerdas, float decibelios, String descripcion) {
        super(numeroCuerdas, decibelios, descripcion);
        this.longitudMastil = longitudMastil;
        this.numeroTrastes = numeroTrastes;
    }

    public float getLongitudMastil() {
        return longitudMastil;
    }

    public void setLongitudMastil(float longitudMastil) {
        this.longitudMastil = longitudMastil;
    }

    public int getNumeroTrastes() {
        return numeroTrastes;
    }

    public void setNumeroTrastes(int numeroTrastes) {
        this.numeroTrastes = numeroTrastes;
    }

    @Override
    public String toString() {
        return "Guitarra{" + super.toString() + "longitudMastil=" + longitudMastil + ", numeroTrastes=" + numeroTrastes + '}';
    }

    
    public String tocarGuitarra(){
        return "Estamos tocando una guitarra...";
    }
    
    
}
