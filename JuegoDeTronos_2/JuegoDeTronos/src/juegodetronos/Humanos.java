package juegodetronos;

abstract class Humanos implements Actuar{
    
    private String familia;
    private String nombre;
    private String titulo;

    public Humanos() {
    }

    public Humanos(String familia, String nombre, String titulo) {
        this.familia = familia;
        this.nombre = nombre;
        this.titulo = titulo;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Humanos{" + "familia=" + familia + ", nombre=" + nombre + ", titulo=" + titulo + '}';
    }
    
  
}
