
package jerarquiajuegotronos;

public abstract class Dothrakis extends Humano  {

    int numCaballos;

    public Dothrakis() {
    }

    public Dothrakis(int numCaballos) {
        this.numCaballos = numCaballos;
    }

    public Dothrakis(int numCaballos, String familia, String nombre, String titulo) {
        super(familia, nombre, titulo);
        this.numCaballos = numCaballos;
    }

    public int getNumCaballos() {
        return numCaballos;
    }

    public void setNumCaballos(int numCaballos) {
        this.numCaballos = numCaballos;
    }

    @Override
    public String toString() {
        return "Dothrakis{" + "numCaballos=" + numCaballos + '}';
    }

    @Override
    public String actuar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}
