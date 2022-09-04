
package superejercicio2;


public class Cuenta {
    private double cantidad;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        if(!titular.equals("")){
            this.titular = titular;
        }
        this.cantidad=cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "cantidad=" + cantidad + ", titular=" + titular + '}';
    }
    public double ingresarDinero(double ingreso){
        
        
        if(ingreso>0){
            cantidad+=ingreso;
        }
        return cantidad;
    }
    public double retirarDinero(double retirada){
        
        if(retirada>0){
            cantidad-=retirada;
        }
        return cantidad;
    } 
}
