package idao;

import java.util.ArrayList;
import model.Cliente;

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

    public boolean insertarCliente(Cliente cliente);//Create

    public ArrayList<Cliente> leerClientes();//Read

    public boolean modificarCliente(Cliente cliente);//Update

    public boolean borrarCliente(Cliente cliente);//Delete
}
