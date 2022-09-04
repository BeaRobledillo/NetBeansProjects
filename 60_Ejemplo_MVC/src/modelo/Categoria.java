package modelo;

public class Categoria {
    private int idCategoria;
    private float iva;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int idCategoria, float iva, String descripcion) {
        this.idCategoria = idCategoria;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    

}
