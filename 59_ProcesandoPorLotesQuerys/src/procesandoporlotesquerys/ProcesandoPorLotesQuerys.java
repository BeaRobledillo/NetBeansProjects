package procesandoporlotesquerys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcesandoPorLotesQuerys {

    public static void main(String[] args) {

        String bbdd = "hoteles";
        String user = "root";
        String pass = "patata";
        try {

            String cadenaCon = "jdbc:mysql://localhost:3306/" + bbdd;
            Connection conexion = DriverManager.getConnection(cadenaCon, "root", "patata");
            String query = "INSERT INTO cliente (idCliente, nombre, direccion, telefono,persona) VALUES(null,'Juan','Calle Nula','123456789',null)";
            String query2 = "INSERT INTO cliente (idCliente, nombre, direccion, telefono,persona) VALUES(null,'Julia','Calle de Al Lado','123456789','Conserje')";
            String query3 = "INSERT INTO cliente (idCliente, nombre, direccion, telefono,persona) VALUES(null,'Marta','Callejon sin salida','123456789',null)";
            Statement sentencia = conexion.createStatement();
            /*DESACTIVAMOS EL autocommit*/
            conexion.setAutoCommit(false);
            /*AÑADIMOS SENTENCIAS A UN LOTE*/
            sentencia.addBatch(query);
            sentencia.addBatch(query2);
            sentencia.addBatch(query3);
            
            /*En este moemnto podemos tener una visión previa de los cambios que se inducen en la BBDD con la ejecución del lote*/
            int[] registrosAfectados = sentencia.executeBatch();
            for (int i = 0; i < registrosAfectados.length; i++) {
                System.out.println("Filas afectadas en la operación: " + registrosAfectados[i]);
            }

           /*Aplicamos cambios*/
           conexion.commit();

            sentencia.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}