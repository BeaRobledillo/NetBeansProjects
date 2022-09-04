package bbdd_hoteles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BBDD_Hoteles {

    public static void main(String[] args) {

        String bbdd = "hoteles";
        String user = "root";
        
        String pass = "";
        try {
            /*1. Construir la URL de conexión*/
            String cadenaCon = "jdbc:mysql://localhost:3306/" + bbdd;
            /*2. Crear el objeto Connection con la URL anterior*/

            Connection conexion = DriverManager.getConnection(cadenaCon, user, pass);

            /*3. Crear el objeto Statement para lanzar las query a la BBDD*/
            Statement sentencia = conexion.createStatement();
            //mostrarClientes(sentencia);
            actualizaClientes(sentencia);
            //insertarCliente(sentencia);
            //borrarCliente(sentencia);
            /*Cliente clienteBuscado = buscarCliente(sentencia);
            if (clienteBuscado != null) {
                System.out.print("El nombre del cliente: ");
                System.out.println(clienteBuscado.getNombre());
                
            } else {
                System.out.println("NO ENCONTRADO");
            }*/


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
        cliente = introDatos(cliente, false);

        String queryUpdate = "UPDATE cliente SET nombre = '" + cliente.getNombre() + "'"
                + ", direccion = '" + cliente.getDireccion() + "'"
                + ", telefono = '" + cliente.getTelefono() + "'"
                + ", persona = '" + cliente.getPersona() + "'"
                + " WHERE cliente.idCliente = " + cliente.getIdCliente();
        System.out.println(queryUpdate);

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
        } else {
            System.out.println("CLIENTE NO ENCONTRADO!!!");
        }
        return clienteResult;
    }

    public static void insertarCliente(Statement sentencia) throws SQLException {
        int filasAfectadas;

        /**
         * LLAMADA AL MÉTODO QUE pregunta datos de UN CLIENTE
         */
        Cliente clienteNuevo = introDatos(null, true);
        /**
         * ***********************************************************
         */
        String queryInsert = "INSERT INTO cliente (idCliente, nombre, direccion, telefono, persona) "
                + "VALUES "
                + "(" + null + ""
                + ", '" + clienteNuevo.getNombre() + "'"
                + ", '" + clienteNuevo.getDireccion() + "'"
                + ", '" + clienteNuevo.getTelefono() + "'"
                + ", '" + clienteNuevo.getPersona() + "')";

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
        System.out.print("Introduzca el identificador del cliente que desea borrar: ");
        int idCliente = entrada.nextInt();
        //Aquí, antes de intentar borrar el clieNte podemos realizar una búsqueda, si el cliente no consta en la BBDD 
        //ofrecemos un mensaje de error antes de intentar establecer conexión con la BBDD

        String queryDelete = "DELETE FROM cliente WHERE cliente.idCliente =" + idCliente;
        filasAfectadas = sentencia.executeUpdate(queryDelete);
        if (filasAfectadas == 1) {
            System.out.println("Cliente borrado con éxito");
        } else {
            System.out.println("Problemas en el borrado");
        }
    }

    public static Cliente introDatos(Cliente cliente, boolean insercion_o_No) {
        Scanner entrada = new Scanner(System.in);
        Cliente clienteAux = new Cliente();
        String frase;
        //Concedemos el valor del idCliente del objeto buscado antes de ser modificado y que recibimos por cabecera
        //al onjeto Cliente local de este método que será devuelto
        if (!insercion_o_No) {
            clienteAux.setIdCliente(cliente.getIdCliente());
        }

        /*CONDICION?RESULTADO_TRUE:RESULTADO_FALSE*/
        System.out.println("Introduzca los datos del usuario: ");
        frase = (insercion_o_No ? "" : "(VALOR ACTUAL-->" + cliente.getNombre() + "):");
        System.out.print("Nombre: " + frase);
        clienteAux.setNombre(entrada.nextLine());

        frase = (insercion_o_No ? "" : "(VALOR ACTUAL-->" + cliente.getDireccion() + "):");
        System.out.print("Dirección: " + frase);
        clienteAux.setDireccion(entrada.nextLine());

        frase = (insercion_o_No ? "" : "(VALOR ACTUAL-->" + cliente.getTelefono() + "):");
        System.out.print("Teléfono: " + frase);
        clienteAux.setTelefono(entrada.nextLine());

        frase = (insercion_o_No ? "" : "(VALOR ACTUAL-->" + cliente.getPersona() + "):");
        System.out.print("Persona: " + frase);
        clienteAux.setPersona(entrada.nextLine());

        return clienteAux;
    }

}
