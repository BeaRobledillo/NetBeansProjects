package jerarquiadeportiva;

public class Portero extends Futbolista {

    //atributos
    String tallaGuantes;
    String manoCambiada;

    //constructor x defecto
    public Portero() {
    }

    //constructores personalizados
    public Portero(String tallaGuantes, String manoCambiada) {
        this.tallaGuantes = tallaGuantes;
        this.manoCambiada = manoCambiada;
    }

    public Portero(String tallaGuantes, String manoCambiada, String balon, String cespedArtificial, String cespedNatural) {
        super(balon, cespedArtificial, cespedNatural);
        this.tallaGuantes = tallaGuantes;
        this.manoCambiada = manoCambiada;
    }

    public Portero(String tallaGuantes, String manoCambiada, String balon, String cespedArtificial, String cespedNatural, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(balon, cespedArtificial, cespedNatural, nombre, edad, premiosIndividual, premiosColectivo);
        this.tallaGuantes = tallaGuantes;
        this.manoCambiada = manoCambiada;
    }

    //get & set
    public String getTallaGuantes() {
        return tallaGuantes;
    }

    public void setTallaGuantes(String tallaGuantes) {
        this.tallaGuantes = tallaGuantes;
    }

    public String getManoCambiada() {
        return manoCambiada;
    }

    public void setManoCambiada(String manoCambiada) {
        this.manoCambiada = manoCambiada;
    }

    //metodo tString
    @Override
    public String toString() {
        return "Portero{" + "tallaGuantes=" + tallaGuantes + ", manoCambiada=" + manoCambiada + '}';
    }

    //metodo forma de correr
    @Override
    public String correr() {
        return "corro poco, estoy de arquero";
    }

}
