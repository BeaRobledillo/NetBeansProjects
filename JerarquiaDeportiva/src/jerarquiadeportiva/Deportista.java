package jerarquiadeportiva;

public abstract class Deportista {

    //atributos
    String nombre;
    int edad;
    String premiosIndividual;
    String premiosColectivo;

    //constructor x defecto
    public Deportista() {
    }

    //constructor personalizado
    public Deportista(String nombre, int edad, String premiosIndividual, String premiosColectivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.premiosIndividual = premiosIndividual;
        this.premiosColectivo = premiosColectivo;
    }

    //get & set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPremiosIndividual() {
        return premiosIndividual;
    }

    public void setPremiosIndividual(String premiosIndividual) {
        this.premiosIndividual = premiosIndividual;
    }

    public String getPremiosColectivo() {
        return premiosColectivo;
    }

    public void setPremiosColectivo(String premiosColectivo) {
        this.premiosColectivo = premiosColectivo;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Deportista{" + "nombre=" + nombre + ", edad=" + edad + ", premiosIndividual=" + premiosIndividual + ", premiosColectivo=" + premiosColectivo + '}';
    }
    
    
    //metodo de forma de correr
    public String correr(){
        return "corro deportivamente";
    }
    

}
