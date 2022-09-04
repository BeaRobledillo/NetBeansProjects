package jerarquiade3niveles;

public class Gallina extends Ave {

    //atributos
    private String piar;

    //constructor x defecto
    public Gallina() {
    }

    //constructor personalizado
    public Gallina(String piar, int huevos, String comida, int edad, String vivir) {
        super(huevos, comida, edad, vivir);
        this.piar = piar;
    }

    //set & get
    public String getPiar() {
        return piar;
    }

    public void setPiar(String piar) {
        this.piar = piar;
    }

    @Override
    public String getComida() {
        return comida;
    }

    @Override
    public void setComida(String comida) {
        this.comida = comida;
    }

    //metodo toString
    @Override
    public String toString() {
        return "cococo";
    }

    @Override
    public String comoSeMueve() {
        return "poco a poco";
    }

    @Override
    public String comer() {
        return "maíz";
    }

}
