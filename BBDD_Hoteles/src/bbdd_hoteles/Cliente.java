package bbdd_hoteles;

public class Cliente {

    //atributos
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String persona;
    //constructor x defecto

    public Cliente() {
    }

    //constructor personalizado
    public Cliente(int idCliente, String nombre, String direccion, String telefono, String persona) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.persona = persona;
    }

    //get & set
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

}
