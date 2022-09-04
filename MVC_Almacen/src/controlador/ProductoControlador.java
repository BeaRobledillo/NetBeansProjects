package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Producto;
import vista.ProductoVista;

public class ProductoControlador {
    //atributo de tipo vista 
    private ProductoVista productoVista;
    //y atributo de tipo modelo
    private Producto producto;

    //constructores
    public ProductoControlador() {
    }

    public ProductoControlador(ProductoVista productoVista, Producto producto) {
        this.productoVista = productoVista;
        this.producto = producto;
    }

    
    //get y set de producto y de productoVista
    public ProductoVista getProductoVista() {
        return productoVista;
    }

    public void setProductoVista(ProductoVista productoVista) {
        this.productoVista = productoVista;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    //set y get de todos los atributos del modelo
    //no se pueden hacer automatizados
    public int getIdProducto() {
        return producto.getIdProducto();
    }

    public void setIdProducto(int idProducto) {
        this.producto.setIdProducto(idProducto);
    }

    public String getNombre() {
        return producto.getNombre();
    }

    public void setNombre(String nombre) {
        this.producto.setNombre(nombre);
    }

    public float getPrecio() {
        return producto.getPrecio();
    }

    public void setPrecio(float precio) {
        this.producto.setPrecio(precio);
    }

    public String getDescripcion() {
        return producto.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        this.producto.setDescripcion(descripcion);
    }

    //metodos CRUD
    public void insertarProducto(String nombre, float precio, String descripcion) {//Create
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        String query;
        int filasAfectadas;
        try {
            query = "INSERT INTO producto (idProducto, nombre, precio, descripcion) "
                    + "VALUES (NULL, '" + nombre + "', '" + precio + "', '" + descripcion + "'); ";
            sentencia = conexion.createStatement();
            filasAfectadas = sentencia.executeUpdate(query);
            System.out.println("El número de registros insertados fue de: " + filasAfectadas);

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la insercion de producto:");
            e.printStackTrace();
        }

    }

    public ArrayList<Producto> leerProductos() //READ
    {
        ArrayList listaProductos = new ArrayList<>();

        String query = "SELECT * FROM producto";
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();
            sentencia = conexion.createStatement();
            ResultSet resultados = sentencia.executeQuery(query);
            while (resultados.next()) {
                listaProductos.add(new Producto(resultados.getInt(1), resultados.getString(2), resultados.getFloat(3), resultados.getString(4)));
            }
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la recuperación del producto");
            e.printStackTrace();
        }
        return listaProductos;
    }

    public Producto leerProducto(int idProducto) {//Read
        Producto productoAux = null;
        String query = "SELECT * FROM producto WHERE idProducto = " + idProducto;
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();

            ResultSet resultados = sentencia.executeQuery(query);
            if (resultados.next()) {
                //añadimos a la lista un producto que creamos con los datos que recuperamos de la BBDD
                productoAux = new Producto(resultados.getInt(1), resultados.getString(2), resultados.getFloat(3), resultados.getString(4));
            }
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la recu`peración de los productos");
            e.printStackTrace();
        }

        return productoAux;
    }

    public void modificarProducto(Producto producto) {//Update
        String query = "UPDATE producto SET "
                + "nombre = '" + producto.getNombre() + "', "
                + "precio = '" + producto.getPrecio() + "', "
                + "descripcion = '" + producto.getDescripcion() + "' "
                + "WHERE producto.idProducto = " + producto.getIdProducto();
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();
            int filasAfectadas = sentencia.executeUpdate(query);
            System.out.println("Actualización completada. Filas afectadas: " + filasAfectadas);

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la actualización");
            e.printStackTrace();
        }

    }

    public void borrarProducto(int idProducto) {//Delete
        String query = "DELETE FROM producto WHERE idProducto = " + idProducto;
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();
            int filasAfectadas = sentencia.executeUpdate(query);
            System.out.println("Eliminación realizada con éxito. Filas afectadas: " + filasAfectadas);

            sentencia.close();
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println("Algo fue mal en el borrado de productos.");
            e.printStackTrace();;
        }

    }

}
