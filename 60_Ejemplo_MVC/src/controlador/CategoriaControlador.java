package controlador;

/**
 * CONTROLADOR: declaramos e implementamos el comportamiento que conecta la
 * vista con el modelo - Declaramos un atributo de tipo vista - Declaramos un
 * atributo de tipo modelo - Métodos para cambiar/obtener datos del modelo:
 * set() y get() de los atributos de la clase del modelo (Cliente) a través del
 * atributo modelo declarado en esta clase - Métodos CRUD (lógica de negocio)
 */
import modelo.Categoria;
import vista.CategoriaVista;

public class CategoriaControlador {

    private CategoriaVista categoriaVista;
    private Categoria categoriaModelo;

    public CategoriaControlador(CategoriaVista CategoriaVista, Categoria CategoriaModelo) {
        this.categoriaVista = CategoriaVista;
        this.categoriaModelo = CategoriaModelo;
    }

    public void setIdCategoria(int categoria) {
        this.categoriaModelo.setIdCategoria(categoria);
    }

    public int getIdCategoria() {
        return this.categoriaModelo.getIdCategoria();
    }

    public void setIva(float iva) {
        this.categoriaModelo.setIva(iva);
    }

    public float getIva() {
        return this.categoriaModelo.getIva();
    }

    public void setDescripcion(String descripcion) {
        this.categoriaModelo.setDescripcion(descripcion);
    }

    public String getDescripcion() {
        return this.categoriaModelo.getDescripcion();
    }

    /**
     * *****************************MÉTODOS CRUD*************************************
     */
    public void verCategoria() {
        categoriaVista.muestraCategoria(categoriaModelo.getIdCategoria(),categoriaModelo.getIva(), categoriaModelo.getDescripcion());
    }

    public void insertarCategoria() {
    }

    public void modificarCategoria() {
    }

    public void eliminarCategoria() {
    }
}
