package jerarquia_abstracta_vehiculos;

public class Coche extends Vehiculo {

    private String combustible;

    public Coche() {
    }

    public Coche(String combustible, int ruedas, int cilindros, String manillar) {
        super(ruedas, cilindros, manillar);
        this.combustible = combustible;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "Coche{" +super.toString()+ "combustible=" + combustible + '}';
    }

    @Override
    public String acelerar() {
        return "Piso el pedal del acelerador...";
    }
    
}