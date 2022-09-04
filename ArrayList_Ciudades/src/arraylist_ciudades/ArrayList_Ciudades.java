package arraylist_ciudades;

import java.util.ArrayList;

public class ArrayList_Ciudades {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        //el Arraylist contiene [Madrid]
        ciudades.add("Paris");
        //el Arraylist contiene [Madrid,París]
        ciudades.add("Londres");
        //el Arraylist contiene [Madrid,París,Londres]
        ciudades.add("New York");
        //el Arraylist contiene [Madrid,París,Londres,New York]
        System.out.println("¿Cual es el tamaño de la lista? "
                + ciudades.size());
        System.out.println("¿Está Miami en la lista? "
                + ciudades.contains("Miami"));
        System.out.println("¿Cual es el lugar de Londres en la lista? "
                + ciudades.indexOf("Londres"));
        System.out.println("¿La listaestá vacía? "
                + ciudades.isEmpty());
        //insertamos en la posición 2 un nuevo elemento
        ciudades.add(2, "Segovia");
        //el Arraylist contiene [Madrid,París,Segovia,Londres,New York]

        //borramos Madrid de la lista
        ciudades.remove("Madrid");
        //borramos el elemento con índice 3
        ciudades.remove(3);

        //imprimimos el ArrayList de ciudades
        System.out.println(ciudades.toString());

    }

}
