package Cuenta;

public class Cuenta {

        private String titular;
        private double cantidad;

    public Cuenta() {
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

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
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
        
    public void ingresar(double dinero){
        /*(double dinero) hace referencia al numero que meteremos cuando en la main 
        demos a ingresar un valor*/
        if (dinero >= 0){
            cantidad = cantidad + dinero;
            System.out.println("El saldo actual tras el ingreso es: "+cantidad);
        }else{
            System.out.println("Su saldo inicial esta por debajo de 0, no podemos ingresar dinera, acuda a su sucursal mas cercana.");
            
        }
    }
    
    public void retirar(double dinero){
        if (cantidad - dinero > 0){
            cantidad = cantidad - dinero;
            System.out.println("El saldo de la cuenta tras la retirada es: "+ cantidad);
        }else{
            System.out.println("No se puede retirar tanto dinero");
        }
    }
            
}
