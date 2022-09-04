package ejemplothis;

public class Estudiante {

    String nombre;
    int id;

    /*En este ejemplo podemos observar la utilización de la palabra reservada 'this' para diferenciar entre
    el atributo que recibe un valor (ya sea en el constructor o en un método set) y el parámetro que será recibido 
    por cabecera de los métodos implicados (ya sea en el constructor o en un método set)
    */
    public Estudiante() {
    }

    public Estudiante(String nombre, int id) {
        this();//además podemos utilizar la palabra reservada this para invocar la ejecución de constructores
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", id=" + id + '}';
    }

}
