package pruebabbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaBBDD {

    public static void main(String[] args) {
        /*
        1. Descargar el driver para conectar Java con SGBD (trabajamos con JDBC)
        -->https://dev.mysql.com/downloads/connector/j/
        2. Añadir la librería con el driver al proyecto
        -->botón derecho en Librerías->Añadir JAR/Folder y buscamos el archivo "jar"
        3. Registrar el driver desde el código del programa
        --> Class.forName("com.mysql.jdbc.Driver");
        4. Construir la URL de conexión
        -->String cadenaCon = "jdbc:mysql://localhost:3306/prueba";
        5. Crear el objeto Connection con la URL anterior
        -->Connection conexion = DriverManager.getConnection(cadenaCon, "root", "patata");
        6. Crear el objeto Statement para lanzar las query a la BBDD
        -->Statement sentencia = conexion.createStatement();
        7. Ejecutar la query a través del objeto Statement y recuperar los datos en un Resulset (si la query es una consulta)
        --> ResultSet resultados = sentencia.executeQuery(query);//La query se crea en una cadena antes!!!
        8. Liberar los recursos (cerrar Statement y Conncetion)
         */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.print("ClassNotFoundException" + ex.getMessage());
        }

        try {
            String cadenaCon = "jdbc:mysql://localhost:3306/prueba";
            Connection conexion = DriverManager.getConnection(cadenaCon, "root", "");
            Statement sentencia = conexion.createStatement();
            String query = "SELECT * FROM tabla1";
            ResultSet resultados = sentencia.executeQuery(query);
            /*MOSTRAMOS LOS RESULTADOS*/
            System.out.println("Tenemos los siguientes datos en la tabla:");
            while (resultados.next()) {
                System.out.print(resultados.getInt("campo1") + " ");//Acceso mediante nombre columna
                System.out.print(resultados.getInt(2) + " ");           //Acceso mediante índice columna
                System.out.println(resultados.getInt("campo3") + " ");
            }
            sentencia.close();
            conexion.close();
        } catch (SQLException ex) {
            System.err.print("SQLException: " + ex.getMessage());
        }

    }
}