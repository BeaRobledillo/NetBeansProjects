package jerarquia_abstracta_vehiculos;

import java.util.ArrayList;

public class Jerarquia_Abstracta_Vehiculos {

    public static void main(String[] args) {
        /*Vamos a crear una estructura capaz de contener elementos de la jerarquía: nos conviene generalizar y
        por tanto crear una estructura càpaz de contener elementos del tipo general. Mediante el polimorfismo y el enlazado dinámico
        de métodos seremos capaces de ejecutar los métodos presentes en todas las clases (en la clase general
        el método estará definido como abstracto)*/
        
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        //NO SE PUEDEN CREAR INSTANCIAS DE CLASES ABSTRACTAS:
        //NO PUEDO REALIZAR ESTO: listaVehiculos.add(new Vehiculo());
        
        listaVehiculos.add(new Bicicleta(2, 2, 0, "Manillar recto"));
        listaVehiculos.add(new Coche("electrico", 4, 0, "Esto lleva volante"));
        listaVehiculos.add(new Moto(65f, 2, 4, "Manillar custom"));
        
        for (Vehiculo vehiculo:listaVehiculos) {
            /*la invocación al método toString() es un ejemplo del enlazado dinámico de métodos que mediante 
            polimorfismo favorece la generalización del software implementado*/
            System.out.println(vehiculo.toString());
            /*la invocación del método acelerar() es un ejemplo de cómo la definición de métodos abstractos en las 
            clases ancestras de la jerarquía (junto con el enlazado dinámico de métodos y el polimorfismo) favorecen
            la sencillez del código y la menor utilización lde operador instanceof*/            
            System.out.println(vehiculo.acelerar());
        }
    }

}
