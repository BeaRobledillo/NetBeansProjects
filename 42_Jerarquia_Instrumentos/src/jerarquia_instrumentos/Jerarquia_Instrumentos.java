package jerarquia_instrumentos;

import java.util.ArrayList;


public class Jerarquia_Instrumentos {

    public static void main(String[] args) {

        
        ArrayList<InstrumentoCuerda> listaInstrumentos = new ArrayList<>();
        InstrumentoCuerda instrumento1 = new InstrumentoCuerda(4, 65, "Esto es un instrumento cualquiera");
        InstrumentoCuerda instrumento2 = new Guitarra(50f, 6, 7, 54, "Guitarra Clásica");
        /*Creamos una guitarra sin valores en los atributos*/
        InstrumentoCuerda instrumento3 = new Guitarra();//POLIMORFISMO: se espera algo de la clase ancestra y le pasamos algo de clase derivada
        /*Realizamos la inicialización de los atributos heredados mediante la invocación a los métodos set*/
        instrumento3.setNumeroCuerdas(5);
        instrumento3.setDecibelios(49f);
        instrumento3.setDescripcion("Esta guitarra es española");
        /*Para realizar la inicialización de los atributos propios de la clase Guitarra debemos llevar a cabo un casting de tipos(DOWNCASTING)*/
        ((Guitarra)instrumento3).setLongitudMastil(30);
        ((Guitarra)instrumento3).setNumeroTrastes(6);
        
        listaInstrumentos.add(instrumento1);
        listaInstrumentos.add(instrumento2);
        listaInstrumentos.add(instrumento3);
        
        /*ENLAZADO DINÁMICO DE MÉTODOS*/
        /*Realizamos el recorrido por la lista de instrumentos invocando al método toString()--> ENLAZADO DINÁMICO DE MÉTODOS*/
        for (InstrumentoCuerda instrumento : listaInstrumentos) {
            System.out.println("El valor de los atributos del objeto es: " + instrumento.toString());
        }
        /*OPERADOR instanceof*/
        /*Cuando deseemos ejecutar un método presente solo en determinados niveles de la jerarquía deberemos 
        utilizar el operadro instanceof para asegurarnos de que la referencia que estamos utilizando para ejecutar el método es del tipo adecuado*/
        for(InstrumentoCuerda instrumento : listaInstrumentos){
            if(!(instrumento instanceof Guitarra)){//Esto implica que nuestro Instrumento no es de tipo Guitarra
                //Este método se ejecutará en la primera posición de la lista
                System.out.println((instrumento).tocarIntrumentoCuerda());
            }
            if(instrumento instanceof Guitarra){
                //Este método se ejecutará en las dos últimas posiciones de la lista
                System.out.println(((Guitarra)instrumento).tocarGuitarra());
            }
        }
        
        
        
        
        
    }

}
