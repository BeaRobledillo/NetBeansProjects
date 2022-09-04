package juegodetronos;

abstract class Inmaculados extends Humanos{
    
    protected int EdadSeeparados;
    protected int NumArmas;

    public Inmaculados(int EdadSeeparados, int NumArmas, String familia, String nombre, String titulo) {
        super(familia, nombre, titulo);
        this.EdadSeeparados = EdadSeeparados;
        this.NumArmas = NumArmas;
    }

    public int getEdadSeeparados() {
        return EdadSeeparados;
    }

    public void setEdadSeeparados(int EdadSeeparados) {
        this.EdadSeeparados = EdadSeeparados;
    }

    public int getNumArmas() {
        return NumArmas;
    }

    public void setNumArmas(int NumArmas) {
        this.NumArmas = NumArmas;
    }

    @Override
    public String toString() {
        return "Inmaculados{" + super.toString() + "EdadSeeparados=" + EdadSeeparados + ", NumArmas=" + NumArmas + '}';
    }

     
    
    
    
}
