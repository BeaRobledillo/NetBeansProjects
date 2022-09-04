package jerarquiade3niveles;

public abstract class Mamifero extends Animal {

    //atributos
    private int tiempoMamando;

    //constructor x defecto
    public Mamifero() {
    }

    //constructor personalizado
    public Mamifero(int tiempoMamando) {
        this.tiempoMamando = tiempoMamando;
    }

    public Mamifero(int tiempoMamando, String comida, int edad, String vivir) {
        super(comida, edad, vivir);
        this.tiempoMamando = tiempoMamando;
    }

    //set & get
    public int getTiempoMamando() {
        return tiempoMamando;
    }

    public void setTiempoMamando(int tiempoMamando) {
        this.tiempoMamando = tiempoMamando;
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
        return "Mamifero{" + "tiempoMamando=" + tiempoMamando + '}';
    }

  

}
