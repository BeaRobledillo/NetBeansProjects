package almacen_dao_mvc;

import controller.ProductoController;
import java.util.ArrayList;
import java.util.Scanner;
import model.Producto;

public class Almacen_DAO_MVC {

    public static void main(String[] args) {
        /*Debemos tener un controlador capaz de manejar el acceso a la BBDD y la vista*/
        //Al llamar al constructor del controller ya tenemos una vista disponible y un acceso a la bbdd de tipo iDAO
        ProductoController productoControlador = new ProductoController();
        menu(productoControlador);

        //2. Listamos un cliente
        //3. Modificamos un cliente
        //4. Borramos un cliente
    }

    public static void menu(ProductoController productoControlador) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("1. INSERTAR");
        System.out.println("2. LEER");
        System.out.println("3. MODIFICAR");
        System.out.println("4. BORRAR");
        System.out.print("Introduzca la opción que desee:");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                registrar(productoControlador);
                break;
            case 2:
                leer(productoControlador);
                break;
            case 3:
                modificar(productoControlador);
                break;
            case 4:
                eliminar(productoControlador);
                break;

        }

    }

    public static void registrar(ProductoController productoControlador) {
        //1. Creamos un producto nuevo y lo insertamos
        Producto productoNuevo = productoControlador.getVista().registrarProducto();
        boolean exitoInsertar = productoControlador.getDao().insertarProducto(productoNuevo);
        if (exitoInsertar) {
            System.out.println("Producto Insertado Correctamente");
        }
    }

    public static void leer(ProductoController productoControlador) {
        ArrayList<Producto> lista = new ArrayList<>();
        lista = productoControlador.getDao().leerProductos();
        productoControlador.getVista().muestraProductos(lista);
    }

    public static void modificar(ProductoController productoControlador) {
        /*Obtenemos todos los productos*/
        ArrayList<Producto> lista = new ArrayList<>();
        lista = productoControlador.getDao().leerProductos();
        productoControlador.getVista().muestraProductos(lista);

        int idProducto = productoControlador.getVista().buscarProducto();

        for (Producto producto : lista) {
            if (producto.getIdProducto() == idProducto) {
                Producto productoModificar = productoControlador.getVista().modificarProducto(producto);
                boolean exito = productoControlador.getDao().modificarProducto(productoModificar);
                if (exito) {
                    System.out.println("Modificación realizada con éxito");
                }
            }
        }

    }

    public static void eliminar(ProductoController productoControlador) {
        /*Obtenemos todos los productos*/
        ArrayList<Producto> lista = new ArrayList<>();
        lista = productoControlador.getDao().leerProductos();
        productoControlador.getVista().muestraProductos(lista);

        int idProducto = productoControlador.getVista().borrarProducto();

        for (Producto producto : lista) {
            if (producto.getIdProducto() == idProducto) {
                boolean exito = productoControlador.getDao().borrarProducto(producto);
                if (exito) {
                    System.out.println("Producto borrado con éxito");
                }
            }
        }
    }
}
