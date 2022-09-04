
package jerarquiadeportiva;


public class Vallista extends Atleta {
//atributos
String vallasTiradas;

    public Vallista() {
    }

    public Vallista(String vallasTiradas) {
        this.vallasTiradas = vallasTiradas;
    }

    public Vallista(String vallasTiradas, String mayas, String pantaloncitos, String zapatillas, String descalzo) {
        super(mayas, pantaloncitos, zapatillas, descalzo);
        this.vallasTiradas = vallasTiradas;
    }

    public Vallista(String vallasTiradas, String mayas, String pantaloncitos, String zapatillas, String descalzo, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(mayas, pantaloncitos, zapatillas, descalzo, nombre, edad, premiosIndividual, premiosColectivo);
        this.vallasTiradas = vallasTiradas;
    }

    public String getVallasTiradas() {
        return vallasTiradas;
    }

    public void setVallasTiradas(String vallasTiradas) {
        this.vallasTiradas = vallasTiradas;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Vallista{" + "vallasTiradas=" + vallasTiradas + '}';
    }

    //metodo correr
    @Override
    public String correr() {
        return "corro y salto vallas como un potrillo"; 
    }



}
