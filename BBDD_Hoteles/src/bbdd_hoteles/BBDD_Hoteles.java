package bbdd_hoteles;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BBDD_Hoteles {

    public static void main(String[] args) {

        String bbdd = "hoteles";
        String user = "root";
        String pass = "";
        try {
            /*1. Construir la URL de conexión*/
            String cadenaCon = "jdbc:mysql://localhost:3306/" + bbdd;
            /*2. Crear el objeto Connection con la URL anterior*/

            Connection conexion = DriverManager.getConnection(cadenaCon, "root", "");

            /*3. Crear el objeto Statement para lanzar las query a la BBDD*/
            Statement sentencia = conexion.createStatement();
            //mostrarClientes(sentencia);
            //actualizaClientes(sentencia);
            //insertaCliente(sentencia);
            //borrarCliente(sentencia);
            Cliente clienteBuscado = buscarCliente(sentencia);
            if (clienteBuscado != null) {
                System.out.println("El nombre del cliente: ");
                System.out.println(clienteBuscado.getNombre());
            } else {
                System.out.println("Cliente NO encontrado");
            }


            /*5. Liberar los recursos (cerrar Statement y Conncetion)*/
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            System.err.print("SQLException" + ex.getMessage());
        }
    }

    public static void mostrarClientes(Statement sentencia) throws SQLException {
        /* 4. Ejecutar la query a través del objeto Statement y recuperar los datos en un Resulset (si la query es una consulta)*/
        String querySelect = "SELECT * FROM cliente";
        ResultSet resultados = sentencia.executeQuery(querySelect);

        System.out.println("Los clientes que tenemos en el sistema son:");
        while (resultados.next()) {
            System.out.print(resultados.getInt(1) + "\t");
            System.out.print(resultados.getString(2) + "\t");
            System.out.print(resultados.getString(3) + "\t");
            System.out.print(resultados.getString(4) + "\t");
            System.out.println(resultados.getString(5));
        }
    }

    public static void actualizaClientes(Statement sentencia) throws SQLException {
        int result;
        Cliente cliente = buscarCliente(sentencia);
        //....modificamos lo que sea, luego el objeto cliente nos vendrá modificado
        cliente.setPersona("PERSONA ESPECIAL");
        String queryUpdate = "UPDATE cliente SET nombre = '" + cliente.getNombre() + "'"
                + ", direccion = '" + cliente.getDireccion() + "'"
                + ", telefono = '" + cliente.getTelefono() + "'"
                + ", persona = '" + cliente.getPersona() + "'"
                + " WHERE cliente.idCliente = " + cliente.getIdCliente();
       
        result = sentencia.executeUpdate(queryUpdate);
        System.out.println("El número de filas afectadas fue: " + result);

    }

    public static Cliente buscarCliente(Statement sentencia) throws SQLException {
        Cliente clienteResult = null;
        Scanner entrada = new Scanner(System.in);
        int idCliente;
        System.out.print("Introduzca el id de cliente a buscar: ");
        idCliente = entrada.nextInt();

        String querySelectCliente = "SELECT * FROM cliente WHERE idCliente = " + idCliente;
        ResultSet resultados = sentencia.executeQuery(querySelectCliente);

        if (resultados.next()) {
            //Creamos un objeto de tipo Cliente con los datos recuperados en el resultset
            clienteResult = new Cliente(resultados.getInt(1),
                    resultados.getString(2),
                    resultados.getString(3),
                    resultados.getString(4),
                    resultados.getString(5));
        }
        return clienteResult;
    }

    public static void insertarCliente(Statement sentencia) throws SQLException {
        int filasAfectadas;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca los daros del usuario: ");
        System.out.println("Nombre: ");
        //Recogemos nombre
        System.out.println("Dirección: ");
        //Recogemos direccion
        System.out.println("Teléfono: ");
        //recogemos telefono
        System.out.println("Persona de contacto: ");
        //recogemos persona

        String queryInsert = "INSERT INTO cliente (idCliente, nombre, direccion, telefono, persona) VALUES (NULL, 'bea', 'mi barrio', '6969', 'mi mama')";
        filasAfectadas = sentencia.executeUpdate(queryInsert);
        if (filasAfectadas == 1) {
            System.out.println("Inserción realizada correctamente, filas afectadas: " + filasAfectadas);
        } else {
            System.out.println("Problemas en la inserción");
        }
    }

    public static void borrarCliente(Statement sentencia) throws SQLException {
        int filasAfectadas;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Intruduzca el id del cliente que desea borrar: ");
        int idCliente = entrada.nextInt();
        //Aquí, antes de intentar borrar el clinete podemos realizar una búsqueda, si el cliente no consta en la BBDD 
        //ofrecemos un mensaje de error antes de intentar establecer conexión con la BBDD

        String queryDelete = "DELETE FROM cliente WHERE cliente.idCliente =" + idCliente;
        filasAfectadas = sentencia.executeUpdate(queryDelete);
        if (filasAfectadas == 1) {
            System.out.println("Cliente borrado con éxito");
        } else {
            System.out.println("Problemas en el borrado");
        }
    }
}
