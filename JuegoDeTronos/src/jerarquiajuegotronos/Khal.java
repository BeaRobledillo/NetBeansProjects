
package jerarquiajuegotronos;


public class Khal extends Dothrakis{
    String jinetePrefe;
    String añosColeta;

    public Khal() {
    }

    public Khal(String jinetePrefe, String añosColeta) {
        this.jinetePrefe = jinetePrefe;
        this.añosColeta = añosColeta;
    }

    public Khal(String jinetePrefe, String añosColeta, int numCaballos) {
        super(numCaballos);
        this.jinetePrefe = jinetePrefe;
        this.añosColeta = añosColeta;
    }

    public Khal(String jinetePrefe, String añosColeta, int numCaballos, String familia, String nombre, String titulo) {
        super(numCaballos, familia, nombre, titulo);
        this.jinetePrefe = jinetePrefe;
        this.añosColeta = añosColeta;
    }

    public String getJinetePrefe() {
        return jinetePrefe;
    }

    public void setJinetePrefe(String jinetePrefe) {
        this.jinetePrefe = jinetePrefe;
    }

    public String getAñosColeta() {
        return añosColeta;
    }

    public void setAñosColeta(String añosColeta) {
        this.añosColeta = añosColeta;
    }

    @Override
    public String toString() {
        return "Khal{" + "jinetePrefe=" + jinetePrefe + ", a\u00f1osColeta=" + añosColeta + '}';
    }
    
    
    
    
}
