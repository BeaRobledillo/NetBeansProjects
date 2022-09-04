package interfacesdao;

import java.util.ArrayList;
import modelo.Cliente;

/**
 * Esta interfaz declara una serie de comportamientos que suponen "un contrato"
 * para las clases que implementen dicha interfaz Una clase que implementa una
 * interfaz está obligada a implementar todos los métodos declarados en ella De
 * esta forma, Objetos de la clase interfaz podrán ser utilizados como objetos
 * representantes de los objetos que implementan los métodos declarados en la
 * Interfaz-->Herencia de interfaces Los métodos declarados serán los métodos
 * CRUD
 *
 * @author teide
 */
public interface iClienteDAO {

    public void insertarCliente(int idCliente, String nombre, String direccion, String telefono, String persona);//Create

    public ArrayList<Cliente> leerClientes();//Read

    public Cliente leerCliente(int idCliente);//Read

    public void modificarCliente(Cliente cliente);//Update

    public void borrarCliente(Cliente cliente);//Delete
}
