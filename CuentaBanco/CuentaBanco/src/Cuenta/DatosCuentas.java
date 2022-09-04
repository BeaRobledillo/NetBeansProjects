package Cuenta;

import java.util.ArrayList;
import java.util.Scanner;

public class DatosCuentas {

    public static void main(String[] args) {
        
        
       
        
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
        
        
        
        
        /* lo que hay ya en esta zona es algo mas maquetado y retocado
        
        Scanner entrada = new Scanner(System.in);
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();
        //metemos tres cuentas en el arraylist
        listaCuentas.add(new Cuenta("Alvaro", 2000));
        listaCuentas.add(new Cuenta("Irene", 1000));
        listaCuentas.add(new Cuenta("Jaime", 0));
        
        //aqui podemos pedir hacer ingresos o retirar dinero de las cuentas que hayamos metido
        //manipulo la tercera para ver que los if funcionan
        double dinero;
        int cuenta;
        
        try {
            
        do{        
        
        System.out.println("Buenos días, introduce un numero para seleccionar la cuenta con la que quieres trabajar:");
        System.out.println("0  para la cuenta de Alvaro");
        System.out.println("1  para la cuenta de Irene");
        System.out.println("2  para la cuenta de Jaime");
        System.out.println("Introduce otro numero para salir");
        
        
        listaCuentas.get(cuenta = entrada.nextInt());
        System.out.println(listaCuentas.get(cuenta));
        entrada.nextLine();//limpiamos buffer porque tras el int vamos a pedir un string
        System.out.println("¿Quieres 'ingresar' o 'retirar' dinero?");
        if (entrada.nextLine().equals("ingresar")){
            System.out.println("¿Cuánto dinero desea ingresar?");
            listaCuentas.get(cuenta).ingresar(dinero = entrada.nextDouble());
            entrada.nextLine();//limpiamos buffer tras el double            
        }else if(entrada.nextLine().equals("retirar")){
            System.out.println("¿Cuanto desea retirar?");
            listaCuentas.get(cuenta).retirar(dinero = entrada.nextDouble());
            entrada.nextLine();//limpiamos buffer tras el double           
        }else{
            System.out.println("No has seleccionado una opcion aceptable, vuelve a empezar");
        }
        System.out.println();//por ejar una linea en blanco
        System.out.println("La situacion de las cuentas es: ");
        System.out.println();//por dejar una linea en blanco
        for (int i = 0; i < listaCuentas.size(); i++) {
            System.out.println(listaCuentas.get(i));            
        }
            System.out.println();
        
        }while(cuenta < 3);
        
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Hasta luego.");
        }
     
        */
    }
    
}
