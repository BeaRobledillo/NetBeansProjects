package jerarquia_abstracta_vehiculos;

public abstract class Vehiculo {
    protected int ruedas;
    protected int cilindros;
    protected String manillar;

    protected Vehiculo() {
    }

    protected Vehiculo(int ruedas, int cilindros, String manillar) {
        this.ruedas = ruedas;
        this.cilindros = cilindros;
        this.manillar = manillar;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getManillar() {
        return manillar;
    }

    public void setManillar(String manillar) {
        this.manillar = manillar;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "ruedas=" + ruedas + ", cilindros=" + cilindros + ", manillar=" + manillar + '}';
    }
    
    /*Definimos este método como abstracto debido a que no sabemos cómo acelera un vehículo de forma general*/
    public abstract String acelerar();    
}
