package jerarquiadinosaurios;

import java.util.ArrayList;

public class JerarquiaDinosaurios {

    public static void main(String[] args) {
        ArrayList<Dinosaurio> arraylistDinosaurios = new ArrayList<>();
        //metemos diferentes dinosaurios en el arrayList:
        arraylistDinosaurios.add(new Dinosaurio("dino1", 12, 4, "carnívoro"));
        arraylistDinosaurios.add(new Tiranosaurio(34, 62, "TRex", 13, 4, "carnívoro"));
        arraylistDinosaurios.add(new Pterodactilo(7.8f, 120, "Ptero_1", 7, 2, "herbívoro"));
        arraylistDinosaurios.add(new Dinosaurio("dino2", 22, 2, "omnívoro"));

        for (int i = 0; i < arraylistDinosaurios.size(); i++) {
            /*Debido a que cada una de clas clases de la jerarquía implementa el método toString() de forma particular
            no debemos tener reparo en invocar el método toString() de cada posición del  arrayList debido a que el tipo 
            actual de la referencia del elemento en cuestión ejecutará el método toString() adecuado a cada tipo de objeto
             */
            System.out.println("Vamos a mostrar el estado de los objetos del ArrayList:");
            System.out.println(arraylistDinosaurios.get(i).toString());
            System.out.println("");
            System.out.println("Vamos a ejecutar el métod final soyDinosaurio() que todos los elementos poseen: \n"
                    + "unos por propia posesión y otros por herencia, AUNQUE NO PUEDAN REDEFINIRLO");

            arraylistDinosaurios.get(i).soyDinosaurio();
            System.out.println("");
            
            System.out.println("Vamos a ejecutar métodos propios de las clases derivadas, debemos tener cuidado \n"
                    + "con que el tipo actual de la referencia del elemento del ArrayList que visitamos sea el adecuado \n"
                    + "para la ejecución del método (para ello preguntamos mediante el operador instanceOf");
            if (arraylistDinosaurios.get(i) instanceof Pterodactilo) {
                ((Pterodactilo) arraylistDinosaurios.get(i)).soyPterodactilo();
            } else if (arraylistDinosaurios.get(i) instanceof Tiranosaurio) {
                ((Tiranosaurio) arraylistDinosaurios.get(i)).romperValla();
            }

        }

    }
}
