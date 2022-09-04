package view;

import java.util.ArrayList;
import model.Cliente;

public class ClienteView {

    public void verCliente(Cliente cliente) {
        System.out.println("Tenemos los siguientes datos del cliente: ");
        System.out.println(cliente);
    }

    public void verClientes(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Cliente : " + cliente);
        }
    }
}
