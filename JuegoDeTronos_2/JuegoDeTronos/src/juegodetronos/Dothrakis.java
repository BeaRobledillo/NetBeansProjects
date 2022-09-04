package juegodetronos;

abstract class Dothrakis extends Humanos{
    
    private int Caballos;

    public Dothrakis(int Caballos, String familia, String nombre, String titulo) {
        super(familia, nombre, titulo);
        this.Caballos = Caballos;
    }

    

    public int getCaballos() {
        return Caballos;
    }

    public void setCaballos(int Caballos) {
        this.Caballos = Caballos;
    }

    @Override
    public String toString() {
        return "Dothrakis{" + super.toString() + "Caballos=" + Caballos + '}';
    }
    
        
}
