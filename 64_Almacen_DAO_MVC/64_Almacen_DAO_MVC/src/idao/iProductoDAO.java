package idao;

import java.util.ArrayList;
import model.Producto;

public interface iProductoDAO {

    public boolean insertarProducto(Producto producto);//Create

    public ArrayList<Producto> leerProductos();//Read

    public boolean modificarProducto(Producto producto);//Update

    public boolean borrarProducto(Producto producto);//Delete

}
