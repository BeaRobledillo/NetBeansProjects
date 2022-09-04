package consultaspreparadas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasPreparadas {

    public static void main(String[] args) {

        String bbdd = "hoteles";
        String user = "root";
        String pass = "";
        try {

            String cadenaCon = "jdbc:mysql://localhost:3306/" + bbdd;
            Connection conexion = DriverManager.getConnection(cadenaCon, "root", "");
            /*DEJAMOS LA ESTRUCUTURA DE LO QUE SERÁ UNA SENTECIA DE INSERCIÓN PREPARADA*/
            /*en esta sentencia nada cambia a excepción del valor de cada uno de los datos de cada cliente*/
            PreparedStatement sentenciaPreparada = conexion.prepareStatement("INSERT INTO cliente (idCliente, nombre, direccion, telefono,persona) VALUES(null,?,?,?,?)");

            /*A CONTINUACIÓN, SOLO DEBEMOS CONCRETAR EL VALOR DE CADA DATO QUE REALMENTE DESEEMOS INSERTAR*/
            //sentenciaPreparada.setInt(1, 1);//El idCliente en la BBDD está definido como autoincremental, por tanto la BBDD puede realizar la operación por nosotros
            sentenciaPreparada.setString(1, "Alberto Otra vez");
            sentenciaPreparada.setString(2, "Calle desconocida");
            sentenciaPreparada.setString(3, "9152632145");
            sentenciaPreparada.setString(4, "Pregunte por el conserje...");
            sentenciaPreparada.executeUpdate();

            System.out.println(sentenciaPreparada.getUpdateCount());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
