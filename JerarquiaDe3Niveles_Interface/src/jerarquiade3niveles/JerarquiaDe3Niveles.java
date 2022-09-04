package jerarquiade3niveles;

import java.util.ArrayList;

public class JerarquiaDe3Niveles {

    public static void main(String[] args) {

        //ArrayList de Animales
        ArrayList<Animal> listaAnimales = new ArrayList<>();

        //nuevos objetos de tipos de animales
        Animal animalLoro = new Loro();
        animalLoro.setComida("Alpiste");
        Animal gallinita = new Gallina();
        //Animal tigreton=new Tigre();

        //ArrayList de Mascotas
        ArrayList<Mascotable> listaMascotas = new ArrayList<>();
        Mascotable HumanoPedro = new Humano(60, "Pedrito");

        Leon leoncio = new Leon();
        leoncio.setComida("Chicha");

        Gato pelusa = new Gato();
        pelusa.setComida("latita");

        //System.out.println("El animal " + leoncio + " come: " + leoncio.getComida());
        // System.out.println("El animal " + pelusa + " come: " + pelusa.getComida());
        //System.out.println("El animal "+ animalLoro+ " come: "+ animalLoro.getComida());
        listaAnimales.add(leoncio);
        listaAnimales.add(animalLoro);
        listaAnimales.add(pelusa);
        listaAnimales.add(gallinita);

        listaMascotas.add(HumanoPedro);

        //foreach ejecurando los dos metodos abstractos mas el toString()
        for (Animal animal : listaAnimales) {
            System.out.println("El valor de los atributos del objeto es: " + animal.toString());
            System.out.println("El valor de cómo se mueve es: " + animal.comoSeMueve());
            //System.out.println("El valor de " + animal.toString());
            System.out.println("El valor de cómo come es: " + animal.comer());
            System.out.println("La comida que come es: " + animal.getComida());
            System.out.println("Su habitat es: " + animal.getVivir());
        }

        for (Animal animal : listaAnimales) {
            if (animal instanceof Gato) {
                System.out.println(((Gato) animal).getRugido());

            }

        }

        for (Mascotable mascota : listaMascotas) {
            System.out.println("El valor del humano es: " + HumanoPedro.toString());
            System.out.println("Su forma de comer es: " + HumanoPedro.comer());
            System.out.println("Su forma de moverse es: " + HumanoPedro.comoSeMueve());
        }
    }

}
