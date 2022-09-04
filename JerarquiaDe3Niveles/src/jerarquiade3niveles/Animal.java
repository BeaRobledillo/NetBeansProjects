
package jerarquiade3niveles;


public abstract class Animal {
    
    //atributos
    protected String comida;
    private int edad;
    private String vivir;

    //constructor x defecto
    public Animal() {
    }

    //constructor personalizado
    public Animal(String comida, int edad, String vivir) {
        this.comida = comida;
        this.edad = edad;
        this.vivir = vivir;
    }

   //get & set
    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVivir() {
        return vivir;
    }

    public void setVivir(String vivir) {
        this.vivir = vivir;
    }

    
    //metodo toString
    @Override
    public String toString() {
        return "Animal{" + "comida=" + comida + ", edad=" + edad + ", vivir=" + vivir + '}';
    }
    
    
    //metodo comoSeMueve
    public abstract String comoSeMueve();
    
    
    //metodo cuanto/como come
    public abstract String comer();
    
}

