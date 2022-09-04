
package jerarquiadeportiva;


public class Atleta extends Deportista {
    //atributos
    String mayas;
    String pantaloncitos;
    String zapatillas;
    String descalzo;

    //constructor x defecto
    public Atleta() {
    }

    //constructores personalizados
    public Atleta(String mayas, String pantaloncitos, String zapatillas, String descalzo) {
        this.mayas = mayas;
        this.pantaloncitos = pantaloncitos;
        this.zapatillas = zapatillas;
        this.descalzo = descalzo;
    }

    public Atleta(String mayas, String pantaloncitos, String zapatillas, String descalzo, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(nombre, edad, premiosIndividual, premiosColectivo);
        this.mayas = mayas;
        this.pantaloncitos = pantaloncitos;
        this.zapatillas = zapatillas;
        this.descalzo = descalzo;
    }

    //set & get
    public String getMayas() {
        return mayas;
    }

    public void setMayas(String mayas) {
        this.mayas = mayas;
    }

    public String getPantaloncitos() {
        return pantaloncitos;
    }

    public void setPantaloncitos(String pantaloncitos) {
        this.pantaloncitos = pantaloncitos;
    }

    public String getZapatillas() {
        return zapatillas;
    }

    public void setZapatillas(String zapatillas) {
        this.zapatillas = zapatillas;
    }

    public String getDescalzo() {
        return descalzo;
    }

    public void setDescalzo(String descalzo) {
        this.descalzo = descalzo;
    }

  
    //metodo toString
    @Override
    public String toString() {
        return "Atleta{" + "mayas=" + mayas + ", pantaloncitos=" + pantaloncitos + ", zapatillas=" + zapatillas + ", descalzo=" + descalzo + '}';
    }

    @Override
    public String correr() {
        return "corro atleticamente";
    }

  
    
}
