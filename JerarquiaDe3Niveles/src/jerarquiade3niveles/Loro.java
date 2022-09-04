package jerarquiade3niveles;

public class Loro extends Ave {

    //atributos
    private String piar;

    //constructor x defecto
    public Loro() {
    }

//constructor personalizado
    public Loro(int huevos, String comida, int edad, String vivir) {
        super(huevos, comida, edad, vivir);
    }

    public Loro(String piar, int huevos, String comida, int edad, String vivir) {
        super(huevos, comida, edad, vivir);
        this.piar = piar;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Lorito Guapo";
    }

    @Override
    public String comoSeMueve() {
        return "volando voy";
    }

    @Override
    public String comer() {
        return "pipas";
    }

}
