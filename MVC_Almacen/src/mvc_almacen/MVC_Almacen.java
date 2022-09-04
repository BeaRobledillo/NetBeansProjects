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
 /*declaramos una vista Producto*/
        ProductoVista vistaProducto = new ProductoVista();
        /*declaramos un modelo*/
        Producto producto = new Producto();
        /*declaramos un controlador de Producto*/
        ProductoControlador controladorProducto = new ProductoControlador(vistaProducto, producto);

        /*listar todos los productos*/
        ArrayList<Producto> todosProductos = new ArrayList<>();
        todosProductos = controladorProducto.leerProductos();

        //MOSTRAR todos los productos
        //controladorProducto.getProductoVista().muestraProductos(todosProductos);
        //BORRAR un producto
        /* controladorProducto.getProductoVista().borrarProducto();
        int idProductoBorrar = entrada.nextInt();
        controladorProducto.borrarProducto(idProductoBorrar);*/
        // int idProductoBorrar = controladorProducto.getProductoVista().borrarProducto();
        // controladorProducto.borrarProducto(idProductoBorrar);
        //controladorProducto.insertarProducto(nombre, 0, descripcion);
        /*INSERTAMOS producto*/
        // Producto productoAux= controladorProducto.getProductoVista().registrarProducto();
        //Producto productoAux = controladorProducto.getProductoVista().registrarProducto();
        // controladorProducto.insertarProducto(productoAux.getNombre(), productoAux.getPrecio(), productoAux.getDescripcion());
        
        /*MODIFICAMOS UN PRODUCTO*/
        //1º buscamos el producto a modificar
        int idProductoModificar=controladorProducto.getProductoVista().buscarProducto();
        controladorProducto.setProducto(controladorProducto.leerProducto(idProductoModificar));
        
        Producto productoModificar= controladorProducto.getProductoVista().modirficarProducto(controladorProducto.getProducto());
        controladorProducto.modificarProducto(productoModificar);
        
    }
}
