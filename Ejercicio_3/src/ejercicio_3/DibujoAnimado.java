package ejercicio_3;

//clase DibujoAnimado (clase madre)
public abstract class DibujoAnimado {

    //atributos:
    private String nombre;
    private int anioAparicion;
    private String fraseCaracteristica;

    //constructor x defecto
    public DibujoAnimado() {
    }

    //constructor personalizado
    public DibujoAnimado(String nombre, int anioAparicion, String fraseCaracteristica) {
        this.nombre = nombre;
        this.anioAparicion = anioAparicion;
        this.fraseCaracteristica = fraseCaracteristica;
    }

    //get & set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioAparicion() {
        return anioAparicion;
    }

    public void setAnioAparicion(int anioAparicion) {
        this.anioAparicion = anioAparicion;
    }

    public String getFraseCaracteristica() {
        return fraseCaracteristica;
    }

    public void setFraseCaracteristica(String fraseCaracteristica) {
        this.fraseCaracteristica = fraseCaracteristica;
    }

    //metodo toString()
    @Override
    public String toString() {
        return "DibujoAnimado{" + "nombre=" + nombre + ", anioAparicion=" + anioAparicion + ", fraseCaracteristica=" + fraseCaracteristica + '}';
    }

    /*metodo alegrarAlPersonal() que nos
    devuelva un String con una frase característica de cada uno de ellos.*/
    public abstract String alegrarAlPersonal();

}
