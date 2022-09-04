package dao;

import idao.iClienteDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Cliente;
import conexion.ConexionBBDD;
import java.sql.ResultSet;

public class ClienteDAO implements iClienteDAO {

    @Override
    public boolean insertarCliente(Cliente cliente) {
        boolean exito = false;

        Connection conexion = null;
        Statement sentencia = null;

        String query = "INSERT INTO cliente values (NULL,'" + cliente.getNombre() + "','" + cliente.getDireccion() + "','" + cliente.getTelefono() + "','" + cliente.getPersona() + "')";

        try {
            conexion = ConexionBBDD.conectar();
            sentencia = conexion.createStatement();
            sentencia.execute(query);
            exito = true;
            sentencia.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error en el registro de Cliente...");
            e.printStackTrace();
        }
        return exito;
    }

    @Override
    public ArrayList<Cliente> leerClientes() {
        Connection conexion = null;
        Statement sentencia = null;
        ResultSet resultados = null;

        String query = "SELECT * FROM CLIENTE";
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            conexion = ConexionBBDD.conectar();
            sentencia = conexion.createStatement();
            resultados = sentencia.executeQuery(query);
            while (resultados.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultados.getInt(1));
                cliente.setNombre(resultados.getString(2));
                cliente.setDireccion(resultados.getString(3));
                cliente.setTelefono(resultados.getString(4));
                cliente.setPersona(resultados.getString(5));
                lista.add(cliente);
            }
            sentencia.close();
            resultados.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error en el método leerClientes...");
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        boolean exito = false;

        Connection conexion = null;
        Statement sentencia = null;

        String query = "UPDATE CLIENTE SET "
                + "nombre='" + cliente.getNombre() + "', "
                + "direccion='" + cliente.getDireccion() + "', "
                + "telefono='" + cliente.getTelefono() + "', "
                + "persona='" + cliente.getPersona() + "'"
                + " WHERE ID=" + cliente.getIdCliente();
        try {
            conexion = ConexionBBDD.conectar();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
            //Podríamos devolver el núemro de filas afectadas (Idem para la inserción)
            exito = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return exito;
    }

    @Override
    public boolean borrarCliente(Cliente cliente) {
         boolean exito = false;
        Connection conexion = null;
        Statement sentencia = null;

        String query = "DELETE FROM cliente WHERE idCliente =" + cliente.getIdCliente();
        try {
            conexion = ConexionBBDD.conectar();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
            exito = true;
        } catch (SQLException e) {
            System.out.println("Error en eliminarCliente()...");
            e.printStackTrace();
        }
        return exito;
    }

}
