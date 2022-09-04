package vista;

public class CategoriaVista {
    public void muestraCategoria(int idCategoria, float iva, String descripcion){
        System.out.println("Los datos de la categoría son:");
        System.out.println("Identificador: " + idCategoria);
        System.out.println("IVA: " + iva);
        System.out.println("Descripcion: " + descripcion);
        
    }
}
