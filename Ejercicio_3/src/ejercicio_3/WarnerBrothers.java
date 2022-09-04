package ejercicio_3;

//clase de productora WarnerBrothers que hereda de la clase DibujoAnimado
public abstract class WarnerBrothers extends DibujoAnimado {

    //atributo
    protected int numIntegrantes;
    //constructores

    public WarnerBrothers() {
    }

    public WarnerBrothers(int numIntegrantes, String nombre, int anioAparicion, String fraseCaracteristica) {
        super(nombre, anioAparicion, fraseCaracteristica);
        this.numIntegrantes = numIntegrantes;
    }

    //get & set
    public int getNumIntegrantes() {
        return numIntegrantes;
    }

    public void setNumIntegrantes(int numIntegrantes) {
        this.numIntegrantes = numIntegrantes;
    }

    //metodo toString
    @Override
    public String toString() {
        return "WarnerBrothers{" + "numIntegrantes=" + numIntegrantes + '}';
    }

}
