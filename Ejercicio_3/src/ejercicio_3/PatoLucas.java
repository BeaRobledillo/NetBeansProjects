package ejercicio_3;

//clase de PatoLucas que hereda de la productora
public class PatoLucas extends WarnerBrothers {

    protected int numDisparado;
    protected String colorPlumaje;

    //constructores
    public PatoLucas() {
    }

    public PatoLucas(int numDisparado, String colorPlumaje, int numIntegrantes, String nombre, int anioAparicion, String fraseCaracteristica) {
        super(numIntegrantes, nombre, anioAparicion, fraseCaracteristica);
        this.numDisparado = numDisparado;
        this.colorPlumaje = colorPlumaje;
    }

    //get & set
    public int getNumDisparado() {
        return numDisparado;
    }

    public void setNumDisparado(int numDisparado) {
        this.numDisparado = numDisparado;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    //toString
    @Override
    public String toString() {
        return "PatoLucas{" + "numDisparado=" + numDisparado + ", colorPlumaje=" + colorPlumaje + '}';
    }

    ////metodo alegrarAlPersonal
    @Override
    public String alegrarAlPersonal() {
        return ("Diciendo Cua cua…");
    }
}
