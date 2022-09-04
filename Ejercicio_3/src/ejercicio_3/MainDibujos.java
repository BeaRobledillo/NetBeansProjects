package ejercicio_3;

import java.util.ArrayList;

//clase main
public class MainDibujos {

    public static void main(String[] args) {

        //ARRAYLIST DE DIBUJOS
        ArrayList<DibujoAnimado> listaDibujos = new ArrayList();

        listaDibujos.add(new PatoLucas(4, "Rojo", 8, "Pato Lucas", 1969, "Erez dezzpreciable…"));
        listaDibujos.add(new PedroPicapiedra(20, 120, "sudaméricano", "Pedro Picapiedra", 1970, "Wilmaaa ya estoy en caaasaa!"));

        // recorreListaDibujos();
        Object[] objects = {new PatoLucas(), new PedroPicapiedra()};
        for (DibujoAnimado dibujoanimado : listaDibujos) {
            System.out.println("Hola, soy " + dibujoanimado.getNombre()
                    + ", me gusta decir " + dibujoanimado.getFraseCaracteristica()
                    + ", y mi forma de alegrar al personal es: " + dibujoanimado.alegrarAlPersonal());

        }
    }

}
