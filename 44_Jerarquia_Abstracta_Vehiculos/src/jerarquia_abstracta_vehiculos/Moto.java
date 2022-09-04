package jerarquia_abstracta_vehiculos;

public class Moto extends Vehiculo {

    private float decibelios;

    public Moto() {
    }

    public Moto(float decibelios, int ruedas, int cilindros, String manillar) {
        super(ruedas, cilindros, manillar);
        this.decibelios = decibelios;
    }

    public float getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(float decibelios) {
        this.decibelios = decibelios;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() + "decibelios=" + decibelios + '}';
    }

    @Override
    public String acelerar() {
        return "girando lentamente el puño del acelarador...";
    }
    
}
