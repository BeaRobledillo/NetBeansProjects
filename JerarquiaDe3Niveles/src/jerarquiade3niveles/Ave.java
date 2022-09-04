
package jerarquiade3niveles;

/**
 *
 * @author beari
 */
public abstract class Ave extends Animal {
    
    //atributos
    private int huevos;

    //constructor x defecto
    public Ave() {
    }

    //constructor personalizado
    public Ave(int huevos, String comida, int edad, String vivir) {
        super(comida, edad, vivir);
        this.huevos = huevos;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Ave{" + "huevos=" + huevos + '}';
    }

    //get & set
    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    @Override
    public String getComida() {
        return comida;
    }

    
    @Override
    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    public String comoSeMueve() {
       return "volando vengo...";
    }

    @Override
    public String comer() {
       return "picoteo todo el día";
    }
    
    
    
}
