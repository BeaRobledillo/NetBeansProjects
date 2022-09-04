package mvc_almacen;

import controlador.ProductoControlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Producto;
import vista.ProductoVista;

public class MVC_Almacen {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*EN LA INTERACCIÓN DEL CONTROLADOR SE ENCUENTRA EL SER CAPAZ DE RECUPERAR LOS DATOS DE LA BBDD Y PASÁRSELOS A LA VISTA*/
 /*esto puede llevarse a cabo desde el interior del controlador mediante la refeencia a la vista que tiene o bien desde aquí*/
 /*es mejor desde el interior del controlador!!!!*/

 /*Declaramos una vista Producto*/
        ProductoVista vistaProducto = new ProductoVista();
        /*Declaramos un modelo*/
        Producto producto = new Producto();

        /*declaramos un controlador de Producto*/
        ProductoControlador controladorProducto = new ProductoControlador(producto, vistaProducto);

        /*listar todos los productos*/
        ArrayList<Producto> todosProductos = new ArrayList<>();
        todosProductos = controladorProducto.leerProductos();
        //MOSTRAMOS TODOS LOS PRODUCTOS
        // controladorProducto.getProductoVista().muestraProductos(todosProductos);

        //BORRAMOS UN PRODUCTO
        /*
       int idProductoBorrar = controladorProducto.getProductoVista().borrarProducto();
       controladorProducto.borrarProducto(idProductoBorrar);
         */
        //INSERTAMOS UN PRODUCTO
        /*
        Producto productoAux = controladorProducto.getProductoVista().registrarProducto();
        controladorProducto.insertarProducto(productoAux.getNombre(), productoAux.getPrecio(), productoAux.getDescripcion());
         */
        //MODIFICAMOS UN PRODUCTO
        //Primero buscamos el prodcuto a modificar:
        int idProductoModificar = controladorProducto.getProductoVista().buscarProducto();
        controladorProducto.setProducto(controladorProducto.leerProducto(idProductoModificar));
        Producto productoModificar = controladorProducto.getProductoVista().modificarProducto(controladorProducto.getProducto());
        controladorProducto.modificarProducto(productoModificar);
    }

}
