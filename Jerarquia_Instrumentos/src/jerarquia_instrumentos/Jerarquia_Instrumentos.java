package jerarquia_instrumentos;

import java.util.ArrayList;

public class Jerarquia_Instrumentos {

    public static void main(String[] args) {

        ArrayList<InstrumentoCuerda> listaInstrumentos = new ArrayList<>();

        InstrumentoCuerda instrumento1 = new InstrumentoCuerda(4, 65, "Esto es un instrumento cualkiera");
        InstrumentoCuerda instrumento2 = new Guitarra(50f, 6, 7, 54, "Guitarra Clásica");
        InstrumentoCuerda instrumento3 = new Guitarra();
        instrumento3.setNumeroCuerdas(5);
        instrumento3.setDecibelios(49f);
        instrumento3.setDescripcion("Esta guitarra es española");

        ((Guitarra) instrumento3).setLongitudMastil(30);
        ((Guitarra) instrumento3).setNumeroTrastes(6);

        listaInstrumentos.add(instrumento1);
        listaInstrumentos.add(instrumento2);
        listaInstrumentos.add(instrumento3);

        for (InstrumentoCuerda instrumento : listaInstrumentos) {
            System.out.println("El valor de los atributos del objeto es: " + instrumento.toString());
            
        }
        
        for(InstrumentoCuerda instrumento:listaInstrumentos){
            if(instrumento instanceof Guitarra){
                System.out.println(((Guitarra)instrumento).tocarGuitarra());
            }
            
        }

    }

}
