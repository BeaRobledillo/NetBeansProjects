package negocio;

import datos.Cliente;
import java.util.ArrayList;

/**
 *  * EQUIVALENTE AL CONTROLADOR EN EL PATRÓN MVC
 * ---------------------------------------------------- En este paquete se
 * incluyen los denominados BUSINESS OBJECT (OBJETOS DE NEGOCIO-->CRUD) Accede a
 * la BBDD e implementa los métodos CRUD
 *
 */
public class Cliente_BO {

    //VISIBILIDAD DE PAQUETE...
    /*SIMULAMOS LOS CLIENTES CONTENIDOS EN LA BBDD CON UN ARRAYLIST DE CLIENTES:*/
    ArrayList<Cliente> listaClientes;

    public Cliente_BO() {
    }

    public Cliente_BO(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Creación de clientes: CREATE
    public void crearCliente(int idCliente, String nombre, String direccion, String telefono, String persona) {
        Cliente clienteNuevo = new Cliente(idCliente, nombre, direccion, telefono, persona);
        listaClientes.add(clienteNuevo);
    }

    //Lectura de un Cliente: READ
    public Cliente leerCliente(int idCliente) {
        Cliente result = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == idCliente) {
                result = cliente;
            }
        }
        return result;
    }

    //Modificación de un Cliente: UPDATE
    public void modificarCliente(Cliente cliente) {
        Cliente clienteModificar = leerCliente(cliente.getIdCliente());

        clienteModificar.setNombre(cliente.getNombre());
        clienteModificar.setDireccion(cliente.getDireccion());
        clienteModificar.setTelefono(cliente.getTelefono());
        clienteModificar.setPersona(cliente.getPersona());
    }

    //Borrado de Cliente:DELETE
    public void borrarCliente(int idCliente) {
        Cliente clienteBorrar = leerCliente(idCliente);
        listaClientes.remove(clienteBorrar);
    }
}
