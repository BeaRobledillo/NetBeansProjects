
package jerarquiadeportiva;


public class Palomero extends Futbolista{
    //atributos
    String minutosQuieto;

    //constructor x defecto
    public Palomero() {
    }
    
    //constructores personalizados
    public Palomero(String minutosQuieto) {
        this.minutosQuieto = minutosQuieto;
    }

    public Palomero(String minutosQuieto, String balon, String cespedArtificial, String cespedNatural) {
        super(balon, cespedArtificial, cespedNatural);
        this.minutosQuieto = minutosQuieto;
    }

    public Palomero(String minutosQuieto, String balon, String cespedArtificial, String cespedNatural, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(balon, cespedArtificial, cespedNatural, nombre, edad, premiosIndividual, premiosColectivo);
        this.minutosQuieto = minutosQuieto;
    }

    
    //get & set
    public String getMinutosQuieto() {
        return minutosQuieto;
    }

    public void setMinutosQuieto(String minutosQuieto) {
        this.minutosQuieto = minutosQuieto;
    }

    
    //metodo toString
    @Override
    public String toString() {
        return "Palomero{" + "minutosQuieto=" + minutosQuieto + '}'; 
    }

    //metodo forma de correr
    @Override
    public String correr() {
        return "no corro mucho, estoy parado casi todo el partit"; 
    }
   
    
    
    
}
