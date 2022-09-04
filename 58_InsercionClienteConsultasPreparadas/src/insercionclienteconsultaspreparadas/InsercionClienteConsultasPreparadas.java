package insercionclienteconsultaspreparadas;

import conexion.Conexion;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsercionClienteConsultasPreparadas {

    public static void main(String[] args) {
        try {
            /*1. Conexión al servidor y BBDD*/
            Connection conexion = Conexion.conectar();
            /*2. Definimos la consulta preparada en una cadena*/
            String sql = "INSERT INTO cliente(idCliente, nombre, direccion,telefono,persona) VALUES(null,?,?,?,?)";
            /*3. Declaramos objeto PreparedStatement*/
            PreparedStatement sentenciaP = conexion.prepareStatement(sql);
            /*4. ITERAMOS SOBRE EL ARCHIVO DE CARA A COMPLETAR TANTAS LLAMADAS A LOS MÉTODOS setX() del objeto sentenciaP como sean necesarios*/
            /**
             * Para ejecutar los métodos setX() podemos pasar el objeto
             * sentenciaP de tipo PreparedStatement a un método que: - recorra
             * el archivo por líneas - saque cada uno de los datos que debemos
             * especificar para concretar la consulta preparada - ejecute la
             * consulta
             */
            ejecutarConsultasPreparadas(sentenciaP);
            /*5. liberamos los recursos de la conexión y la sentencia preparada*/
            sentenciaP.close();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Problemas en la inserción de clientes.");
            ex.printStackTrace();
        }
    }

    public static void ejecutarConsultasPreparadas(PreparedStatement sentenciaP) throws SQLException {
        File archivo = new File("src/insercionclienteconsultaspreparadas/datos");
        try {
            Scanner entrada = new Scanner(archivo);
            entrada.useDelimiter("@");
            while (entrada.hasNext()) {

                sentenciaP.setString(1, entrada.next());
                sentenciaP.setString(2, entrada.next());
                sentenciaP.setString(3, entrada.next());
                sentenciaP.setString(4, entrada.nextLine().replace("@", ""));
                /*SI QUEREMOS VER LA CONSULTA QUE SE EJECUTARÁ:*/
                System.out.println(sentenciaP.toString());
                //////////////////////////////////////////////////
                sentenciaP.executeUpdate();
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo de datos no encontrado...");
            ex.printStackTrace();
        }

    }

}
