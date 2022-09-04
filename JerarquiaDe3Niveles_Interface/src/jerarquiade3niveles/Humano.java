
package jerarquiade3niveles;


public class Humano implements Mascotable{

  //atributos
    private int edad;
    private String nombre;

    //constructor x defecto
    public Humano() {
    }
    
    //constructor personalizado
    public Humano(int edad) {
        this.edad = edad;
    }

    public Humano(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }
    
    //set & get

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Humano{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    

   
    @Override
    public String comer() {
        return "Todos los días varias veces";
    }

    @Override
    public String comoSeMueve() {
        return "andando";
    }
    
    
    
    
}
