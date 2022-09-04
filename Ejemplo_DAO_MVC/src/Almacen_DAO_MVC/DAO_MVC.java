package almacen_dao_mvc;

import controller.ProductoController;
import model.Producto;

public class Almacen_DAO_MVC {

    public static void main(String[] args) {
        /*Debemos tener un controlador capaz de manejar el acceso a la BBDD y la vista*/
        //Al llamar al constructor del controller ya tenemos una vista disponible y un acceso a la bbdd de tipo iDAO
        ProductoController productoControlador = new ProductoController();
        
        //1. Creamos un producto nuevo y lo insertamos
        Producto productoNuevo = productoControlador.getVista().registrarProducto();
        productoControlador.getDao().insertarProducto(productoNuevo);
        //2. Listamos un cliente
        //3. Modificamos un cliente
        //4. Borramos un cliente
    }

}