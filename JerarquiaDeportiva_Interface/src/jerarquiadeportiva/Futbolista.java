
package jerarquiadeportiva;


public class Futbolista extends Deportista {
    //atributos
    String balon;
    String cespedArtificial;
    String cespedNatural;
    
    //constructor x defecto
    public Futbolista() {
    }
    
    //constructores personalizados
    public Futbolista(String balon, String cespedArtificial, String cespedNatural) {
        this.balon = balon;
        this.cespedArtificial = cespedArtificial;
        this.cespedNatural = cespedNatural;
    }

    public Futbolista(String balon, String cespedArtificial, String cespedNatural, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(nombre, edad, premiosIndividual, premiosColectivo);
        this.balon = balon;
        this.cespedArtificial = cespedArtificial;
        this.cespedNatural = cespedNatural;
    }

    //get & set
    public String getBalon() {
        return balon;
    }

    public void setBalon(String balon) {
        this.balon = balon;
    }

    public String getCespedArtificial() {
        return cespedArtificial;
    }

    public void setCespedArtificial(String cespedArtificial) {
        this.cespedArtificial = cespedArtificial;
    }

    public String getCespedNatural() {
        return cespedNatural;
    }

    public void setCespedNatural(String cespedNatural) {
        this.cespedNatural = cespedNatural;
    }


    
    
    //metodo toString
    @Override
    public String toString() {
        return "Futbolista{" + "balon=" + balon + ", cespedArtificial=" + cespedArtificial + ", cespedNatural=" + cespedNatural + '}';
    }

    @Override
    public String correr() {
        return "corro futbolisticamente";
    }
    

   
    
}
