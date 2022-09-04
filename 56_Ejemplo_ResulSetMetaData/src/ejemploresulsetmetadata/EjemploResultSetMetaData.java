package ejemploresulsetmetadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.SQLException;
import java.sql.Statement;

public class EjemploResultSetMetaData {

    public static void main(String[] args) {
        String bbdd = "hoteles";
        String user = "root";
        String pass = "patata";
        
        try {

            String cadenaCon = "jdbc:mysql://localhost:3306/" + bbdd;
            Connection conexion = DriverManager.getConnection(cadenaCon, user, pass);
            Statement sentencia = conexion.createStatement();
            String querySelect = "SELECT * FROM cliente";
            ResultSet resultados = sentencia.executeQuery(querySelect);
            ResultSetMetaData metaDatos = resultados.getMetaData();
            
            System.out.println("El nombre de las columnas de la tabla cliente:");
            for (int i = 1; i < metaDatos.getColumnCount(); i++) {
                /*Podríamos aprovechar la capacidad que tenemos para saber el número y el nombr de las columnas 
                para solicitar los datos requeridos en una inserción, por ejemplo*/
                System.out.println("Introduzca un valor para " + metaDatos.getColumnName(i) + ": ");
            }

        } catch (SQLException ex) {

        }

    }
}
