
package jerarquiajuegotronos;


public class GusanoGris extends Inmaculados {
    
    int numMiraditas;
    String nombreReal;

    public GusanoGris() {
    }

    public GusanoGris(int numMiraditas, String nombreReal) {
        this.numMiraditas = numMiraditas;
        this.nombreReal = nombreReal;
    }

    public GusanoGris(int numMiraditas, String nombreReal, int edadSeparados, int numArmas) {
        super(edadSeparados, numArmas);
        this.numMiraditas = numMiraditas;
        this.nombreReal = nombreReal;
    }

    public GusanoGris(int numMiraditas, String nombreReal, int edadSeparados, int numArmas, String familia, String nombre, String titulo) {
        super(edadSeparados, numArmas, familia, nombre, titulo);
        this.numMiraditas = numMiraditas;
        this.nombreReal = nombreReal;
    }

    public int getNumMiraditas() {
        return numMiraditas;
    }

    public void setNumMiraditas(int numMiraditas) {
        this.numMiraditas = numMiraditas;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    @Override
    public String toString() {
        return "GusanoGris{" + "numMiraditas=" + numMiraditas + ", nombreReal=" + nombreReal + '}';
    }
    
    
}
