package juegodetronos;

public class GusanoGris extends Inmaculados{
    
    protected int Miraditas;
    protected String NombreReal;

    public GusanoGris(int Miraditas, String NombreReal, int EdadSeeparados, int NumArmas, String familia, String nombre, String titulo) {
        super(EdadSeeparados, NumArmas, familia, nombre, titulo);
        this.Miraditas = Miraditas;
        this.NombreReal = NombreReal;
    }

        
    public int getMiraditas() {
        return Miraditas;
    }

    public void setMiraditas(int Miraditas) {
        this.Miraditas = Miraditas;
    }

    public String getNombreReal() {
        return NombreReal;
    }

    public void setNombreReal(String NombreReal) {
        this.NombreReal = NombreReal;
    }

    @Override
    public String toString() {
        return "GusanoGris{" + super.toString() + "Miraditas=" + Miraditas + ", NombreReal=" + NombreReal + '}';
    }

    @Override
    public String actuar() {
        return "seguir ordenes de su dueño";
    }
    
    
}
