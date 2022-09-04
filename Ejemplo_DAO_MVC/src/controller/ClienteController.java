package controller;

import dao.ClienteDAO;
import idao.iClienteDAO;
import java.util.ArrayList;
import model.Cliente;
import view.ClienteView;

public class ClienteController {

    ClienteView vistaCliente = new ClienteView();
    iClienteDAO dao = new ClienteDAO();//DEBEMOS CREAR UN NUEVO DAO EN CADA MÉTODO???

    /*insertamos cliente: CREATE*/
    public void registrar(Cliente cliente) {
        dao.insertarCliente(cliente);
    }
//llama al DAO para obtener todos los clientes y luego los muestra en la vista

    public void verClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes = dao.leerClientes();
        vistaCliente.verClientes(clientes);
    }

    //llama al DAO para actualizar un cliente
    public void actualizar(Cliente cliente) {
        dao.modificarCliente(cliente);
    }

    //llama al DAO para eliminar un cliente
    public void eliminar(Cliente cliente) {
        dao.borrarCliente(cliente);
    }

}
