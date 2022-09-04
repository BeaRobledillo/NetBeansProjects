package jerarquia_abstracta_vehiculos;

public class Bicicleta extends Vehiculo{

    private int ruedines;

    public Bicicleta() {
    }

    public Bicicleta(int ruedines, int ruedas, int cilindros, String manillar) {
         super(ruedas, cilindros, manillar);
        this.ruedines = ruedines;
    }

    public int getRuedines() {
        return ruedines;
    }

    public void setRuedines(int ruedines) {
        this.ruedines = ruedines;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + super.toString() + "ruedines=" + ruedines + '}';
    }

    @Override
    public String acelerar() {
        return "Le damos fuerte al pedal y allá vamos...";
    }

}
