
package jerarquiade3niveles;


public class Gato extends Mamifero {
    
    //atributos
    private final String rugido = "MIAU";

    
    //constructor x defecto
    
    public Gato() {
    }

    
    //constructor personalizado
    public Gato(int tiempoMamando, String comida, int edad, String vivir) {
        super(tiempoMamando, comida, edad, vivir);
    }
    
    
    //set & get
    public String getRugido() {
        return rugido;
    }

   

    public Gato(int tiempoMamando) {
        super(tiempoMamando);
    }


    @Override
    public String comoSeMueve() {
        return "sigiloso";
    }

    @Override
    public String comer() {
        return "a diario";
    }

    @Override
    public String toString() {
        return "Gato{" + "rugido=" + rugido + '}';
    }

    
    
}
