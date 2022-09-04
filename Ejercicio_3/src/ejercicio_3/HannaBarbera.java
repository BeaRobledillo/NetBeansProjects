package ejercicio_3;

//clase de productora HannaBarbera que hereda de la clase DibujoAnimado
public abstract class HannaBarbera extends DibujoAnimado {

    //atributo
    protected String idioma;

    //constuctores
    public HannaBarbera() {
    }

 
    public HannaBarbera(String idioma, String nombre, int anioAparicion, String fraseCaracteristica) {
        super(nombre, anioAparicion, fraseCaracteristica);
        this.idioma = idioma;
    }

    //get & set
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    //metodo toString
    @Override
    public String toString() {
        return "HannaBarbera{" + "idioma=" + idioma + '}';
    }

}
