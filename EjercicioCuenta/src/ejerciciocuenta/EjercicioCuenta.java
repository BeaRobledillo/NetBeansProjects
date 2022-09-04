package ejerciciocuenta;

//importaciones
import java.util.ArrayList;

public class EjercicioCuenta {

    //main
    public static void main(String[] args) {

        ArrayList<Cuenta> arraylistCuenta = new ArrayList<>();
        //metemos tres cuentas y nos muestre el estado de cada uno de los objetos Cuenta
        System.out.println("Cuentas: ");
        arraylistCuenta.add(new Cuenta("Pedro", 100.0));
        arraylistCuenta.add(new Cuenta("Juan", 200.0));
        arraylistCuenta.add(new Cuenta("Pedro Juan", 250.0));

        for (int i = 0; i < arraylistCuenta.size(); i++) {
            System.out.println(arraylistCuenta.get(i).toString());

        }

        //Ingresar dinero en las cuentas para probar
        arraylistCuenta.get(0).ingresar(200.00);
        arraylistCuenta.get(1).ingresar(200.00);
        arraylistCuenta.get(2).ingresar(200.00);

        //Retirar dinero de las cuentas para probar
        arraylistCuenta.get(0).retirar(0.00);
        arraylistCuenta.get(1).retirar(200.00);
        arraylistCuenta.get(2).retirar(200.00);

        //Mostrar todas las cuentas actualizadas
        System.out.println("");
        System.out.println("Cuentas Actualizadas: ");
        System.out.println(arraylistCuenta.toString());
    }

}
