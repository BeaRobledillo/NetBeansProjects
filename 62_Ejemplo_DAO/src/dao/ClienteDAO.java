package dao;

import interfacesdao.iClienteDAO;
import java.util.ArrayList;
import modelo.Cliente;

public class ClienteDAO implements iClienteDAO {

    ArrayList<Cliente> listaClientes;

    public ClienteDAO() {
    }

    public ClienteDAO(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    @Override
    public void insertarCliente(int idCliente, String nombre, String direccion, String telefono, String persona) {
        Cliente clienteNuevo = new Cliente(idCliente, nombre, direccion, telefono, persona);
        listaClientes.add(clienteNuevo);
    }

    @Override
    public ArrayList<Cliente> leerClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente leerCliente(int idCliente) {
        Cliente result = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                result = cliente;
            }
        }
        return result;
    }

    @Override
    public void modificarCliente(Cliente cliente) {
         Cliente clienteModificar = leerCliente(cliente.getIdCliente());

        clienteModificar.setNombre(cliente.getNombre());
        clienteModificar.setDireccion(cliente.getDireccion());
        clienteModificar.setTelefono(cliente.getTelefono());
        clienteModificar.setPersona(cliente.getPersona());
    }

    @Override
    public void borrarCliente(Cliente cliente) {
        Cliente clienteBorrar = leerCliente(cliente.getIdCliente());
        listaClientes.remove(clienteBorrar);
    }

}
