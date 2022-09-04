package main_dao_mvc;

import controller.ClienteController;
import model.Cliente;

public class DAO_MVC {

    public static void main(String[] args) {
        //recuperar primero de la BBDD EL ID insertado en ultimolugar y ponerlo como idCliente incrementado
        /*datos de form o de consola...*/
        Cliente cliente = new Cliente(13, "NOMBRE", "DIRECCION", "TELEFONO", "PERSONA");
        
        //DECLARAMOS UN CONTROLLER-->HACE DE INTERMEDIARIO ENTRE VISTA Y MODELO 
        //(EN SU INTERIOR POSEE UN ATRIBUTO VISTA Y UN ATRIBUTO "ILoQueSeaDAO" para conseguirlo
        ClienteController controller = new ClienteController();

        // CREATE
        controller.registrar(cliente);

        // READ
        controller.verClientes();

        // UPDATE
        cliente.setIdCliente(1);//OJO...
        cliente.setNombre("Alberto");
        controller.actualizar(cliente);

        // DELETE
        cliente.setIdCliente(1);//OJO...
        controller.eliminar(cliente);
    }

}
