package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() {
        Connection conexion = null;

        String usuario = "root";
        String password = "";
        String bbdd="almacen";
        
        String url = "jdbc:mysql://localhost:3306/"+bbdd;
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
            if (conexion != null) {
                System.out.println("Conectado a la BBDD");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return conexion;
    }

}