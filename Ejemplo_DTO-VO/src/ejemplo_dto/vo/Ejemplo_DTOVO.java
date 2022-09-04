package ejemplo_dto.vo;

import datos.Cliente;
import java.util.ArrayList;
import negocio.Cliente_BO;

public class Ejemplo_DTOVO {

    public static void main(String[] args) {
        //Simulamos la obtención de datos de la BBDD mediante la creación de un ArrayList que le pasamos al objeto BO que crearemos
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente(0, "Alberto", "Calle Alcala", "91991556", "Sergio Oliva"));
        lista.add(new Cliente(1, "Juan", "Calle Loira", "636555231", "Manfred Ulrich"));
        lista.add(new Cliente(2, "Josua", "Calle Cepeda", "699000123", "Juan Vicente Nelson"));
        Cliente_BO clientes = new Cliente_BO(lista);
        //Crear Clientes nuevos mediante la clase Cliente_BO
        clientes.crearCliente(3, "Sebas", "Calle Velero", "654789258", "Silver Patapalo");
        //LECTURA-->podríamos hacer un sout(clientes.leerCliente(1).toString());
        clientes.leerCliente(1);
        //MODIFICAR:TAl y como lo tenemos implementado tenemos que crear un cliente con el miso idCliente que aquel que queremos modificar...
        Cliente clienteModif = new Cliente(3, "NUEVO", "NUEVA DIRECCION", "TELEFONO", "PERSONA");
        clientes.modificarCliente(clienteModif);
        //BORRAR
        clientes.borrarCliente(clientes.leerCliente(2).getIdCliente());
        
        //MOSTRAR TODOS
        for(Cliente cliente:lista){
            System.out.println(cliente.toString());
        }
        
    }

}
