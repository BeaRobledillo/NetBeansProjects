package ejemplo_mvc_1;

import controlador.CategoriaControlador;
import controlador.ClienteControlador;
import modelo.Categoria;
import modelo.Cliente;
import vista.CategoriaVista;
import vista.ClienteVista;

public class Ejemplo_MVC_1 {

    public static void main(String[] args) {
        /*Cada controlador de la aplicación se relaciona (une la funcionalidad) de:
        1.  Un objeto de tipo Modelo (Clase Java que será representada por una tabla de la BBDD)
        2.  Un obejto de tipo Vista (Clase que presenta los datos por consola, en un JPanel, etc, es flexible y no influye sobre Modelo y Controlador)
         */
        /**************EJEMPLO DE MANEJO DE CLIENTE**********************************/
        Cliente modelo = recuperarCrearCliente();//aquí deberíamos llamar a consulta en BBDD
        ClienteVista vista = new ClienteVista();
        ClienteControlador controlador = new ClienteControlador(vista,modelo);
        /**************EJEMPLO DE MANEJO DE CLIENTE**********************************/
        Categoria modeloCategoria = recuperarCategoria();
        CategoriaVista vistaCategoria = new CategoriaVista();
        CategoriaControlador controladorCategoria = new CategoriaControlador(vistaCategoria, modeloCategoria);
        
        

        /*
        A partir de aquí el funcionamiento de la aplicación es el siguiente:
        * 1. Cada vez que queramos presentar algo, el controlador será el encargado de hacerlo mediante el atributo vista.
        * 2. Si se producen cambios, el controlador será quien los inicie tras recibir la orden del usuario a través de la vista
        * 3. A través del atributo modelo se implementan los cambios
        * 4. Se actualiza la vista        
        */
        /*MOSTRAMOS LOS DATOS DEL CLIENTE: Controlador--> Vista*/
        controlador.verCliente();

        /*MODIFICAMOS LOS DATOS DEL CLIENTE: Controlador--> Modelo*/
        controlador.setNombre("Luis");
        /*ACTUALIZAMOS LA VISTA CON LOS NUEVOS DATOS DEL CLIENTE: Controlador-->Vista*/
        controlador.verCliente();
        
        controladorCategoria.verCategoria();
        controladorCategoria.setDescripcion("Esta categoría ha cambiado");
        controladorCategoria.verCategoria();
    }
    

    private static Cliente recuperarCrearCliente() {
        Cliente clienteAux = new Cliente(157, "Alberto", "Calle Avellaneda", "91555666222", "Luis Fierro");
        //En este punto no tenemos en cuenta si el cliente va a persistir en/viene de una BBDD, un fichero,...

        return clienteAux;
    }
    
    
    private static Categoria recuperarCategoria(){
        Categoria categoriaAux = new Categoria(3, 21f, "Nueva Categoria");
        return categoriaAux;
    }
}
