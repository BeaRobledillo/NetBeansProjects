package ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

public class DatosCuentas {

    public static void main(String[] args) {

        
      
        //una manera fácil de hacerlo:
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        //3 cuentas en el ArrayList
        listaCuentas.add(new Cuenta("Bea", 2000));
        listaCuentas.add(new Cuenta("Alberto", 1000));
        listaCuentas.add(new Cuenta("Jorge", 0));

        listaCuentas.get(0).ingresar(2000);//ingresar 2000 a la cuenta de Bea
        listaCuentas.get(2).ingresar(2000);//ingresar 2000 a la cuenta de Alberto, pasa de 0 a 2000
        listaCuentas.get(2).retirar(2500);//Retirar 2500 de Jorge, no se va a poder retirar tanto dinero, tiene menos de 2500

        //muestre el estado de cada uno de los objetos Cuenta
        for (int i = 0; i < listaCuentas.size(); i++) {
            System.out.println(listaCuentas.get(i));

        }
      /*
      //otra forma más completa, tipo app
      //declarar Scanner y ArrayList
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
         //3 cuentas en el ArrayList
        listaCuentas.add(new Cuenta("Bea", 2000));
        listaCuentas.add(new Cuenta("Alberto", 1000));
        listaCuentas.add(new Cuenta("Jorge", 0));

        //aqui podemos pedir hacer ingresos o retirar dinero de las cuentas que hayamos metido
        //manipulo la tercera para ver que los if funcionan
        double dinero;
        int cuenta;

        try {

            do {

                System.out.println("Buenos días, introduzca un número para seleccionar la cuenta:");
                System.out.println("0  para la cuenta de Bea");
                System.out.println("1  para la cuenta de Alberto");
                System.out.println("2  para la cuenta de Jorge");
                System.out.println("Introduzca otro número para salir");

                listaCuentas.get(cuenta = entrada.nextInt());
                System.out.println(listaCuentas.get(cuenta));
                entrada.nextLine();//limpiar buffer
                System.out.println("¿Quiere 'ingresar' o 'retirar' dinero?");
                if (entrada.nextLine().equals("ingresar")) {
                    System.out.println("¿Cuánto dinero desea ingresar?");
                    listaCuentas.get(cuenta).ingresar(dinero = entrada.nextDouble());
                    entrada.nextLine();//limpiar buffer     
                } else if (entrada.nextLine().equals("retirar")) {
                    System.out.println("¿Cuánto dinero desea retirar?");
                    listaCuentas.get(cuenta).retirar(dinero = entrada.nextDouble());
                    entrada.nextLine();//limpiar buffer       
                } else {
                    System.out.println("NO ha seleccionado una opción aceptable, vuelva a comenzar");
                }
                System.out.println();//linea en blanco
                System.out.println("La situación de las cuentas actualmente es: ");
                System.out.println();//linea en blanco
                for (int i = 0; i < listaCuentas.size(); i++) {
                    System.out.println(listaCuentas.get(i));
                }
                System.out.println();

            } while (cuenta < 3);

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Muchas gracias, un saludo.");
        }
*/
    }

}
