package controller;

import dao.ProductoDAOImpl;
import idao.iProductoDAO;
import java.util.ArrayList;
import model.Producto;
import view.ProductoVista;

public class ProductoController {

    /*Debemos tener como atributos una instancia de la vista y una instancia de DAOImpl*/
    private ProductoVista vista;
    private iProductoDAO dao;

    public ProductoController() {
        this.vista = new ProductoVista();
        this.dao = new ProductoDAOImpl();//POLIMORFISMO(izda de la asignación es de tipo interfaz)
    }

    public ProductoVista getVista() {
        return vista;
    }

    public void setVista(ProductoVista vista) {
        this.vista = vista;
    }

    public iProductoDAO getDao() {
        return dao;
    }

    public void setDao(iProductoDAO dao) {
        this.dao = dao;
    }

    
    
    /*insertamos cliente: CREATE*/
    public void registrar(Producto producto) {
        dao.insertarProducto(producto);
    }
//llama al DAO para obtener todos los clientes y luego los muestra en la vista

    public void verProducto() {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        productos = dao.leerProductos();
        vista.muestraProductos(productos);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar(Producto producto) {
        dao.modificarProducto(producto);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar(Producto producto) {
        dao.borrarProducto(producto);
    }

}
