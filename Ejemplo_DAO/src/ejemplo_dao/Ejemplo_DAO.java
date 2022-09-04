package ejemplo_dao;

import dao.ClienteDAO;
import interfacesdao.iClienteDAO;
import java.util.ArrayList;
import modelo.Cliente;

public class Ejemplo_DAO {

    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente(0, "Alberto", "Calle Alcala", "91991556", "Sergio Oliva"));
        lista.add(new Cliente(1, "Juan", "Calle Loira", "636555231", "Manfred Ulrich"));
        lista.add(new Cliente(2, "Josua", "Calle Cepeda", "699000123", "Juan Vicente Nelson"));
        
        //Si no proveemos de una lista al DAO, podemos ejecutar su constructor por defecto e invocar al método leerClientes
        iClienteDAO clientes = new ClienteDAO(lista);
        
        clientes.insertarCliente(3, "Sebas", "Calle Velero", "654789258", "Silver Patapalo");
        //LECTURA-->podríamos hacer un sout(clientes.leerCliente(1).toString());
        clientes.leerCliente(1);
        //MODIFICAR:TAl y como lo tenemos implementado tenemos que crear un cliente con el miso idCliente que aquel que queremos modificar...
        Cliente clienteModif = new Cliente(3, "NUEVO", "NUEVA DIRECCION", "TELEFONO", "PERSONA");
        clientes.modificarCliente(clienteModif);
        //BORRAR
        clientes.borrarCliente(clientes.leerCliente(2));
        
        //MOSTRAR TODOS
        for(Cliente cliente:lista){
            System.out.println(cliente.toString());
        }
    }

}
