package ejercicio_3;

//clase de PedroPicapiedra que hereda de la productora
public class PedroPicapiedra extends HannaBarbera {

    //atributos
    protected int numTrajes;
    protected int decibelios;

    //constructores
    
    public PedroPicapiedra() {
    }

    public PedroPicapiedra(int numTrajes, int decibelios, String idioma, String nombre, int anioAparicion, String fraseCaracteristica) {
        super(idioma, nombre, anioAparicion, fraseCaracteristica);
        this.numTrajes = numTrajes;
        this.decibelios = decibelios;
    }

    //get & set
    public int getNumTrajes() {
        return numTrajes;
    }

    public void setNumTrajes(int numTrajes) {
        this.numTrajes = numTrajes;
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        this.decibelios = decibelios;
    }

    //toString
    @Override
    public String toString() {
        return "PedroPicapiedra{" + "numTrajes=" + numTrajes + ", decibelios=" + decibelios + '}';
    }

    //metodo alegrarAlPersonal
    @Override
    public String alegrarAlPersonal() {
        return ("Con piedras de...");
    }

}
