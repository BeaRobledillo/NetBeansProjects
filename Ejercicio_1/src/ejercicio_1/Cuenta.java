package ejercicio_1;

public class Cuenta {

    //atributos:
    private String titular; //obligatorio
    private double cantidad; //opcional (con decimales)

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

    //metodo toString
    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

    //metodo ingresar
    /*se ingresa una cantidad a la cuenta, si la cantidad introducida es
    negativa, no se hará nada*/
    public void ingresar(double dinero) {
        /*(double dinero) hace referencia al numero que meteremos cuando en la main 
        demos a ingresar un valor*/
        if (dinero >= 0) {
            cantidad = cantidad + dinero;
            System.out.println("El SALDO ACTUAL tras hacer el ingreso es de: " + cantidad);
        } else {
            System.out.println("Su SALDO INCIAL está por debajo de 0, no podemos ingresar dinero.");

        }
    }

    //metodo retirar
    public void retirar(double dinero) {
        //double cantidad
        /*se retira una cantidad a la cuenta, si restando la cantidad actual a
        la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.*/
        if (cantidad - dinero > 0) {
            cantidad = cantidad - dinero;
            System.out.println("El SALDO tras la retirada de dinero es de: " + cantidad);
        } else {
            System.out.println("NO se puede retirar tanta cantidad de dinero.");
        }
    }

}
