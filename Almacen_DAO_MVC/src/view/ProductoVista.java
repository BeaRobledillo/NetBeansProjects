package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Producto;

public class ProductoVista {

    public void muestraProductos(ArrayList<Producto> todosProductos) {
        for (Producto producto : todosProductos) {
            System.out.println(producto.toString());

        }
    }

    /*declaramos un método que muestre los datos de un producto*/
    public void muestraProducto(Producto producto) {
        producto.toString();
    }

    public int borrarProducto() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el identificador del producto que desea borrar: ");
        int idProducto = entrada.nextInt();
        return idProducto;
    }

    public Producto registrarProducto() {
        Scanner entrada = new Scanner(System.in);

        Producto productoAux = new Producto();
        System.out.println("Introduzca el valor de los datos del nuevo producto:");
        System.out.print("Introduzca el nombre: ");
        productoAux.setNombre(entrada.nextLine());

        System.out.print("Introduzca el precio: ");
        productoAux.setPrecio(entrada.nextFloat());
        entrada.nextLine();

        System.out.print("Introduzca la descripción: ");
        productoAux.setDescripcion(entrada.nextLine());

        //OJO TENEMOS QUE TENER EN CUENTA QUE LE PRODCUTO ACTUALMENTE TIENE UN 0 EN EL ATRIBUTO idProducto
        return productoAux;

    }

    public int buscarProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el id de producto a buscar: ");
        int idProducto = entrada.nextInt();
        return idProducto;
    }

    public Producto modificarProducto(Producto productoActual) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un nuevo nombre (" + productoActual.getNombre() + ")");
        productoActual.setNombre(entrada.nextLine());
        System.out.println("Introduzca un nuevo precio (" + productoActual.getPrecio() + ")");
        productoActual.setPrecio(entrada.nextFloat());
        entrada.nextLine();
        System.out.println("Introduzca una nueva descripción (" + productoActual.getDescripcion() + ")");
        productoActual.setDescripcion(entrada.nextLine());

        return new Producto(productoActual.getIdProducto(), productoActual.getNombre(), productoActual.getPrecio(), productoActual.getDescripcion());

    }

}
