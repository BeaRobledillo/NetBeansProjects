package jerarquiajuegotronos;


public abstract class Inmaculados extends Humano{
    
    int edadSeparados;
    int numArmas;

    public Inmaculados() {
    }

    public Inmaculados(int edadSeparados, int numArmas) {
        this.edadSeparados = edadSeparados;
        this.numArmas = numArmas;
    }

    public Inmaculados(int edadSeparados, int numArmas, String familia, String nombre, String titulo) {
        super(familia, nombre, titulo);
        this.edadSeparados = edadSeparados;
        this.numArmas = numArmas;
    }

    public int getEdadSeparados() {
        return edadSeparados;
    }

    public void setEdadSeparados(int edadSeparados) {
        this.edadSeparados = edadSeparados;
    }

    public int getNumArmas() {
        return numArmas;
    }

    public void setNumArmas(int numArmas) {
        this.numArmas = numArmas;
    }

    @Override
    public String toString() {
        return "Inmaculados{" + "edadSeparados=" + edadSeparados + ", numArmas=" + numArmas + '}';
    }

    @Override
    public String actuar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
