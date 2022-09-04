
package jerarquiadeportiva;

public class Caballo implements Galopante{

    String nombre="poni";
    
    public Caballo() {
    }

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    @Override
    public String toString() {
        return "Caballo{" + '}';
    }
    
    
    
    
    @Override
    public String correr(){
        return "yo si que corro y galopo al viernto";
   }
}
