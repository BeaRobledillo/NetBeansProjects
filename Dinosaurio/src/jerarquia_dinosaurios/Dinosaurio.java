package jerarquia_dinosaurios;

public class Dinosaurio {

    protected String nombre;
    protected float altura;
    protected int numExtremidades;
    protected String dieta;

    public Dinosaurio() {
    }

    public Dinosaurio(String nombre, float altura, int numExtremidades, String dieta) {
        this.nombre = nombre;
        this.altura = altura;
        this.numExtremidades = numExtremidades;
        this.dieta = dieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getNumExtremidades() {
        return numExtremidades;
    }

    public void setNumExtremidades(int numExtremidades) {
        this.numExtremidades = numExtremidades;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    @Override
    public String toString() {
        return "Dinosaurio{" + "nombre=" + nombre + ", altura=" + altura + ", numExtremidades=" + numExtremidades + ", dieta=" + dieta + '}';
    }

    /*Este método es definido como final, de forma que no será posible su redefinición en las clases derivadas Pterodactilo y Tiranosaurio*/
    public final void soyDinosaurio() {
        System.out.println("Estamos dentro del método soyDinosaurio() " + this.getClass());

    }
}
