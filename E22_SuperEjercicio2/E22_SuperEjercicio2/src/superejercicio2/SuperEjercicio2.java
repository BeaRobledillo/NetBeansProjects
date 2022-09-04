
package superejercicio2;

import java.util.ArrayList;


public class SuperEjercicio2 {

   
    public static void main(String[] args) {
        
        ArrayList <Cuenta> misCuentas=new ArrayList<>();
        misCuentas.add(new Cuenta("Luis",2500.50));
        misCuentas.add(new Cuenta("Jorge",2500.50));
        misCuentas.add(new Cuenta("María",2500.50));
        misCuentas.get(0).getCantidad();
        misCuentas.get(1).getCantidad();
        misCuentas.get(2).getCantidad();
        misCuentas.get(1).ingresarDinero(2500);
        misCuentas.get(1).retirarDinero(500);
        misCuentas.get(2).retirarDinero(150);
        System.out.println(misCuentas);
    }
    

    
    
    
}
