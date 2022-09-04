package dao;

import conexion.Conexion;
import idao.iProductoDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Producto;

public class ProductoDAOImpl implements iProductoDAO {
//ATRUBITO ARRAYLIST????

    @Override
    public boolean insertarProducto(Producto producto) {
        Connection conexion = Conexion.conectar();
        Statement sentencia;
        String query;
        int filasAfectadas;
        boolean resultado = false;
        try {
            query = "INSERT INTO producto (idProducto, nombre, precio, descripcion) "
                    + "VALUES (NULL, '" + producto.getNombre() + "', '" + producto.getPrecio() + "', '" + producto.getDescripcion() + "'); ";
            sentencia = conexion.createStatement();
            filasAfectadas = sentencia.executeUpdate(query);
            //System.out.println("El número de registros insertados fue de: " + filasAfectadas);
            resultado = true;

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la insercion de producto:");
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public ArrayList<Producto> leerProductos() {
        ArrayList listaProductos = new ArrayList<>();
        String query = "SELECT * FROM producto";
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();

            ResultSet resultados = sentencia.executeQuery(query);
            while (resultados.next()) {
                //añadimos a la lista un producto que creamos con los datos que recuperamos de la BBDD
                listaProductos.add(new Producto(resultados.getInt(1), resultados.getString(2), resultados.getFloat(3), resultados.getString(4)));
            }
            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la recuperación de los productos");
            e.printStackTrace();
        }

        return listaProductos;
    }

    @Override
    public boolean modificarProducto(Producto producto) {
        boolean resultado = false;
        String query = "UPDATE producto SET "
                + "nombre = '" + producto.getNombre() + "', "
                + "precio = '" + producto.getPrecio() + "', "
                + "descripcion = '" + producto.getDescripcion() + "' "
                + "WHERE producto.idProducto = " + producto.getIdProducto();
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();
            int filasAfectadas = sentencia.executeUpdate(query);
            // System.out.println("Actualización completada. Filas afectadas: " + filasAfectadas);
            resultado = true;

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println("Problemas en la actualización");
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public boolean borrarProducto(Producto producto) {
        boolean resultado = false;
        String query = "DELETE FROM producto WHERE idProducto = " + producto.getIdProducto();
        try {
            Connection conexion = Conexion.conectar();
            Statement sentencia = conexion.createStatement();
            int filasAfectadas = sentencia.executeUpdate(query);
            //System.out.println("Eliminación realizada con éxito. Filas afectadas: " + filasAfectadas);
            resultado = true;

            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Algo fue mal en el borredo de productos.");
            e.printStackTrace();;
        }

        return resultado;
    }

}
