package controlador;
/**
 * CONTROLADOR: declaramos e implementamos el comportamiento que conecta la vista con el modelo
 * - Declaramos un atributo de tipo vista
 * - Declaramos un atributo de tipo modelo
 * - Métodos para cambiar/obtener datos del modelo: set() y get() de los atributos de la clase del modelo (Cliente) a través del atributo modelo declarado en esta clase
 * - Métodos CRUD (lógica de negocio)
 */
import modelo.Cliente;
import vista.ClienteVista;

public class ClienteControlador {
    //Declaramos un objeto del tipo ClienteVista y un objeto del tipo Cliente (modelo) para unir ambos a través del
    //presente controlador de Cliente

    private ClienteVista clienteVista;
    private Cliente clienteModelo;

    public ClienteControlador(ClienteVista clienteVista, Cliente clienteModelo) {
        this.clienteVista = clienteVista;
        this.clienteModelo = clienteModelo;
    }

    public int getIdCliente() {
        return clienteModelo.getIdCliente();
    }

    public void setIdCliente(int idCliente) {
        this.clienteModelo.setIdCliente(idCliente);
    }

    public String getNombre() {
        return clienteModelo.getNombre();
    }

    public void setNombre(String nombre) {
        this.clienteModelo.setNombre(nombre);
    }

    public String getDireccion() {
        return clienteModelo.getDireccion();
    }

    public void setDireccion(String direccion) {
        this.clienteModelo.setDireccion(direccion);
    }

    public String getTelefono() {
        return clienteModelo.getTelefono();
    }

    public void setTelefono(String telefono) {
        this.clienteModelo.setTelefono(telefono);
    }

    public String getPersona() {
        return clienteModelo.getPersona();
    }

    public void setPersona(String persona) {
        this.clienteModelo.setPersona(persona);
    }
    /*MOSTRAMOS UN CLIENTE*/
    public void verCliente() {
        clienteVista.muestraCliente(clienteModelo.getIdCliente(), clienteModelo.getNombre(), clienteModelo.getDireccion(), clienteModelo.getTelefono(), clienteModelo.getPersona());
    }
    /*EN EL CONTROLADOR SE SITÚAN TODOS LOS MÉTODOS QUE IMPLEMENTEN CRUD*/
    public void insertarCliente(){}
    public void modificarCliente(){}
    public void eliminarCliente(){}
}
