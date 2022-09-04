
package jerarquiadeportiva;

public class Tirafondista extends Atleta {
    //atributos
    String mejorTiempo;
    String distanciaMasLarga;
    
    //constructor x defecto

    public Tirafondista() {
    }
    
    
    //constructores personalizados

    public Tirafondista(String mejorTiempo, String distanciaMasLarga) {
        this.mejorTiempo = mejorTiempo;
        this.distanciaMasLarga = distanciaMasLarga;
    }

    public Tirafondista(String mejorTiempo, String distanciaMasLarga, String mayas, String pantaloncitos, String zapatillas, String descalzo) {
        super(mayas, pantaloncitos, zapatillas, descalzo);
        this.mejorTiempo = mejorTiempo;
        this.distanciaMasLarga = distanciaMasLarga;
    }

    public Tirafondista(String mejorTiempo, String distanciaMasLarga, String mayas, String pantaloncitos, String zapatillas, String descalzo, String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        super(mayas, pantaloncitos, zapatillas, descalzo, nombre, edad, premiosIndividual, premiosColectivo);
        this.mejorTiempo = mejorTiempo;
        this.distanciaMasLarga = distanciaMasLarga;
    }
    
    
    //get & set
    public String getMejorTiempo() {
        return mejorTiempo;
    }

    public void setMejorTiempo(String mejorTiempo) {
        this.mejorTiempo = mejorTiempo;
    }

    public String getDistanciaMasLarga() {
        return distanciaMasLarga;
    }

    public void setDistanciaMasLarga(String distanciaMasLarga) {
        this.distanciaMasLarga = distanciaMasLarga;
    }

    
    //metodo toString
    @Override
    public String toString() {
        return "Tirafondista{" + "mejorTiempo=" + mejorTiempo + ", distanciaMasLarga=" + distanciaMasLarga + '}';
    }

    @Override
    public String correr() {
        return "corro como un rayo"; 
    }
    
    
    
}
