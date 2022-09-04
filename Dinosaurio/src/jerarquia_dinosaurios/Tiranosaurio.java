package jerarquia_dinosaurios;

public class Tiranosaurio extends Dinosaurio{

    private int numPresas;
    private int dientes;

    public Tiranosaurio() {
    }

    public Tiranosaurio(int numPresas, int dientes, String nombre, float altura, int numExtremidades, String dieta) {
        super(nombre, altura, numExtremidades, dieta);
        this.numPresas = numPresas;
        this.dientes = dientes;
    }

    public int getNumPresas() {
        return numPresas;
    }

    public void setNumPresas(int numPresas) {
        this.numPresas = numPresas;
    }

    public int getDientes() {
        return dientes;
    }

    public void setDientes(int dientes) {
        this.dientes = dientes;
    }

    @Override
    public String toString() {
        return super.toString() +  "Tiranosaurio{" + "numPresas=" + numPresas + ", dientes=" + dientes + '}';
    }

    public void romperValla(){
        System.out.println("Voy a romper la valla y verás...");
    }
}