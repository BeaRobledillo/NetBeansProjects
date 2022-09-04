/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
titular y cantidad (puede tener decimales).
El titular será obligatorio y la cantidad es opcional. 
Crea dos constructores que cumpla lo anterior. 
Crea sus métodos get, set y toString. 
Tendrá dos métodos especiales: 
ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, 
si restando la cantidad actual a la que nos pasan es negativa, 
la cantidad de la cuenta pasa a ser 0.
Posteriormente crear un ArrayList que contenga tres cuentas 
y nos muestre el estado de cada uno de los objetos Cuenta.
 */
package ejerciciocuenta;

//clase Cuenta
public class Cuenta {

    //Atributos:
    private String titular;
    private double cantidad;

    //Constructores:
    //constructor x defecto
    public Cuenta() {
    }

    //constructor personalizado
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    //Get & Set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta:{" + "Titular de la cuenta: " + titular + ", Cantidad: " + cantidad + '}';
    }

    //metodo para ingresar dinero
    public void ingresar(double cantidad) { //si la cantidad introducida es negativa, no se hará nada.

        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    //metodo para sacar dinero
    public void retirar(double cantidad) {
        //si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }

}
