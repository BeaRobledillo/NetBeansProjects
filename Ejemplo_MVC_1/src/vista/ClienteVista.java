package vista;
/**
 * Esta clase representa una abstracción de la forma de presentar los datos al usuario: consola, interfaz gráfica,...
 * 
 */

public class ClienteVista {

    public void muestraCliente(int idCliente, String nombre, String direccion, String telefono, String persona) {
        System.out.println("Los datos del cliente son:");
        System.out.println("Id: " + idCliente);
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Persona de contacto: " + persona);
        
    }
}
